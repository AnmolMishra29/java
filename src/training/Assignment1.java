package training;
import java.io.*;
public class Assignment1 {
    public static void main(String[]args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    System.out.println("Enter Credit Score");
    int credit_score = Integer.parseInt(br.readLine());
    System.out.println("Enter Annual Income");
    int annual_income = Integer.parseInt(br.readLine());
    
    if((credit_score > 700) && (annual_income > 50000)){
        System.out.println("Eligible for Loan");
    }
    else{
        System.out.println("Not Eligible for Loan");
    }
    } 
}
