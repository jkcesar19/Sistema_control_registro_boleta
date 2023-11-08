package entity.implement;

import entity.Proveedor;
import entity.interfas.ProveeDao;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;

public class ProveImplDao implements ProveeDao {

    private PreparedStatement pst;
    private Connection con;
    private Statement st;
    private CallableStatement cst;
    private ResultSet rs;
    private Proveedor objProveedor;

    public ProveImplDao(Connection con) {
        this.con = con;
    }

    @Override
    public Vector Lista() throws SQLException {

        Vector provee = new Vector();
        String sql = "SELECT * FROM proveedor";
        st = con.createStatement();
        ResultSet rs = st.executeQuery(sql);
        while (rs.next()) {
            Proveedor pro = new Proveedor();
            pro.setIdprove(rs.getInt("idprove"));
            pro.setRazonsocial(rs.getString("razonsocial"));
            pro.setRuc(rs.getString("ruc"));
            pro.setDireccion(rs.getString("direccion"));
            pro.setTelefono(rs.getInt("telefono"));
            provee.add(pro);
        }
        return provee;
    }

    @Override
    public boolean grabar(Object object) throws SQLException {
        objProveedor = (Proveedor) object;
        try {
            String sql = "{CALL,pro_registrar_proveedor(?,?,?,?)}";
            cst = con.prepareCall(sql);
            cst.setString(1, objProveedor.getRazonsocial());
            cst.setString(2, objProveedor.getRuc());
            cst.setString(3, objProveedor.getDireccion());
            cst.setInt(4, objProveedor.getTelefono());
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

}
