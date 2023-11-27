
package entity.implement;

import entity.Detalle_Ticket;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;
import entity.interfas.Detalle_TicketDao;

public class Detalle_TicketImplDao implements Detalle_TicketDao{
  private PreparedStatement pst;
    private Statement st;
    private CallableStatement cst;
    private Connection con;
    private Detalle_Ticket objDetalle;

    public Detalle_TicketImplDao(Connection con) {
        this.con = con;
    }

    @Override
    public Vector Lista() throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); 
//To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean grabar(Object object) throws SQLException {
       objDetalle = (Detalle_Ticket) object;
        try {
            String sql = "{CALL,pro_registro_detalle_ticket(?,?,?,?,?,?,?)}";
            cst = con.prepareCall(sql);
            cst.setInt(1, objDetalle.getIdticket());
            cst.setString(2, objDetalle.getDes());
            cst.setInt(3, objDetalle.getDia());
            cst.setInt(4, objDetalle.getHora());
            cst.setInt(5, objDetalle.getCant());
            cst.setDouble(6, objDetalle.getPrecio());
            cst.setDouble(7, objDetalle.getTotal());
            cst.execute();
            cst.close();
            return true;
        } catch (SQLException e) {
            throw e;
        }
    }

    @Override
    public boolean eliminar(Object object) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean modificar(Object object) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
