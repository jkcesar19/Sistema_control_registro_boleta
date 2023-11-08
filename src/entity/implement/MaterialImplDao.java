package entity.implement;

import entity.Material;
import entity.interfas.MaterialDao;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;

public class MaterialImplDao implements MaterialDao {

    private PreparedStatement pst;
    private Statement st;
    private CallableStatement cst;
    private Connection con;
    private Material objMaterial;

    public MaterialImplDao(Connection con) {
        this.con = con;
    }

    @Override
    public Vector Lista() throws SQLException {
        Vector listaMaterial = new Vector();
        String sql = "SELECT * FROM vista_material";
        st = con.createStatement();
        ResultSet rs = st.executeQuery(sql);
        while (rs.next()) {
            Vector material = new Vector();
            material.add(rs.getInt("idMaterial"));
            material.add(rs.getString("material"));
            material.add(rs.getString("cantidad"));
            material.add(rs.getString("unidad_medida"));
            material.add(rs.getDouble("precio"));
            material.add(rs.getDouble("total"));
            listaMaterial.add(material);
        }
        return listaMaterial;
    }

    @Override
    public boolean grabar(Object object) throws SQLException {
        objMaterial = (Material) object;
        try {
            String sql = "{CALL,pro_registrar_material(?,?,?,?,?,?,?,?,?,?)}";
            cst = con.prepareCall(sql);
            cst.setString(1, objMaterial.getProve());
            cst.setString(2, objMaterial.getFecha_ingreso());
            cst.setString(3, objMaterial.getSerie());
            cst.setString(4, objMaterial.getNumero());
            cst.setString(5, objMaterial.getMaterial());
            cst.setString(6, objMaterial.getCantidad());
            cst.setString(7, objMaterial.getUnidad());
            cst.setDouble(8, objMaterial.getPrecio());
            cst.setDouble(9, objMaterial.getTotal());
            cst.setInt(10, objMaterial.getEstado());
            cst.execute();
            cst.close();
            return true;
        } catch (SQLException e) {
            throw e;
        }

    }

    @Override
    public boolean eliminar(Object object) throws SQLException {
        objMaterial = (Material) object;
        try {
            String sql = "{CALL,pro_eliminar_material(?)}";
            cst = con.prepareCall(sql);
            cst.setInt(1, objMaterial.getIdMaterial());
            cst.execute();
            cst.close();
            return true;
        } catch (SQLException e) {
            throw e;
        }
    }

    @Override
    public boolean modificar(Object object) throws SQLException {
        objMaterial = (Material) object;
        try {
            String sql = "{CALL,pro_modificar_material(?,?,?,?,?,?,?,?,?,?)}";
            cst = con.prepareCall(sql);
            cst.setString(1, objMaterial.getProve());
            cst.setString(2, objMaterial.getFecha_ingreso());
            cst.setString(3, objMaterial.getSerie());
            cst.setString(4, objMaterial.getNumero());
            cst.setString(5, objMaterial.getMaterial());
            cst.setString(6, objMaterial.getCantidad());
            cst.setString(7, objMaterial.getUnidad());
            cst.setDouble(8, objMaterial.getPrecio());
            cst.setDouble(9, objMaterial.getTotal());
            cst.setInt(10, objMaterial.getIdMaterial());
            cst.execute();
            cst.close();
            return true;
        } catch (SQLException e) {
            throw e;
        }
    }

    @Override
    public Material validarMaterial(int id) throws SQLException {
        Material material = null;
        ResultSet rs = null;
        PreparedStatement pst = null;
        try {
            String sql = "SELECT p.razonsocial, m.fecha_ingreso, m.serie, m.numero  \n"
                    + "FROM material m INNER JOIN proveedor p ON m.idprove = p.idprove\n"
                    + "WHERE idMaterial = "+id;
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery(sql);
            if (rs.next()) {
                material = new Material();
                material.setProve(rs.getString(1));
                material.setFecha_ingreso(rs.getString(2));
                material.setSerie(rs.getString(3));
                material.setNumero(rs.getString(4));

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
        return material;
    }

}
