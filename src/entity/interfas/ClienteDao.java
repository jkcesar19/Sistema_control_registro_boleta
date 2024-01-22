
package entity.interfas;

import entity.Cliente;
import java.sql.SQLException;
import java.util.Vector;

public interface ClienteDao extends GeneralDao{
   public Vector Combobox() throws SQLException; 
   
   public Cliente validarCliente(String cliente, String ruc) throws SQLException;
}
