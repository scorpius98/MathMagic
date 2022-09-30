    // Impoprt Declarations
    import java.util.Scanner;
/**
 * Title: Mathmagic
 * 
 * Program Summary: This program uses operators, print statements and scanner imputs to execute a magic trick with numbers.
 * 
 * Program Element List: Class, Constructor, Main
 * 
 * @author: Terrence Kamimura
 * @version: 2022-09-21
 */
public class MathMagic
{
    /**
     * Constructor for objects of class MathMagic
     */
    public MathMagic()
    {
        //Global Instance Variables
    } //End of constructor
    
    /**
     * main method (entry to program)
     * 
     * @param: I don't know shit
     * @return: none
     */
    public static void main (String [] args)
    {
        // put your code here
        
        //Variable Declarations
        int myNumber;
        int stepOne;
        int stepTwo;
        int stepThree;
        int stepFour;
        int stepFive;
        int stepSix; 
        
        System.out.print("\f");
        System.out.println("Welcome to Mathemagician!");
        System.out.println("----------------------------------------");
        System.out.println();
        System.out.println("Wanna see a sick magic trick?");
        System.out.println("Well, watch this!");
        System.out.println("Give me any number and we'll put it through the steps...");
        System.out.println("And believe it or not, it will ALWAYS equal 3!!!");
         while(true) {
             // The following program is looped
             
             // variable assignments
             Scanner scan = new Scanner(System.in);
             myNumber = scan.nextInt();
             stepOne = myNumber*myNumber;
             stepTwo = stepOne+myNumber;
             stepThree = stepTwo/myNumber;
             stepFour = stepThree+17;
             stepFive = stepFour-myNumber;
             stepSix = stepFive/6;
             
             System.out.println ();
             System.out.print("Give me a number!!"); 
             scan.close();
             
             // clearing console
             System.out.print("\f");
             
             //explanation of steps
             System.out.println("Great, we'll use " + myNumber + "!");
             System.out.println("First, let's multiply " + myNumber + " by itself to get " + stepOne + "!");
             System.out.println("Next, we'll add our original " + myNumber + " to " + stepOne + ", and now we have " + stepTwo + "!");
             System.out.println("Now, divide " + stepTwo + " by the " + myNumber + " to get " + stepThree + "!");
             System.out.println("Then we'll add 17 to " + stepThree + " and get " + stepFour + "!");
             System.out.println("And, we'll subtract the " + myNumber + " from " + stepFour + "!");
             System.out.println("Finally! We will divide " + stepFive + " by 6!");
                 if (stepSix != 3) {
                 // used for debugging
                 System.out.println("**** you probably did something");
            }   else {
                 //normal end message
                 System.out.println("And, we get..." + stepSix + "!" + " HOW COOL IS THAT!?");
                 System.out.println();
                 System.out.println("Thank you very much, AMAZING users for taking part in this AMAZING magic trick!");
                 System.out.println();
                 System.out.println("Doubtful? Enter a different number below!");
                 System.out.println("I guarantee you will always get 3!!!");
            } // End of if else statement
        } // End of loop
    } //End of main
} //End of class
 /*
  * Notes
  * 
  * 
  * 
  * 
  * Test Code
  * 
  * 
  */