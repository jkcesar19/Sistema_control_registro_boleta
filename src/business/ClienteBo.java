package business;

import db.Conexion;
import entity.Cliente;
import entity.implement.ClienteImplDao;
import entity.interfas.ClienteDao;
import java.sql.Connection;
import java.util.Vector;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;

public class ClienteBo {

    public static DefaultComboBoxModel obtenerPersona() throws Exception {
        DefaultComboBoxModel persona = null;
        Connection con = Conexion.getConexion();
        try {
            ClienteDao personDao = new ClienteImplDao(con);
            Vector vectorPersona = personDao.Combobox();
            persona = new DefaultComboBoxModel(vectorPersona);
        } catch (Exception e) {
            throw e;
        } finally {
            if (con != null) {
                con.close();
            }
        }
        return persona;
    }

    public static DefaultTableModel ListaTable() throws Exception {
        DefaultTableModel usuarioTableModel = null;
        Connection con = Conexion.getConexion();
        try {
            ClienteDao personDao = new ClienteImplDao(con);
            Vector datoPerson = personDao.Lista();
            Vector columnas = new Vector();
            
            columnas.add("R. social");
            columnas.add("RUC");
            columnas.add("Dirección");
            columnas.add("Teléfono");

            usuarioTableModel = new DefaultTableModel(datoPerson, columnas);

        } catch (Exception e) {
            throw e;
        } finally {
            if (con != null) {
                con.close();
            }
        }
        return usuarioTableModel;
    }

    public static boolean grabarPerson(Cliente objPerson) throws Exception {
        Connection con = null;
        try {
            con = Conexion.getConexion();
            con.setAutoCommit(false);
            ClienteDao personDao = new ClienteImplDao(con);
            personDao.grabar(objPerson);
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

    public static boolean modificarPerson(Cliente objPerson) throws Exception {
        Connection con = null;
        try {
            con = Conexion.getConexion();
            con.setAutoCommit(false);
            ClienteDao personDao = new ClienteImplDao(con);
            personDao.modificar(objPerson);
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

    public static boolean eliminarPerson(Cliente objPerson) throws Exception {
        Connection con = null;
        try {
            con = Conexion.getConexion();
            con.setAutoCommit(false);
            ClienteDao personDao = new ClienteImplDao(con);
            personDao.eliminar(objPerson);
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
    
    public static Cliente validarClienteId(String cliente, String ruc) throws Exception {
        Connection con = null;
        Cliente cli = null;
        try {
            con = Conexion.getConexion();
            ClienteDao personDao = new ClienteImplDao(con);
            cli = personDao.validarCliente(cliente,ruc);
            if (cli == null) {

            }
        } catch (Exception e) {
            throw e;
        } finally {
            if (con != null) {
                con.close();
            }
        }
        return cli;
    }
}
