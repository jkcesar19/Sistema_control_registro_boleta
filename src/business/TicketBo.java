
package business;

import db.Conexion;
import entity.Ticket;
import entity.implement.TicketImplDao;
import entity.interfas.TicketDao;
import java.sql.Connection;


public class TicketBo {
    public static boolean grabarTicket(Ticket objTicket) throws Exception {
        Connection con = null;
        try {
            con = Conexion.getConexion();
            con.setAutoCommit(false);
            TicketDao prove = new TicketImplDao(con);
            prove.grabar(objTicket);
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
     public static String NumeroCompra() throws Exception {
        Connection con = null;
        String dato = "";
        try {
            con = Conexion.getConexion();
            con.setAutoCommit(false);
            TicketImplDao ventaDao = new TicketImplDao(con);
            dato = ventaDao.NroTicket();
            con.commit();
            return dato;
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
      public static String NumId() throws Exception {
        Connection con = null;
        String dato = "";
        try {
            con = Conexion.getConexion();
            con.setAutoCommit(false);
            TicketImplDao ventaDao = new TicketImplDao(con);
            dato = ventaDao.NumeroId();
            con.commit();
            return dato;
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
