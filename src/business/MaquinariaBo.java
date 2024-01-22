package business;

import db.Conexion;
import entity.Maquinaria;
import entity.implement.MaquinariaImplDao;
import java.sql.Connection;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;
import entity.interfas.MaquinariaDao;

public class MaquinariaBo {

    public static DefaultTableModel ListaTable() throws Exception {
        DefaultTableModel maquinaTableModel = null;
        Connection con = Conexion.getConexion();
        try {
            MaquinariaDao maquinaDao = new MaquinariaImplDao(con);
            Vector datoMaquina = maquinaDao.Lista();
            Vector columnas = new Vector();

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

    public static boolean grabarMaquina(Maquinaria objMaquina) throws Exception {
        Connection con = null;
        try {
            con = Conexion.getConexion();
            con.setAutoCommit(false);
            MaquinariaDao maquinaDao = new MaquinariaImplDao(con);
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

    public static boolean modificarMaquina(Maquinaria objMaquina) throws Exception {
        Connection con = null;
        try {
            con = Conexion.getConexion();
            con.setAutoCommit(false);
            MaquinariaDao maquinaDao = new MaquinariaImplDao(con);
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

    public static boolean eliminarMaquina(Maquinaria objMaquina) throws Exception {
        Connection con = null;
        try {
            con = Conexion.getConexion();
            con.setAutoCommit(false);
            MaquinariaDao maquinaDao = new MaquinariaImplDao(con);
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

    public static Maquinaria validarMaquina(int id) throws Exception {
        Connection con = null;
        Maquinaria maquina = null;
        try {
            con = Conexion.getConexion();
            MaquinariaDao maquinaDao = new MaquinariaImplDao(con);
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

    public static Maquinaria validariMaquinaId(String maqu) throws Exception {
        Connection con = null;
        Maquinaria maquina = null;
        try {
            con = Conexion.getConexion();
            MaquinariaDao maquinaDao = new MaquinariaImplDao(con);
            maquina = maquinaDao.validarMaquina(maqu);
            if (maquina == null) {

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
