package view.component;

import java.awt.Cursor;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import javax.swing.JButton;
import javax.swing.border.EmptyBorder;

/**
 * @fecha 21 - 01 - 2023
 * @author Llaguento Carlos Cesar JK
 */
public class Button_header extends JButton {

    public Button_header() {
        setContentAreaFilled(false);
        setBorder(new EmptyBorder(6, 6, 6, 6));
        setCursor(new Cursor(Cursor.HAND_CURSOR));
    }

    @Override
    public void paint(Graphics g) {
        Graphics2D g2 = (Graphics2D) g.create();
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        int ancho = getWidth();
        int alto = getHeight();
        int tamanio = Math.min(ancho, alto);
        int x = (ancho - tamanio) / 2;
        int y = (alto - tamanio) / 2;
        g2.setColor(getBackground());
        g2.fillOval(x, y, tamanio, tamanio);
        super.paint(g);
    }

}
