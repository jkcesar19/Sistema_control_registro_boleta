package business;

import entity.Persona;
import entity.implement.PersonaDao;

import java.util.ArrayList;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 * @fecha 22 - 01 - 2023
 * @author llaguento Carlos Cesar JK
 */
public class PersonaBo {

    PersonaDao dao = null;

    public void visualizar_pdf(JTable tabla) {
        DefaultTableModel dt = new DefaultTableModel();
       PersonaDao dao = new PersonaDao();
        Persona vo = new Persona();
        ArrayList<Persona> list = dao.Listar_Archivo();

        if (list.size() > 0) {
            for (int i = 0; i < list.size(); i++) {
                Object fila[] = new Object[10];
                vo = list.get(i);
                fila[0] = vo.getId();
                fila[1] = vo.getIcon();
                fila[2] = vo.getNom();
                fila[3] = vo.getDni();
                fila[4] = vo.getTel();
                fila[5] = vo.getDir();
                fila[6] = vo.getCor();
                fila[7] = vo.getEst();
                
                dt.addRow(fila);
            }
            tabla.setModel(dt);
            tabla.setRowHeight(32);
        }
    }

    
}
