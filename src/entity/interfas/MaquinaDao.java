
package entity.interfas;

import entity.Maquina;
import java.sql.SQLException;


public interface MaquinaDao extends GeneralDao{
    public Maquina validarMaquina(int id) throws SQLException;
}
