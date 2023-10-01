
package EjemploDAO;

import java.util.Scanner;
import DAO.PersonaDAO;
import DAO.PersonaDAOImp;
import Model1.Persona;

public class Trabajo1 {
   
    public static void main(String[] args) {
        
        PersonaDAO personaDAO = new PersonaDAO();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Elige una opción:");
            System.out.println("1. Crear persona");
            System.out.println("2. Leer persona");
            System.out.println("3. Actualizar persona");
            System.out.println("4. Eliminar persona");
            System.out.println("5. Salir");
            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    // Crear una persona
                    Persona persona1 = new Persona();
                    System.out.println("Ingrese el ID:");
                    persona1.setId(scanner.nextInt());
                    System.out.println("Ingrese el nombre:");
                    persona1.setNombre(scanner.next());
                    System.out.println("Ingrese la edad:");
                    persona1.setEdad(scanner.nextInt());
                    personaDAO.crear(persona1);
                    System.out.println("Persona creada exitosamente.");
                    break;

                case 2:
                    // Leer una persona
                    System.out.println("Ingrese el ID de la persona a leer:");
                    int idLeer = scanner.nextInt();
                    Persona personaLeida = personaDAO.leer(idLeer);
                    if (personaLeida != null) {
                        System.out.println("Persona leída: " + personaLeida.getNombre());
                    } else {
                        System.out.println("Persona no encontrada.");
                    }
                    break;

                case 3:
                    // Actualizar una persona
                    Persona personaNueva = new Persona();
                    System.out.println("Ingrese el ID de la persona a actualizar:");
                    int idActualizar = scanner.nextInt();
                    personaNueva.setId(idActualizar);
                    System.out.println("Ingrese el nuevo nombre:");
                    personaNueva.setNombre(scanner.next());
                    System.out.println("Ingrese la nueva edad:");
                    personaNueva.setEdad(scanner.nextInt());
                    personaDAO.actualizar(idActualizar, personaNueva);
                    System.out.println("Persona actualizada exitosamente.");
                    break;

                case 4:
                    // Eliminar una persona
                    System.out.println("Ingrese el ID de la persona a eliminar:");
                    int idEliminar = scanner.nextInt();
                    personaDAO.eliminar(idEliminar);
                    System.out.println("Persona eliminada exitosamente.");
                    break;

                case 5:
                    // Salir del programa
                    scanner.close();
                    System.exit(0);
                    break;

                default:
                    System.out.println("Opción no válida. Por favor, elige una opción válida.");
            }
        }
    }
}
