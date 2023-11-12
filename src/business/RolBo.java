
package business;

import db.Conexion;
import entity.implement.RolImplDao;
import entity.interfas.RolDao;
import java.sql.Connection;
import java.util.Vector;
import javax.swing.DefaultComboBoxModel;


public class RolBo {
    public static DefaultComboBoxModel obtenerRol() throws Exception {
        DefaultComboBoxModel unidad = null;
        Connection con = Conexion.getConexion();
        try {
            RolDao unid = new RolImplDao(con);
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
