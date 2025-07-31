
package arambala1;

import java.util.Scanner;
import loidarams.bankingclass;
public class activity5arambala {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("HELLO WELCOME TO THE SYSTEM!");
        System.out.println("What do you feel doing today? ");
        System.out.println("1. Banking");
        System.out.println("2. Doctors Appointment");
        System.out.println("3. Shopping");
        
        System.out.print("Enter choice: ");
        int choice = sc.nextInt();
        
        switch(choice){
            case 1:
                bankingclass bc = new bankingclass();
                int attempts = 0;
                boolean isLoggedIn = false;
                
                
                while(attempts < 3 && !isLoggedIn){
                    System.out.println("Enter your Account No: ");
                    int accountNo = sc.nextInt();

                    System.out.println("Enter your Pin: ");
                    int pin = sc.nextInt();

                    if(bc.verifyAccount(accountNo, pin)){
                        System.out.println("LOGIN SUCCESS");
                        isLoggedIn = true; 
                    } else {
                        attempts++;
                        System.out.println("INVALID ACCOUNT! You have " + (3 - attempts) + " attempt(s) remaining.");
                    }

                    if(attempts == 3) {
                        System.out.println("Too many failed attempts. Account locked.");
                    }
                }
                
                break;
            case 2:
              
                break;
            case 3:
                
                
                break;
            default:
                System.out.println("Invalid Selection!");
        }
    }
}
