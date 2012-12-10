/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package exam;

/**
 *
 * @author srth12
 */
public class StudentResult {
   private String Full_name;
   private String Exam_name;
   private String Exam_score;
   private String Exam_Grade;
   
   StudentResult(){
       Full_name="Unknown";
       Exam_Grade="Unknown";
       Exam_score="Unknown";
       Exam_name="Unknown";
   }
   
   String fullName(String aName){
       Full_name=aName;
       return Full_name;
   }
    
   String examName(String examCode){
       switch(examCode){
           case "VB": Exam_name="Visual Basic";break;
           case "JV": Exam_name="Java";break;
           case "PH": Exam_name="PHP";break;
           
       }
   return Exam_name;
   }
   
   String egrade(int grade){
       Exam_Grade=grade+" Out of 50";
       return Exam_Grade;
   }
private String getGrade(int mark){
    if((0<= mark)|| (mark< 30)){
        Exam_Grade="B";
        
    }
    else if(mark>=30){
        Exam_Grade="A";
    }
    return Exam_Grade;
}

String examGrade(int mark){
    this.Exam_Grade=getGrade(mark);
    return this.Exam_Grade;
}

}

