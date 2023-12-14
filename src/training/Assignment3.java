package training;
import java.io.*;
public class Assignment3 {
    public static void main(String[]args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      System.out.println("Enter Number of Customers");
      int num = Integer.parseInt(br.readLine());
      int bal[] = new int[num];
      double total_amount[] = new double[num];
      
      System.out.println("Enter balance");
      for(int i = 0; i<num;i++){
          bal[i] = Integer.parseInt(br.readLine());
      }
      System.out.println("Enter Rate Of Interest");
      int rate = Integer.parseInt(br.readLine());
      System.out.println("Enter Number of Years");
      int time = Integer.parseInt(br.readLine());
      for(int i = 0; i<num;i++){
          total_amount[i] = (bal[i]*Math.pow((1 + (rate/100.0)),time));
      }
      
      System.out.println("Total Balance");
      for(int i = 0; i<num;i++){
          System.out.println(total_amount[i]);
      }
      
    }
}
