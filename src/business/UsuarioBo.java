package business;

import db.Conexion;
import entity.Usuario;
import entity.implement.UsuarioImplDao;
import entity.interfas.UsuarioDao;
import java.sql.Connection;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;

public class UsuarioBo {

    public static DefaultTableModel ListaTable() throws Exception {
        DefaultTableModel materialTableModel = null;
        Connection con = Conexion.getConexion();
        try {
            UsuarioDao usuarioDao = new UsuarioImplDao(con);
            Vector datoUsuario = usuarioDao.Lista();
            Vector columnas = new Vector();

            columnas.add("ID");
            columnas.add("Nombre");
            columnas.add("Usuario");
            columnas.add("Contraseña");
            columnas.add("Rol");

            materialTableModel = new DefaultTableModel(datoUsuario, columnas);

        } catch (Exception e) {
            throw e;
        } finally {
            if (con != null) {
                con.close();
            }
        }
        return materialTableModel;
    }

    public static boolean grabarUsuario(Usuario objUsuario) throws Exception {
        Connection con = null;
        try {
            con = Conexion.getConexion();
            con.setAutoCommit(false);
            UsuarioDao usuarioDao = new UsuarioImplDao(con);
            usuarioDao.grabar(objUsuario);
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

    public static boolean modificarUsuario(Usuario objUsuario) throws Exception {
        Connection con = null;
        try {
            con = Conexion.getConexion();
            con.setAutoCommit(false);
            UsuarioDao usuarioDao = new UsuarioImplDao(con);
            usuarioDao.modificar(objUsuario);
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

    public static boolean eliminarUsuario(Usuario objUsuario) throws Exception {
        Connection con = null;
        try {
            con = Conexion.getConexion();
            con.setAutoCommit(false);
            UsuarioDao usuarioDao = new UsuarioImplDao(con);
            usuarioDao.eliminar(objUsuario);
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

    public static Usuario validarUsuario(String usa, String clave) throws Exception {
        Connection con = null;
        Usuario maquina = null;
        try {
            con = Conexion.getConexion();
            UsuarioDao usuarioDao = new UsuarioImplDao(con);
            maquina = usuarioDao.validarUsuario(usa, clave);
            if (maquina == null) {
                throw new Exception("Usuario y/o Clave incorectos");
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
