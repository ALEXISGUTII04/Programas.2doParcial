package DAO;

import Model1.Persona;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class PersonaDAO implements PersonaDAOImp {

    private String archivo = "C:\\Users\\si\\OneDrive\\Documentos\\CODIGOS/persona.txt";

    @Override
    public void crear(Persona persona) {
        List<Persona> personas = listarPersonas();

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(archivo))) {
            personas.add(persona);
            // Escribir cada persona individualmente en el archivo
            for (Persona p : personas) {
                oos.writeObject(p);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @Override
    public Persona leer(int id) {
        List<Persona> personas = listarPersonas();

        for (Persona persona : personas) {
            if (persona.getId() == id) {
                return persona;
            }
        }

        return null;
    }

    @Override
    public void actualizar(int id, Persona nuevaPersona) {
        List<Persona> personas = listarPersonas();

        for (int i = 0; i < personas.size(); i++) {
            if (personas.get(i).getId() == id) {
                personas.set(i, nuevaPersona);

                try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(archivo))) {
                    oos.writeObject(personas);
                } catch (IOException e) {
                    e.printStackTrace();
                }

                return;
            }
        }
    }

    @Override
    public void eliminar(int id) {
        List<Persona> personas = listarPersonas();

        for (int i = 0; i < personas.size(); i++) {
            if (personas.get(i).getId() == id) {
                personas.remove(i);

                try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(archivo))) {
                    oos.writeObject(personas);
                } catch (IOException e) {
                    e.printStackTrace();
                }

                return;
            }
        }
    }

    private List<Persona> listarPersonas() {
        List<Persona> personas = new ArrayList<>();

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(archivo))) {
            while (true) {
                try {
                    Object obj = ois.readObject();
                    if (obj instanceof Persona) {
                        Persona persona = (Persona) obj;
                        personas.add(persona);
                    }
                } catch (EOFException e) {
                    break; // Fin del archivo
                }
            }
        } catch (IOException | ClassNotFoundException e) {
            // El archivo aún no existe o está vacío, no es un error
        }

        return personas;
    }

}
