/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package exam;

/**
 *
 * @author srth12
 */
public class ExamDetails {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        StudentResult aStudent=new StudentResult();
        String ename=aStudent.examName("VB");
        System.out.println(ename);
    
    }
}
