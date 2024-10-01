package src.JavaWeek5Programs;

import java.util.Scanner;

public class Dice {
        static Scanner userinput = new Scanner(System.in); 
     public static void main(String[] args) {

        System.out.print("Let's roll some dice!\n");

        String yn = "y";

        while(yn.equals("y")){
            int d1 = (int)(Math.random()*6) +1;
            int d2 = (int)(Math.random()*6) +1;
            System.out.print("Dice 1 rolled: "+d1+"\n");
            System.out.print("Dice 2 rolled: "+d2+"\n");
            System.out.print("The sum of these dice rolls is: "+(d1+d2)+"\n");

            System.out.print("Would you like to roll again? (type y if yes): ");
            yn = userinput.nextLine();
        }
    }
}
