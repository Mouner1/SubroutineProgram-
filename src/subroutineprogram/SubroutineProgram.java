/*
    Mouner Dabjan
    November 12 2018
    Making methods 
 */

package subroutineprogram;
import java.util.Scanner; 
/**
 *
 * @author modab5310
 */
public class SubroutineProgram {

    /**
     * @param args the command line arguments
     */
    
    

    public static void main(String[] args) {     // main run of the program 
        
        Scanner keyedInput = new Scanner(System.in); // scanner that gets user input
        int choice;                                  // declaring the variable of choices 
        
        System.out.println("Please chose on of the mathmetical calculations to perfrom: ");  // introducing the choices to the user 
        System.out.println("");
        System.out.println("1. Find the average of 5 numbers");
        System.out.println("2. Finding the missing angle in a triangle");
        System.out.println("3. Finding the speed of an object");
        System.out.println("4. Finding the perimeter of a square");
        System.out.println("5. Determing the slope of a line");
        choice = keyedInput.nextInt();
        
        
        if (choice ==1)  
        {
            int number1;           // variables neeeded if user chose choice 1 
            int number2;
            int number3;
            int number4;
            int number5; 
            
            System.out.println("Enter the five nu0mbers you want to get the average of: "); // getting the user's input 
            number1  = keyedInput.nextInt();
            number2 = keyedInput.nextInt();
            number3 = keyedInput.nextInt();
            number4 = keyedInput.nextInt();
            number5 = keyedInput.nextInt();
            
            avgAndOut(number1,number2,number3,number4,number5); // calling the private method that includes the algrotithm and output
            
        }
        
        if (choice==2)
        {
            int angle1;  //variables needed if the user chose choice 2 
            int angle2; 
            
            
            System.out.println("Enter the value of two of the angles in the triangle: "); //getting the user's input 
            angle1 = keyedInput.nextInt();
            angle2 = keyedInput.nextInt(); 
            
          angAndOut(angle1,angle2);   // calling the private method that includes the algrotithm and output
            
        }
        
        if (choice==3)
        {
            int distance;  //variables needed if user chose choice 3
            int time; 
            
            System.out.println("Enter the distance of the object: ");  //getting the user's input 
            distance = keyedInput.nextInt();
            
            System.out.println("Enter the time of the object: ");
            time = keyedInput.nextInt();
            
            
            spedAndOut(distance, time); // calling the private method that includes the algrotithm and output
            
            
            
        }
        
        if (choice==4)
        {
             int side1;   //variables needed if the user chose choice 4 
             int side2;
             int side3;
             int side4; 
             
             System.out.println("Enter the measure of the four square sides: "); //getting the user's input 
             side1 = keyedInput.nextInt();
             side2 = keyedInput.nextInt();
             side3 = keyedInput.nextInt();
             side4 = keyedInput.nextInt(); 
             
             
             parAndOut(side1,side2,side3,side4); // calling the private method that includes the algrotithm and output
             
        }
        
        if (choice ==5)
        {
            int xfirst;    //variables needed if the user chose option 5
            int yfirst;
            int xsecond;
            int ysecond; 
            
            System.out.println("Enter the coordinates of the two points, x-y " );  //getting the user's input 
            xfirst = keyedInput.nextInt();
            yfirst = keyedInput.nextInt();
            xsecond = keyedInput.nextInt();
            ysecond = keyedInput.nextInt();
            
            slopAndOut(xfirst,yfirst,xsecond,ysecond); // calling the private method that includes the algrotithm and output
            
        }
    }
    
   public static void avgAndOut(int n1, int n2, int n3, int n4, int n5)  //declaring the variables 
   {         
      int  answer = (n1+n2+n3+n4+n5) /5;   //algorithm of the average 
        
      
        System.out.println("The average of the numbers you entered is " + answer); //output 
    }
   
   public static void angAndOut (int n1,int n2)  //declaring the variables 
   {
       int missing = 180 - (n1+n2);   //algorithm 
       
       System.out.println("The value of the missing angle in the triangle is " + missing ); //output 
   }
   
   public static void spedAndOut (int n1,int n2)  //declaring the variables 
   {
       int speed = n1/n2;  //algorithm 
       System.out.println("The speed of the object is " + speed); //output 
   }
   
   public static void parAndOut (int n1, int n2, int n3, int n4) //declaring the variables 
   {
       int parameter = n1 + n2 + n3 + n4; //algorithm 
       
       System.out.println("The parameter of the square is " + parameter);  //output 
      
}
   
   public static void slopAndOut (int n1, int n2, int n3, int n4)  //declaring the variables 
   {
       int slope = (n4 - n2) / (n3 - n1);  //algorithm 
       
       System.out.println("The slope of the line is " + slope);  //output 
   }
