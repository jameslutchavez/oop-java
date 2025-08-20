package controlstructures;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
public class Problem10 {
    
}



    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input the number: ");
        int rows = scanner.nextInt();

        for (int i = 0; i < rows; i++) {
           
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            
            for (int k = 0; k < rows - i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        scanner.close();
    }


