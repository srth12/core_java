/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sqlconnection;
import java.sql.*;

/**
 *
 * @author srth12
 */
public class Sqlconnection {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        // TODO code application logic here
        try{
        Class.forName("com.mysql.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/sample","root","");
        Statement state=con.createStatement();
        int k=state.executeUpdate("insert into sar values('4','Nishu')");
        System.out.println("k="+k);
        ResultSet s=state.executeQuery("select * from sar");
//        PreparedStatement statement=con.prepareStatement("insert into sar values('2','Annan')");
//         PreparedStatement statement=con.prepareStatement("select * from sar");
//        ResultSet result=statement.executeQuery();
        while(s.next()){
            System.out.println(s.getString(1)+" "+s.getString(2));
        }
        
        }catch(Exception e){
        System.out.println(e.getMessage());
        }
    }
}
