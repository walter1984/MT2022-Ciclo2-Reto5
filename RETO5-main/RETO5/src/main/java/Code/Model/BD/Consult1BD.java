package Code.Model.BD;
import Code.Utilities.JDBCUtilities;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class Consult1BD {
    public static ResultSet consulta() {
        Connection conn=null;
        Statement stmt=null;
        ResultSet rs=null;
        String csql="SELECT ID_Lider,Nombre, Primer_Apellido,Ciudad_Residencia FROM Lider ORDER BY Ciudad_Residencia;";        
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
