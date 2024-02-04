
package entity.interfas;

import entity.Person;
import java.sql.SQLException;
import java.util.Vector;


public interface PersonDao extends GeneralDao{
    public Vector Combobox() throws SQLException;
     public Person validarPerson(String nom, int dni) throws SQLException;
}
