package Code.View;
import Code.Model.VBD.Consult2VBD;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import java.awt.*;
import java.util.ArrayList;
public class Interface2 extends JFrame{
    JPanel panelg;
    JTable tabla;
    DefaultTableModel modelo;
    JScrollPane scpanel01;

    public Interface2(){
        setTitle("Reporte Casa campestre - Zona Norte");
        setSize(500,330);
        setResizable(false);
        String[] columnas={"ID Proyecto","Constructora","# Habitaciones","Ciudad"};
        ArrayList<String[]> d=Consult2VBD.valores();
        String[][] datos=new String[d.size()][4];
        for (int i = 0; i < d.size(); i++) {
            int j=0;
            for (String s : d.get(i)) {
                datos[i][j]=s;
                j++;
                
            }
            
        }

        //String[][] datos={{"","","",""},{"","","",""}};
        modelo=new DefaultTableModel(datos,columnas);
        tabla=new JTable(modelo);
        scpanel01=new JScrollPane(tabla);
        scpanel01.setBounds(20,20,440,230);
        add(scpanel01);

        panelg=new JPanel();
        panelg.setBackground(new Color(167,179,248));
        add(panelg);
        
        setVisible(true);
    }
}
