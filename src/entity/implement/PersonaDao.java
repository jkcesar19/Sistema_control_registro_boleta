package entity.implement;

import db.Conexion;
import entity.Persona;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.sql.Blob;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

/**
 * @fecha 22 - 01 - 2023
 * @author Llaguento Carlos Cesar JK
 */
public class PersonaDao {

    public ArrayList<Persona> Listar_Archivo() {
        ArrayList<Persona> list = new ArrayList<Persona>();
        Conexion conec = new Conexion();
        String sql = "SELECT * FROM vista_persona";
        ResultSet rs = null;
        PreparedStatement ps = null;
        try {

            ps = conec.getConexion().prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Persona objPer = new Persona();
               

                Blob blob = rs.getBlob(1);
                if (blob != null) {
                    try {
                        byte[] data = blob.getBytes(1, (int) blob.length());
                        BufferedImage img = null;
                        try {
                            img = ImageIO.read(new ByteArrayInputStream(data));
                        } catch (Exception ex) {
                            System.out.println(ex.getMessage());
                        }
                        ImageIcon icono = new ImageIcon(img);
                        objPer.setIcon(icono);
                    } catch (Exception ex) {
                        System.out.println("error con la img");
                    }
                } else {
                    System.out.println("Esta vavio la ruta");
                }
                objPer.setNom(rs.getString(2));
                objPer.setDni(rs.getString(3));
                objPer.setTel(rs.getString(4));
                objPer.setDir(rs.getString(5));
                objPer.setCor(rs.getString(6));
                if (rs.getInt(7) == 1) {
                    objPer.setEst("Activo");
                } else {
                    objPer.setEst("Inactivo");
                }

                list.add(objPer);
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        } finally {
            try {
                ps.close();
                rs.close();
            } catch (Exception ex) {
            }
        }
        return list;
    }
}
