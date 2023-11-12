package entity.implement;

import entity.Unidad;
import entity.interfas.UnidadDao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;

public class UnidadImplDao implements UnidadDao {

    private PreparedStatement pst;
    private Connection con;
    private Statement st;
    private ResultSet rs;

    public UnidadImplDao(Connection con) {
        this.con = con;
    }

    @Override
    public Vector Lista() throws SQLException {
        Vector unidad = new Vector();
        String sql = "SELECT * FROM unidad_medida";
        st = con.createStatement();
        ResultSet rs = st.executeQuery(sql);
        while (rs.next()) {
            Unidad uni = new Unidad();
            uni.setId(rs.getInt("id"));
            uni.setUnidad(rs.getString("unidad_medida"));
            uni.setDescripcion(rs.getString("descripcion"));
            unidad.add(uni);
        }
        return unidad;
    }

    @Override
    public boolean grabar(Object object) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet.");
//To change body of generated methods, choose Tools | Templates.
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
