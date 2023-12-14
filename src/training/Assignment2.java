package training;
import java.io.*;
public class Assignment2 {

    public static void main(String[]args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Welcome to My Bank!\nHey user!\nEnter your balance:");
        int balance = Integer.parseInt(br.readLine());
        System.out.println("Enter your Transaction type\n1.Check Balance\n2.Withdraw\n3.Deposit");

        int i = Integer.parseInt(br.readLine());

        switch(i)
        {
            case 1 : 
                System.out.println(" Your Balance is "+balance);
                
            case 2 : 
                System.out.println("Enter withdrawal amount:");
                int wd = Integer.parseInt(br.readLine());
                if(wd>balance)
                {
                    System.out.println("Insufficient Balance");
                }
                else
                {
                    if((wd%100==0)|(wd%500==0))
                    {
                        System.out.println("Cash withdrawed is "+wd);
                        System.out.println("Your Current Balance is"+(balance-wd));
                    }
                    else
                    { System.out.println("Please enter Amount in multiples of 100 and 500");
                    int wdc = Integer.parseInt(br.readLine());
                    while((wdc%100!=0)& (wdc%500!=0))
                    {
                        System.out.println("Please enter Amount in multiples of 100 and 500");
                    }
                    System.out.println("Cash withdrawed is "+wdc);
                    System.out.println("Your Current Balance is"+(balance-wdc));
                    }
                }
            

            case 3 : 
                System.out.println("Enter Deposit Amount ");
                int deposit = Integer.parseInt(br.readLine());
                System.out.println("Amount Deposited is " + deposit);
                System.out.println("Your Current Balance is "+(balance+deposit));
            

            default : 
                System.out.println("Enter valid Transaction");
            
      }
   }

}