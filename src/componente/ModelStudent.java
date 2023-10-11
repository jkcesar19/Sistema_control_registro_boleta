package componente;

import java.text.DecimalFormat;
import javax.swing.Icon;

public class ModelStudent {

    private Icon icon;
    private String name;
    private String gender;
    private String course;
    private String estatus;
    private double fees;

    public ModelStudent(Icon icon, String name, String gender, String course, double fees,String estatus) {
        this.icon = icon;
        this.name = name;
        this.gender = gender;
        this.course = course;
        this.fees = fees;
        this.estatus = estatus;
    }

    public ModelStudent() {
    }

    public Icon getIcon() {
        return icon;
    }

    public void setIcon(Icon icon) {
        this.icon = icon;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public double getFees() {
        return fees;
    }

    public void setFees(double fees) {
        this.fees = fees;
    }

    public String getEstatus() {
        return estatus;
    }

    public void setEstatus(String estatus) {
        this.estatus = estatus;
    }
    

    public Object[] toRowTable(EventAction event) {
        DecimalFormat df = new DecimalFormat("$#,##0.00");
        return new Object[]{new ModelProfile(icon), name, gender, course, df.format(fees),new ModelEstatus(estatus), new ModelAction(this, event)};
    }
}
