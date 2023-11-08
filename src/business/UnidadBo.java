
package business;

import db.Conexion;
import entity.implement.UnidadImplDao;
import entity.interfas.UnidadDao;
import java.sql.Connection;
import java.util.Vector;
import javax.swing.DefaultComboBoxModel;

public class UnidadBo {
    public static DefaultComboBoxModel obtenerUnidad() throws Exception {
        DefaultComboBoxModel unidad = null;
        Connection con = Conexion.getConexion();
        try {
            UnidadDao unid = new UnidadImplDao(con);
            Vector vectorUnidad = unid.Lista();
            unidad = new DefaultComboBoxModel(vectorUnidad);
        } catch (Exception e) {
            throw e;
        } finally {
            if (con != null) {
                con.close();
            }
        }
        return unidad;
    } 
}
