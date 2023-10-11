package business;

import db.Conexion;
import entity.Person;
import entity.implement.PersonImplDao;
import entity.interfas.PersonDao;
import java.sql.Connection;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;

public class PersonBo {

    public static DefaultTableModel ListaTable() throws Exception {
        DefaultTableModel usuarioTableModel = null;
        Connection con = Conexion.getConexion();
        try {
            PersonDao personDao = new PersonImplDao(con);
            Vector datoPerson = personDao.Lista();
            Vector columnas = new Vector();
          
            columnas.add("Nombres");
            columnas.add("DNI");
            columnas.add("Dirección");
            columnas.add("Teléfono");
            columnas.add("Correo");
            columnas.add("Es civil");
            columnas.add("Hijo");
            columnas.add("Can hijo");
            columnas.add("sexo");
        
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

    public static boolean grabarPerson(Person objPerson) throws Exception {
        Connection con = null;
        try {
            con = Conexion.getConexion();
            con.setAutoCommit(false);
            PersonDao personDao = new PersonImplDao(con);
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

    public static boolean modificarPerson(Person objPerson) throws Exception {
        Connection con = null;
        try {
            con = Conexion.getConexion();
            con.setAutoCommit(false);
            PersonDao personDao = new PersonImplDao(con);
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
}
