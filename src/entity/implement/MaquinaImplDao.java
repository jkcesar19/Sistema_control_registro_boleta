package entity.implement;

import entity.Maquina;
import entity.interfas.MaquinaDao;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;

public class MaquinaImplDao implements MaquinaDao {

    private PreparedStatement pst;
    private Statement st;
    private CallableStatement cst;
    private Connection con;
    private Maquina objMaquina;

    public MaquinaImplDao(Connection con) {
        this.con = con;
    }


    @Override
    public Vector Lista() throws SQLException {
       Vector unidad = new Vector();
        String sql = "SELECT * FROM maquina;";
        st = con.createStatement();
        ResultSet rs = st.executeQuery(sql);
        while (rs.next())
        {
            Maquina uni = new Maquina();
            uni.setId(rs.getInt("id"));
            uni.setMaquina(rs.getString("maquina"));
            uni.setEstado(rs.getInt("estado"));
            unidad.add(uni);
        }
        return unidad;
    }

    @Override
    public boolean grabar(Object object) throws SQLException {
        objMaquina = (Maquina) object;
        try {
            String sql = "{CALL,pro_registrar_maquina(?)}";
            cst = con.prepareCall(sql);
            cst.setString(1, objMaquina.getMaquina());
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
