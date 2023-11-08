package business;

import db.Conexion;
import entity.Material;
import entity.implement.MaterialImplDao;
import entity.interfas.MaterialDao;
import java.sql.Connection;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;

public class MaterialBo {

    public static DefaultTableModel ListaTable() throws Exception {
        DefaultTableModel materialTableModel = null;
        Connection con = Conexion.getConexion();
        try {
            MaterialDao materialDao = new MaterialImplDao(con);
            Vector datoMaterial = materialDao.Lista();
            Vector columnas = new Vector();

            columnas.add("ID");
            columnas.add("Material");
            columnas.add("Cantidad");
            columnas.add("Unidad");
            columnas.add("Precio");
            columnas.add("Total");

            materialTableModel = new DefaultTableModel(datoMaterial, columnas);

        } catch (Exception e) {
            throw e;
        } finally {
            if (con != null) {
                con.close();
            }
        }
        return materialTableModel;
    }

    public static boolean grabarMaterial(Material objMaterial) throws Exception {
        Connection con = null;
        try {
            con = Conexion.getConexion();
            con.setAutoCommit(false);
            MaterialDao materialDao = new MaterialImplDao(con);
            materialDao.grabar(objMaterial);
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

    public static boolean ModificarMaterial(Material objMaterial) throws Exception {
        Connection con = null;
        try {
            con = Conexion.getConexion();
            con.setAutoCommit(false);
            MaterialDao materialDao = new MaterialImplDao(con);
            materialDao.modificar(objMaterial);
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

    public static boolean elimanarMaterial(Material objMaterial) throws Exception {
        Connection con = null;
        try {
            con = Conexion.getConexion();
            con.setAutoCommit(false);
            MaterialDao materialDao = new MaterialImplDao(con);
            materialDao.eliminar(objMaterial);
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
    public static Material validarMaterial(int id) throws Exception {
        Connection con = null;
        Material material = null;
        try {
            con = Conexion.getConexion();
            MaterialDao materialDao = new MaterialImplDao(con);
            material = materialDao.validarMaterial(id);
            if (material == null) {
//                throw new Exception("Usuario y/o Clave incorectos");
            }
        } catch (Exception e) {
            throw e;
        } finally {
            if (con != null) {
                con.close();
            }
        }
        return material;
    }
}
