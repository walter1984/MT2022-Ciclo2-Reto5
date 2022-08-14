package Code.View;
import Code.Model.VBD.Consult3VBD;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import java.awt.*;
import java.util.ArrayList;
public class Interface3 extends JFrame{
    JPanel panelg;
    JTable tabla;
    DefaultTableModel modelo;
    JScrollPane scpanel01;

    public Interface3(){
        setTitle("Reporte Homecenter - Salento");
        setSize(500,430);
        setResizable(false);
        String[] columnas={"ID Compra","Constructora","Banco Vinculado"};
        ArrayList<String[]> d=Consult3VBD.valores();
        String[][] datos=new String[d.size()][3];
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
        scpanel01.setBounds(20,20,440,340);
        add(scpanel01);

        panelg=new JPanel();
        panelg.setBackground(new Color(247,149,149));
        add(panelg);
        
        setVisible(true);
    }
}
