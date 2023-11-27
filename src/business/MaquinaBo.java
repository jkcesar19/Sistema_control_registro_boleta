package business;

import db.Conexion;
import entity.Maquina;
import entity.implement.MaquinaImplDao;
import entity.interfas.MaquinaDao;
import java.sql.Connection;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;

public class MaquinaBo {

    public static DefaultTableModel ListaTable() throws Exception {
        DefaultTableModel maquinaTableModel = null;
        Connection con = Conexion.getConexion();
        try {
            MaquinaDao maquinaDao = new MaquinaImplDao(con);
            Vector datoMaquina = maquinaDao.Lista();
            Vector columnas = new Vector();

            columnas.add("ID");
            columnas.add("Maquina");
            columnas.add("Horas");
            columnas.add("Dias");
            columnas.add("Precio");
            columnas.add("Total");

            maquinaTableModel = new DefaultTableModel(datoMaquina, columnas);

        } catch (Exception e) {
            throw e;
        } finally {
            if (con != null) {
                con.close();
            }
        }
        return maquinaTableModel;
    }

    public static boolean grabarMaquina(Maquina objMaquina) throws Exception {
        Connection con = null;
        try {
            con = Conexion.getConexion();
            con.setAutoCommit(false);
            MaquinaDao maquinaDao = new MaquinaImplDao(con);
            maquinaDao.grabar(objMaquina);
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

    public static boolean modificarMaquina(Maquina objMaquina) throws Exception {
        Connection con = null;
        try {
            con = Conexion.getConexion();
            con.setAutoCommit(false);
            MaquinaDao maquinaDao = new MaquinaImplDao(con);
            maquinaDao.modificar(objMaquina);
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

    public static boolean eliminarMaquina(Maquina objMaquina) throws Exception {
        Connection con = null;
        try {
            con = Conexion.getConexion();
            con.setAutoCommit(false);
            MaquinaDao maquinaDao = new MaquinaImplDao(con);
            maquinaDao.eliminar(objMaquina);
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

    public static Maquina validarMaquina(int id) throws Exception {
        Connection con = null;
        Maquina maquina = null;
        try {
            con = Conexion.getConexion();
            MaquinaDao maquinaDao = new MaquinaImplDao(con);
            maquina = maquinaDao.validarMaquina(id);
            if (maquina == null) {
//                throw new Exception("Usuario y/o Clave incorectos");
            }
        } catch (Exception e) {
            throw e;
        } finally {
            if (con != null) {
                con.close();
            }
        }
        return maquina;
    }
}
