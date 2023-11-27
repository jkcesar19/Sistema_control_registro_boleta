package entity.implement;

import entity.Cliente;
import entity.Person;
import entity.interfas.ClienteDao;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;

public class ClienteImplDao implements ClienteDao {

    private PreparedStatement pst;
    private Statement st;
    private CallableStatement cst;
    private Connection con;
    private Cliente objCliente;

    public ClienteImplDao(Connection con) {
        this.con = con;
    }

    @Override
    public Vector Combobox() throws SQLException {
        Vector persona = new Vector();
        String sql = "SELECT razonsocial FROM cliente WHERE estado = 1";
        st = con.createStatement();
        ResultSet rs = st.executeQuery(sql);
        while (rs.next()) {
            Person per = new Person();
            per.setNombre(rs.getString("razonsocial"));
            persona.add(per);
        }
        return persona;
    
}

@Override
        public Vector Lista() throws SQLException {
       Vector listaPerson = new Vector();
        String sql = "SELECT id, razonsocial, ruc, direccion, telefono FROM cliente WHERE estado = 1";
        st = con.createStatement();
        ResultSet rs = st.executeQuery(sql);
        while (rs.next()) {
            Vector person = new Vector();
            person.add(rs.getInt("id"));
            person.add(rs.getString("razonsocial"));
            person.add(rs.getString("ruc"));
            person.add(rs.getString("direccion"));
            person.add(rs.getInt("telefono"));
            listaPerson.add(person);
        }
        return listaPerson;
    }

    @Override
        public boolean grabar(Object object) throws SQLException {
         objCliente = (Cliente) object;
        try {
            String sql = "{CALL,pro_registra_cliente(?,?,?,?)}";
            cst = con.prepareCall(sql);
            cst.setString(1, objCliente.getRazon_social());
            cst.setString(2, objCliente.getRuc());
            cst.setString(3, objCliente.getDireccion());
            cst.setInt(4, objCliente.getTelefo());
            cst.execute();
            cst.close();
            return true;
        } catch (SQLException e) {
            throw e;
        }
    }

    @Override
        public boolean eliminar(Object object) throws SQLException {
         objCliente = (Cliente) object;
        try {
            String sql = "{CALL,pro_eliminar_cliente(?)}";
            cst = con.prepareCall(sql);
            cst.setInt(1, objCliente.getIdc());
            cst.execute();
            cst.close();
            return true;
        } catch (SQLException e) {
            throw e;
        }
    }

    @Override
        public boolean modificar(Object object) throws SQLException {
        objCliente = (Cliente) object;
        try {
            String sql = "{CALL,pro_modificar_cliente(?,?,?,?,?)}";
            cst = con.prepareCall(sql);
            cst.setString(1, objCliente.getRazon_social());
            cst.setString(2, objCliente.getRuc());
            cst.setString(3, objCliente.getDireccion());
            cst.setInt(4, objCliente.getTelefo());
            cst.setInt(5, objCliente.getIdc());
            cst.execute();
            cst.close();
            return true;
        } catch (SQLException e) {
            throw e;
        }
    }

}
