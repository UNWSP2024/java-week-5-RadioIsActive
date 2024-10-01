package src.JavaWeek5Programs;

import java.util.Scanner;

public class AddTable {
    static Scanner userinput = new Scanner(System.in); 
     public static void main(String[] args) {

        int row,col,answer;
        
        int num;
        System.out.print("Please enter a number between 3 and 20: ");
        num = userinput.nextInt();
        if (num > 20 || num < 3){
            System.out.print("Please enter a valid number between 3 and 20: ");
            num = userinput.nextInt();
        System.out.print("You picked "+num+", heres the addition table: \n");
        }

        for(row=1;row<=num;row++){
            for(col=1;col<=num;col++){
                answer = row+col;
                System.out.printf("%4d ", answer);
            }
            System.out.println();
        }

     }
}
