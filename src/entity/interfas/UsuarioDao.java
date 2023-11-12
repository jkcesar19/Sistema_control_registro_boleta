
package entity.interfas;

import entity.Usuario;
import java.sql.SQLException;

public interface UsuarioDao extends GeneralDao{
     public Usuario validarUsuario(String user, String clave) throws SQLException;
}
