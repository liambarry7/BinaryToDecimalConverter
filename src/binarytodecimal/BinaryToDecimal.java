package binarytodecimal;

import java.util.Scanner;
public class BinaryToDecimal {

    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int[] binary = new int[8];
        int p = 0;
        int finalValue = 0;
        
        
        
        System.out.println("Enter your 8-bit binary number digit by digit");


        
        for (int i = 0; i < binary.length; i++) { //gets binary numbers
            int userBinary = input.nextInt();
            binary[i] = userBinary;            
        }
        
        for (int i = 0; i < binary.length; i++) {
        System.out.print(binary[i]); //prints binary numbers in one line
            
        }
        
        System.out.println("\n");
        
        
        for (int i = 7; i >= 0; i--) {
            
            
            double power = Math.pow(2, p); //Get base system number t o be used as power
            int toThePower = (int) power; //converts double into int
            p++; //adds 1 to p so that the power increase by 1 each time
            
            int denary = binary[i] * toThePower; //times binary number by base power
            finalValue = finalValue + denary;
            
            //System.out.println(binary[i] * toThePower);
            
        }
        
        
        System.out.println(finalValue);
    }
    
}
