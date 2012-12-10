/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;
/**
 *
 * @author srth12
 */
public class Exceptions {
    public void ll(){
    try{
    int x=1,y=0,z;
    z=x/y;
    System.out.println(x);
}catch(Exception err){
    System.out.println(err.getMessage());
}
    }
}
