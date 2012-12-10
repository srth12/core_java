/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package readfiles;

import java.io.IOException;

/**
 *
 * @author srth12
 */
public class Fil {

    /**
     * @param args the command line arguments
     */
  public static int l=0;
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        String file="C:/Users/srth12/Documents/NetBeansProjects/ReadFiles/read.txt";
        ReadFil fi=new ReadFil(file);
        String[] b=new String[100];
        b=fi.OpenFile();
       
        int i=-1;
        while(++i<l)
        System.out.println(b[i]);
    }
}