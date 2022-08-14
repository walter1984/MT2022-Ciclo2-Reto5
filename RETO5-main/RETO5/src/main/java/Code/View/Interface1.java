package Code.View;
import Code.Model.VBD.Consult1VBD;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import java.awt.*;
import java.util.ArrayList;

public class Interface1 extends JFrame {
    JPanel panelg;
    JTable tabla;
    DefaultTableModel modelo;
    JScrollPane scpanel01;

    public Interface1(){
        setTitle("Reporte del Lider");
        setSize(500,1000);
        setResizable(false);
        String[] columnas={"ID Lider","Nombre","Apellido","Ciudad"};
        ArrayList<String[]> d=Consult1VBD.valores();
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
        scpanel01.setBounds(20,20,440,820);
        add(scpanel01);

        panelg=new JPanel();
        panelg.setBackground(new Color(248,234,167));
        add(panelg);
        
        setVisible(true);
    }


}
