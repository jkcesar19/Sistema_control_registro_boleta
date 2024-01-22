package entity.interfas;

import entity.Maquinaria;
import java.sql.SQLException;

public interface MaquinariaDao extends GeneralDao {

    public Maquinaria validarMaquina(int id) throws SQLException;

    public Maquinaria validarMaquina(String maqu) throws SQLException;
}
