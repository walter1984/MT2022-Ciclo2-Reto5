package Code.Model.VBD;
import Code.Model.BD.Consult2BD;
import java.sql.*;
import java.util.ArrayList;

public class Consult2VBD {
    public static ArrayList<String[]> valores() {
        ResultSet rs=null;
        ArrayList<String[]> salida= new ArrayList<String[]>();
        try {
            rs=Consult2BD.consulta();
            while(rs.next()){
                //ID_Proyecto, Constructora, Numero_Habitaciones, Ciudad
                int ID=rs.getInt("ID_Proyecto");
                String constructora=rs.getString("Constructora");
                String nh=rs.getString("Numero_Habitaciones");
                String ciudad=rs.getString("Ciudad");
                salida.add(new String[]{ID+"",constructora,nh,ciudad});
                //System.out.println(String.format("%5d %-15s %-15s %-15s", ID,nombre,apellido,ciudad));
            }
        } catch (Exception e) {
            //TODO: handle exception
        }     
        return salida;   
    }    
}
