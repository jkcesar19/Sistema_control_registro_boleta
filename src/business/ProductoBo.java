package business;

import db.Conexion;
import entity.Producto;
import entity.implement.ProductoImplDao;
import entity.interfas.ProductoDao;
import java.sql.Connection;
import java.util.Vector;
import javax.swing.DefaultComboBoxModel;

public class ProductoBo {

    public static DefaultComboBoxModel obtenerProducto() throws Exception {
        DefaultComboBoxModel producto = null;
        Connection con = Conexion.getConexion();
        try
        {
            ProductoDao productoDao = new ProductoImplDao(con);
            Vector vectorProducto = productoDao.Lista();
            producto = new DefaultComboBoxModel(vectorProducto);
        } catch (Exception e)
        {
            throw e;
        } finally
        {
            if (con != null)
            {
                con.close();
            }
        }
        return producto;
    }

    public static boolean grabarProducto(Producto objProducto) throws Exception {
        Connection con = null;
        try
        {
            con = Conexion.getConexion();
            con.setAutoCommit(false);
            ProductoDao productoDao = new ProductoImplDao(con);
            productoDao.grabar(objProducto);
            con.commit();
            return true;
        } catch (Exception e)
        {
            e.printStackTrace();
            con.rollback();
            throw e;
        } finally
        {
            if (con != null)
            {
                con.close();
            }
        }
    }
}
