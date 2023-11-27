
package business;

import db.Conexion;
import entity.Detalle_Ticket;
import entity.implement.Detalle_TicketImplDao;
import entity.interfas.Detalle_TicketDao;
import java.sql.Connection;


public class Detalle_TicketBo {
       public static boolean grabarTicket(Detalle_Ticket objTicket) throws Exception {
        Connection con = null;
        try {
            con = Conexion.getConexion();
            con.setAutoCommit(false);
            Detalle_TicketDao prove = new Detalle_TicketImplDao(con);
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
}
