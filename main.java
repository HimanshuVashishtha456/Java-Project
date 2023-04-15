import java.io.*;
import java.util.*;
public class main {
    public static void main(String[] args){
        while (true) {
        System.out.println("Welcome! We provide quality services to our Customers");
        System.out.println("Please enter the task you are expecting from us");
        System.out.println("PRESS 1- For getting cleaners for your company or house or may be for differnt places");
        System.out.println("PRESS 2- For getting registered yourself as an employee");
        System.out.println("PRESS 3- For talking to our customer care service ");
        System.out.println("PRESS 4- For exit");
        Scanner sc=new Scanner(System.in);
             int choice= sc.nextInt();
             String feed;
             if(choice>=1 && choice<=3)
             {
                 switch(choice) {

  case 1: 

     int rooms;
     System.out.println("Enter the number of rooms you have for cleaning");
     rooms=sc.nextInt();
     if(rooms==2)
     {
     System.out.println("Acoording to me you need  " + 1 + "  person for cleanning");
    
          System.out.println("  Your bill= "+6000);
          System.out.println("Please give your valuable feedback");
          System.out.println("You have to enter in 1 word like verygood,good,bad or very bad ");
             
    feed=sc.next();
     
          System.out.println("Thank you for your valuable feedback");
       
     }
     else
     {
       System.out.println("According to me you need " +rooms/2+ " person ");
      
       System.out.println("Your bill= "+(rooms/2)*6000);
       System.out.println("We can give you maxmimum discount of 20%");
       System.out.println("After discount Your bill= "+(rooms/2)*60*80); 
       System.out.println("Please give your valuable feedback");
       System.out.println("You have to enter in 1 world like verygood,good,bad or very bad");

    feed=sc.next();
     
       System.out.println("Thank you for your valuable feedback");
       
         
         
     }
    
    
  break;
  case 2:
          System.out.println("Enter your Name");
        String Name=sc.next();
          System.out.println("Enter your Surname");
        String surname=sc.next();
          System.out.println("Enter your Aadhar number");
        long aadhar=sc.nextLong();
          System.out.println("Enter your Phone number");
        long phone=sc.nextLong();
          System.out.println("Thank you for registering we will verify and call you shortly");
       
    
  break;
  case 3:
             System.out.println("Please enter your phone number");
           long ph=sc.nextLong();
             System.out.println("Thank you for registering we will call you shortly");
             
  default:
             System.out.print("");
    
}
           }

  if(choice==4)
  {
      System.out.print("Come back soon buddy we hoop you enjoyed our services");
  
  break;
      
  }
  else
    System.out.println("Please enter the correct choice");
             }
        }
           
           
    }
    