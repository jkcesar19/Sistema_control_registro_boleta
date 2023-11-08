package business;

import db.Conexion;
import entity.Proveedor;
import entity.implement.ProveImplDao;
import entity.interfas.ProveeDao;
import java.sql.Connection;
import java.util.Vector;
import javax.swing.DefaultComboBoxModel;

public class ProveedorBo {

    public static DefaultComboBoxModel obtenerProveedor() throws Exception {
        DefaultComboBoxModel Provee = null;
        Connection con = Conexion.getConexion();
        try {
            ProveeDao prove = new ProveImplDao(con);
            Vector vectorProve = prove.Lista();
            Provee = new DefaultComboBoxModel(vectorProve);
        } catch (Exception e) {
            throw e;
        } finally {
            if (con != null) {
                con.close();
            }
        }
        return Provee;
    }

    public static boolean grabarProveedor(Proveedor objProveedor) throws Exception {
        Connection con = null;
        try {
            con = Conexion.getConexion();
            con.setAutoCommit(false);
            ProveeDao prove = new ProveImplDao(con);
            prove.grabar(objProveedor);
            con.commit();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            con.rollback();
            throw e;
        } finally {
            if (con != null) {
                con.close();
            }
        }
    }
}
