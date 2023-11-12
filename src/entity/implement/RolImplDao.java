
package entity.implement;

import entity.Rol;
import entity.interfas.RolDao;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;

public class RolImplDao implements RolDao{
 private Connection con;
    private Statement st;

    public RolImplDao(Connection con) {
        this.con = con;
    }
    @Override
    public Vector Lista() throws SQLException {
        Vector unidad = new Vector();
        String sql = "SELECT id, rol FROM rol";
        st = con.createStatement();
        ResultSet rs = st.executeQuery(sql);
        while (rs.next()) {
            Rol uni = new Rol();
            uni.setId(rs.getInt("id"));
            uni.setRol(rs.getString("rol"));
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
