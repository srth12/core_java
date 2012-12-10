/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sockettest;

import java.io.*; 
import java.net.*; 
class TCPClientD {

    public static void main(String argv[]) throws Exception 
    { 
        String sentence; 
        String modifiedSentence;

        BufferedReader inFromUser = 
          new BufferedReader(new InputStreamReader(System.in));

        Socket clientSocket = new Socket("127.0.0.1", 6789);

        DataOutputStream outToServer = 
          new DataOutputStream(clientSocket.getOutputStream());

        BufferedReader inFromServer = 
          new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));

        sentence = inFromUser.readLine();

        outToServer.writeBytes(sentence + '\n');

        modifiedSentence = inFromServer.readLine();

        System.out.println("FROM SERVER: " + modifiedSentence);

        clientSocket.close(); 
                   
    } 
}


