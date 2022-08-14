package Code.Model.BD;
import Code.Utilities.JDBCUtilities;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class Consult2BD {
    public static ResultSet consulta() {
        Connection conn=null;
        Statement stmt=null;
        ResultSet rs=null;
        String csql="SELECT ID_Proyecto, Constructora, Numero_Habitaciones, Ciudad FROM Proyecto WHERE Clasificacion=='Casa Campestre' AND Ciudad IN('Santa Marta', 'Cartagena', 'Barranquilla');";        
        try {
            conn=JDBCUtilities.conexion();
            stmt=conn.createStatement();
            rs=stmt.executeQuery(csql);
        } catch (Exception e) {
            //TODO: handle exception
        }
        return rs;
    }
}
