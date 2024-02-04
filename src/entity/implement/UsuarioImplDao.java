package entity.implement;

import entity.Usuario;
import entity.interfas.UsuarioDao;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;

public class UsuarioImplDao implements UsuarioDao {

    String LLAVE = "SomosProgramadores";
    String encriptada = "";
    private PreparedStatement pst;
    private Statement st;
    private CallableStatement cst;
    private Connection con;
    private Usuario objUsuario;

    public UsuarioImplDao(Connection con) {
        this.con = con;
    }

    @Override
    public Vector Lista() throws SQLException {
        Vector lista = new Vector();
        String sql = "SELECT * FROM `vista_usuario` ";
        st = con.createStatement();
        ResultSet rs = st.executeQuery(sql);
        while (rs.next())
        {
            Vector usuario = new Vector();

            usuario.add(rs.getString("nombre"));
            usuario.add(rs.getString("usuario"));

            usuario.add(rs.getString("rol"));
            lista.add(usuario);
        }
        return lista;
    }

    @Override
    public boolean grabar(Object object) throws SQLException {
        objUsuario = (Usuario) object;
        try
        {
            String sql = "{CALL,pro_registrar_usuario(?,?,?,?)}";
            cst = con.prepareCall(sql);
            cst.setString(1, objUsuario.getUsuario());
            cst.setString(2, objUsuario.getPasswor());
            cst.setString(3, objUsuario.getRol());
            cst.setString(4, objUsuario.getPersona());
            cst.execute();
            cst.close();
            return true;
        } catch (SQLException e)
        {
            throw e;
        }
    }

    @Override
    public boolean eliminar(Object object) throws SQLException {
        objUsuario = (Usuario) object;
        try
        {
            String sql = "{CALL,pro_eliminar_usuario(?)}";
            cst = con.prepareCall(sql);
            cst.setInt(1, objUsuario.getId());
            cst.execute();
            cst.close();
            return true;
        } catch (SQLException e)
        {
            throw e;
        }
    }

    @Override
    public boolean modificar(Object object) throws SQLException {
        objUsuario = (Usuario) object;
        try
        {
            String sql = "{CALL,pro_modificar_usuario(?,?,?,?,?)}";
            cst = con.prepareCall(sql);
            cst.setString(1, objUsuario.getUsuario());
            cst.setString(2, objUsuario.getPasswor());
            cst.setString(3, objUsuario.getRol());
            cst.setString(4, objUsuario.getPersona());
            cst.setInt(5, objUsuario.getId());
            cst.execute();
            cst.close();
            return true;
        } catch (SQLException e)
        {
            throw e;
        }
    }

    @Override
    public Usuario validarUsuario(String user, String clave) throws SQLException {
        Usuario usuario = null;
        ResultSet rs = null;
        PreparedStatement pst = null;
        try
        {
            String sql = "SELECT * FROM vista_usuario "
                    + " WHERE usuario = '" + user + "'  AND passwor = '" + clave + "'";
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery(sql);
            if (rs.next())
            {
                usuario = new Usuario();
                usuario.setId(rs.getInt(1));
                usuario.setPersona(rs.getString(2));
                usuario.setUsuario(rs.getString(3));
                usuario.setPasswor(rs.getString(4));
                usuario.setRol(rs.getString(5));
            }
        } catch (Exception e)
        {
            throw e;
        } finally
        {
            if (rs != null)
            {
                rs.close();
            } else
            {
                pst.close();
            }
        }
        return usuario;
    }


    @Override
    public Usuario validarUsuarioId(String per, String user) throws Exception {
        Usuario usuario = null;
        ResultSet rs = null;
        PreparedStatement pst = null;
        try
        {
            String sql = "SELECT * FROM vista_usuario "
                    + " WHERE nombre = '" + per + "' AND usuario = '" + user + "'";
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery(sql);
            if (rs.next())
            {
                usuario = new Usuario();
                usuario.setId(rs.getInt(1));
                usuario.setPersona(rs.getString(2));
                usuario.setUsuario(rs.getString(3));
                usuario.setPasswor(rs.getString(4));
                usuario.setRol(rs.getString(5));
            }
        } catch (Exception e)
        {
            throw e;
        } finally
        {
            if (rs != null)
            {
                rs.close();
            } else
            {
                pst.close();
            }
        }
        return usuario;
    }

}
