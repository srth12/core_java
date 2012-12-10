/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package readfiles;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;

/**
 *
 * @author srth12
 */
public class ReadFil {
    private String path;
    public ReadFil(String file_path){
        path=file_path;
    }
    public String[] OpenFile() throws IOException{
        FileReader fr=new FileReader(path);
        BufferedReader br=new BufferedReader(fr);
        String[] line=new String[1000];
        
        
          
        int i=0;
        while((line[i]=br.readLine()) !=null){
            ++i;Fil.l++;
            
        }
        br.close();
        return line;
    }
    
}
