
package entity.interfas;

import entity.Material;
import java.sql.SQLException;


public interface MaterialDao extends GeneralDao{
    public Material validarMaterial(int id) throws SQLException;
}
