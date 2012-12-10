/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package connect;

import java.sql.*;


/**
 *
 * @author srth12
 */
public class Connect {

    /**
     * @param args the command line arguments
     */
    public Connection connect(){
        Connection con=null;
        try{
         Class.forName("com.mysql.jdbc.Driver");
           con=DriverManager.getConnection("jdbc:mysql://localhost:3306/sample","root","");

        
        
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        return con;
    }
}
