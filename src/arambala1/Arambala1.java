
package arambala1;
import java.util.Scanner;
public class Arambala1 {
   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String name = null;
        double sci = 0;
        double his = 0;
        double ma = 0;
        double soc = 0;
        double art = 0;
        double totalmarks = 0;
        double totalper = 0;
        
        System.out.print("Enter name:");
        name = sc.nextLine();
        System.out.print("Enter Marks in Science: ");
        sci = sc.nextDouble();
        System.out.print("Enter Marks in History: ");
        his = sc.nextDouble();
        System.out.print("Enter Marks in Math: ");
        ma = sc.nextDouble();
        System.out.print("Enter Marks in Soc: ");
        soc = sc.nextDouble();
        System.out.print("Enter Marks in Arts: ");
        art = sc.nextDouble();
        totalmarks = sci+his+ma+soc+art;
        System.out.println("Total Marks: " +totalmarks);
        totalper = totalmarks/5;
        System.out.println("Total Percentage: " +totalper);
        
        if(totalper>=71 && totalper<=75){
            
            System.out.println("Remarks:Poor");
            System.out.println("Congrats: " +name+ " You passed");
          
            
        }
        else if(totalper>=76 && totalper<=80){
            
            System.out.println("Remarks:Fair");
            System.out.println("Congrats: " +name+ " You passed");
            
        }
        else if(totalper>=81 && totalper<=85){
            
            System.out.println("Remarks:Good");
            System.out.println("Congrats: " +name+ " You passed");
            
        }
        else if(totalper>=86 && totalper<=90){
            
            System.out.println("Remarks:Very Good");
            System.out.println("Congrats: " +name+ " You passed");
            
        }
        else if(totalper>=91 && totalper<=100){
            
            System.out.println("Remarks:Excellent");
            System.out.println("Congrats: " +name+ " You passed");
            
        }
        else
        {
            System.out.println("Try Again");
        }
        
       
        
     
   
    }
    
}
}