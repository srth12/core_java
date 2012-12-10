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
           con=DriverManager.getConnection("jdbc:mysql://localhost:3306/address_book","root","");

       
        
        }
        catch(Exception e){
            System.out.println(e.getMessage());
            
        }
        return con;
    }
     public static void main(String[] args)
     {Connect c=new Connect();
     Connection con=c.connect();
          System.out.println(con);
        }
//Connection con=connect();

}
