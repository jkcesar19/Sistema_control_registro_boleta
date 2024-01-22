package business;

import db.Conexion;
import entity.Maquina;
import entity.implement.MaquinaImplDao;
import entity.interfas.MaquinaDao;
import java.sql.Connection;
import java.util.Vector;
import javax.swing.DefaultComboBoxModel;

public class MaquinaBo {

    public static DefaultComboBoxModel obtenerMaquina() throws Exception {
        DefaultComboBoxModel maqui = null;
        Connection con = Conexion.getConexion();
        try
        {
            MaquinaDao maquiDao = new MaquinaImplDao(con);
            Vector vectorMaquina = maquiDao.Lista();
            maqui = new DefaultComboBoxModel(vectorMaquina);
        } catch (Exception e)
        {
            throw e;
        } finally
        {
            if (con != null)
            {
                con.close();
            }
        }
        return maqui;
    }
    
    public static boolean grabarMaquina(Maquina objMaquina) throws Exception {
        Connection con = null;
        try {
            con = Conexion.getConexion();
            con.setAutoCommit(false);
            MaquinaDao maquiDao = new MaquinaImplDao(con);
            maquiDao.grabar(objMaquina);
            con.commit();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            con.rollback();
            throw e;
        } finally {
            if (con != null) {
                con.close();
            }
        }
    }
}
