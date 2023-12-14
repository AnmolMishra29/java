/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package training;

/**
 *
 * @author mishr
 */
import java.io.*;
import java.util.regex.*;
public class Assignment5 {
    public static void main(String[]args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println("Enter Password");
        String str = br.readLine();
        
         String regex = "^(?=.*[0-9])"+ "(?=.*[a-z])(?=.*[A-Z])"+ 
                 //"(?=.*[@#$%^&+=])" +
                 "(?=\\S+$).{8,20}$";
         
        Pattern p = Pattern.compile(regex);
        if (str == null) {
            System.out.println("Invalid Password");
        }
         Matcher m = p.matcher(str);
          if(m.matches()){
              System.out.println("Valid Password");
          } 
          else{
              System.out.println("Invalid Password");
          }
    }
        
}
