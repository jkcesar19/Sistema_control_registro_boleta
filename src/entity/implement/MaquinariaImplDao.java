package entity.implement;

import entity.Maquinaria;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;
import entity.interfas.MaquinariaDao;

public class MaquinariaImplDao implements MaquinariaDao {

    private PreparedStatement pst;
    private Statement st;
    private CallableStatement cst;
    private Connection con;
    private Maquinaria objMaquina;

    public MaquinariaImplDao(Connection con) {
        this.con = con;
    }

    @Override
    public Vector Lista() throws SQLException {
        Vector listaMaquina = new Vector();
        String sql = "SELECT * FROM vista_maquina";
        st = con.createStatement();
        ResultSet rs = st.executeQuery(sql);
        while (rs.next()) {
            Vector maquina = new Vector();
            
            maquina.add(rs.getString("maquina"));
            maquina.add(rs.getString("horas"));
            maquina.add(rs.getString("dias"));
            maquina.add(rs.getDouble("precio_hora"));
            maquina.add(rs.getDouble("total"));
            
            listaMaquina.add(maquina);
        }
        return listaMaquina;
    }

    @Override
    public boolean grabar(Object object) throws SQLException {
        objMaquina = (Maquinaria) object;
        try {
            String sql = "{CALL,pro_registrar_maquinaria(?,?,?,?,?,?,?,?,?,?,?)}";
            cst = con.prepareCall(sql);
            cst.setString(1, objMaquina.getProve());
            cst.setString(2, objMaquina.getFecha());
            cst.setString(3, objMaquina.getSerie());
            cst.setString(4, objMaquina.getNumero());
            cst.setString(5, objMaquina.getMaquina());
            cst.setString(6, objMaquina.getHoras());
            cst.setString(7, objMaquina.getDias());
            cst.setDouble(8, objMaquina.getPrecio_hora());
            cst.setDouble(9, objMaquina.getTotal());
            cst.setString(10, objMaquina.getFecha_inicio());
            cst.setString(11, objMaquina.getFecha_fin());
            cst.execute();
            cst.close();
            return true;
        } catch (SQLException e) {
            throw e;
        }
    }

    @Override
    public boolean eliminar(Object object) throws SQLException {
        objMaquina = (Maquinaria) object;
        try {
            String sql = "{CALL,pro_eliminar_maquinaria(?)}";
            cst = con.prepareCall(sql);
            cst.setInt(1, objMaquina.getIdMaquinaria());
            cst.execute();
            cst.close();
            return true;
        } catch (SQLException e) {
            throw e;
        }
    }

    @Override
    public boolean modificar(Object object) throws SQLException {
        objMaquina = (Maquinaria) object;
        try {
            String sql = "{CALL,pro_modificar_maquinaria(?,?,?,?,?,?,?,?,?,?,?,?)}";
            cst = con.prepareCall(sql);
            cst.setString(1, objMaquina.getProve());
            cst.setString(2, objMaquina.getFecha());
            cst.setString(3, objMaquina.getSerie());
            cst.setString(4, objMaquina.getNumero());
            cst.setString(5, objMaquina.getMaquina());
            cst.setString(6, objMaquina.getHoras());
            cst.setString(7, objMaquina.getDias());
            cst.setDouble(8, objMaquina.getPrecio_hora());
            cst.setDouble(9, objMaquina.getTotal());
            cst.setString(10, objMaquina.getFecha_inicio());
            cst.setString(11, objMaquina.getFecha_fin());
            cst.setInt(12, objMaquina.getIdMaquinaria());
            cst.execute();
            cst.close();
            return true;
        } catch (SQLException e) {
            throw e;
        }
    }

    @Override
    public Maquinaria validarMaquina(int id) throws SQLException {
        Maquinaria maquina = null;
        ResultSet rs = null;
        PreparedStatement pst = null;
        try {
            String sql = "SELECT p.razonsocial, m.fecha, m.serie, m.numero, m.fecha_inicio, m.fecha_fin \n"
                    + "FROM maquinaria m INNER JOIN proveedor p ON m.idprove = p.idprove \n"
                    + "WHERE m.estado = 1 AND m.idMaquinaria =" + id;
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery(sql);
            if (rs.next()) {
                maquina = new Maquinaria();
                maquina.setProve(rs.getString(1));
                maquina.setFecha(rs.getString(2));
                maquina.setSerie(rs.getString(3));
                maquina.setNumero(rs.getString(4));
                maquina.setFecha_inicio(rs.getString(5));
                maquina.setFecha_fin(rs.getString(6));

            }
        } catch (Exception e) {
            throw e;
        } finally {
            if (rs != null) {
                rs.close();
            } else {
                pst.close();
            }
        }
        return maquina;
    }

    @Override
    public Maquinaria validarMaquina(String maqu) throws SQLException{
      Maquinaria maquina = null;
        ResultSet rs = null;
        PreparedStatement pst = null;
        try {
            String sql = "SELECT * FROM vista_maquina WHERE maquina = '" + maqu+"' AND estado ="+1;
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery(sql);
            if (rs.next()) {
                maquina = new Maquinaria();
                maquina.setIdMaquinaria(rs.getInt("id"));
                maquina.setProve(rs.getString("razonsocial"));
                maquina.setFecha(rs.getString("fecha"));
                maquina.setSerie(rs.getString("serie"));
                maquina.setNumero(rs.getString("numero"));
                maquina.setFecha_inicio(rs.getString("fecha_inicio"));
                maquina.setFecha_fin(rs.getString("fecha_fin"));

            }
        } catch (Exception e) {
            throw e;
        } finally {
            if (rs != null) {
                rs.close();
            } else {
                pst.close();
            }
        }
        return maquina;
    }
}


