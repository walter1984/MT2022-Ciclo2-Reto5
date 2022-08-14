package Code.View;
import javax.swing.*;
import java.awt.event.*;

public class InterfaceP extends JFrame implements ActionListener{
    JButton btn01;
    JButton btn02;
    JButton btn03;
    JPanel panel01;

    public InterfaceP(){
        setTitle("Reportes");
        setSize(350,235);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        btn01=new JButton("Informe al Lider");
        btn01.setBounds(65, 20, 200, 40);
        btn01.addActionListener(this);
        add(btn01);

        btn02=new JButton("Campestre Zona Norte");
        btn02.setBounds(65, 80, 200, 40);
        btn02.addActionListener(this);
        add(btn02);

        btn03=new JButton("Homecenter Salento");
        btn03.setBounds(65, 140, 200, 40);
        btn03.addActionListener(this);
        add(btn03);

        panel01=new JPanel();
        add(panel01);
        
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        if(e.getSource()==btn01){
            new Interface1();
        }
        else if(e.getSource()==btn02){
            new Interface2();
        }
        else if(e.getSource()==btn03){
            new Interface3();
        
        }
      }
    }
