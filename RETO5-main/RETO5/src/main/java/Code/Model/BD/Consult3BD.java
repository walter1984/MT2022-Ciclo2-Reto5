package Code.Model.BD;

import Code.Utilities.JDBCUtilities;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class Consult3BD {
    public static ResultSet consulta() {
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
        String csql = "SELECT ID_Compra, Constructora, Banco_Vinculado FROM Compra JOIN Proyecto USING(ID_Proyecto) WHERE Proveedor=='Homecenter' AND Ciudad=='Salento';";
        try {
            conn = JDBCUtilities.conexion();
            stmt = conn.createStatement();
            rs = stmt.executeQuery(csql);
        } catch (Exception e) {
            // TODO: handle exception
        }
        return rs;
    }
}
