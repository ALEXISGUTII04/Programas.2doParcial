
package DAO;

import Model1.Persona;

public interface PersonaDAOImp {
    
    void crear(Persona persona);
    Persona leer(int id);
    void actualizar(int id, Persona nuevaPersona);
    void eliminar(int id);
}
