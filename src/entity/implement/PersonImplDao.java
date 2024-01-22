package entity.implement;

import entity.Person;
import entity.interfas.PersonDao;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;

public class PersonImplDao implements PersonDao {

    private PreparedStatement pst;
    private Statement st;
    private CallableStatement cst;
    private Connection con;
    private Person objPerson;

    public PersonImplDao(Connection con) {
        this.con = con;
    }

    @Override
    public Vector Lista() throws SQLException {
        Vector listaPerson = new Vector();
        String sql = "SELECT * FROM persona";
        st = con.createStatement();
        ResultSet rs = st.executeQuery(sql);
        while (rs.next()) {
            Vector person = new Vector();
//            person.add(rs.getInt("idpersona"));
            person.add(rs.getString("nombre"));
            person.add(rs.getInt("num_dni"));
            person.add(rs.getString("direccion"));
            person.add(rs.getInt("telefono"));
            person.add(rs.getString("correo"));
            person.add(rs.getString("es_civil"));
            person.add(rs.getString("hijo"));
            person.add(rs.getInt("can_hijo"));
            person.add(rs.getString("sexo"));
//            person.add(rs.getString("estado"));
            listaPerson.add(person);
        }
        return listaPerson;
    }

    @Override
    public boolean grabar(Object object) throws SQLException {
        objPerson = (Person) object;
        try {
            String sql = "{CALL,pro_registrar_persona(?,?,?,?,?,?,?,?,?,?)}";
            cst = con.prepareCall(sql);
            cst.setString(1, objPerson.getNombre());
            cst.setInt(2, objPerson.getNum_dni());
            cst.setString(3, objPerson.getDireccion());
            cst.setInt(4, objPerson.getTelefono());
            cst.setString(5, objPerson.getCorreo());
            cst.setString(6, objPerson.getEs_civil());
            cst.setString(7, objPerson.getHijo());
            cst.setInt(8, objPerson.getCan_hijo());
            cst.setString(9, objPerson.getSexo());
            cst.setString(10, objPerson.getEstado());
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
       objPerson = (Person) object;
        try {
            String sql = "{CALL,pro_actualizar_persona(?,?,?,?,?,?,?,?,?,?,?)}";
            cst = con.prepareCall(sql);
            cst.setString(1, objPerson.getNombre());
            cst.setInt(2, objPerson.getNum_dni());
            cst.setString(3, objPerson.getDireccion());
            cst.setInt(4, objPerson.getTelefono());
            cst.setString(5, objPerson.getCorreo());
            cst.setString(6, objPerson.getEs_civil());
            cst.setString(7, objPerson.getHijo());
            cst.setInt(8, objPerson.getCan_hijo());
            cst.setString(9, objPerson.getSexo());
            cst.setString(10, objPerson.getEstado());
            cst.setInt(11, objPerson.getIdpersona());
            System.out.println(objPerson.getIdpersona());
            cst.execute();
            cst.close();
            return true;
        } catch (SQLException e) {
            throw e;
        }
    }

    @Override
    public Vector Combobox() throws SQLException {
       Vector persona = new Vector();
        String sql = "SELECT nombre FROM persona";
        st = con.createStatement();
        ResultSet rs = st.executeQuery(sql);
        while (rs.next()) {
            Person per = new Person();
            per.setNombre(rs.getString("nombre"));
            persona.add(per);
        }
        return persona;
    }

}
