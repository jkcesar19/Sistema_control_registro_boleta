package entity.implement;

import entity.Ticket;
import entity.interfas.TicketDao;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;

public class TicketImplDao implements TicketDao{

    private PreparedStatement pst;
    private Statement st;
    private CallableStatement cst;
    private Connection con;
    private Ticket objTikect;

    public TicketImplDao(Connection con) {
        this.con = con;
    }

    
    public String NumeroId(){
        String serie="";
        String sql="SELECT MAX(idT) FROM ticket";
        try {
            pst = con.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                serie=rs.getString(1);
            }
        } catch (Exception e) {
        }
        return serie;
    }

    @Override
    public Vector Lista() throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); 
//To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean grabar(Object object) throws SQLException {
         objTikect = (Ticket) object;
        try {
            String sql = "{CALL,pro_registrar_ticket(?,?,?,?,?,?)}";
            cst = con.prepareCall(sql);
            cst.setString(1, objTikect.getIdU());
            cst.setString(2, objTikect.getIdC());
            cst.setString(3, objTikect.getSerie());
            cst.setString(4, objTikect.getNum());
            cst.setDouble(5, objTikect.getSubtotal());
            cst.setDouble(6, objTikect.getTotal());
            cst.execute();
            cst.close();
            return true;
        } catch (SQLException e) {
            throw e;
        }
    }

    @Override
    public boolean eliminar(Object object) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); 
//To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean modificar(Object object) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); 
 //To change body of generated methods, choose Tools | Templates.
    }
    public String NroTicket() {
        String serie = "";
        String sql = "SELECT MAX(numero) FROM ticket";
        try {
            pst = con.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                serie = rs.getString(1);
            }
        } catch (Exception e) {
        }
        return serie;
    }
}
