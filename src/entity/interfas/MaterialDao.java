package entity.interfas;

import entity.Material;
import java.sql.SQLException;
import java.util.Vector;

public interface MaterialDao extends GeneralDao {

    public Material validarMaterial(int id) throws SQLException;

    public boolean actualizar_stock(Object object) throws SQLException;

    public Vector Lista_material_ticket() throws SQLException;

    public Material validarMaterialId(String mate) throws SQLException;
}
