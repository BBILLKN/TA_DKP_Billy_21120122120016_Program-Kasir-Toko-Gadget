/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package alpro.smt2;

/**
 *
 * @author BILL_0058
 */
import java.util.Scanner;

public class contohgcd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan bilangan pertama: ");
        int num1 = input.nextInt();

        System.out.print("Masukkan bilangan kedua: ");
        int num2 = input.nextInt();

        int gcd = findGCD(num1, num2);

        System.out.println("FPB dari " + num1 + " dan " + num2 + " adalah " + gcd);
    }

    public static int findGCD(int num1, int num2) {
        if (num2 == 0) {
            return num1;
        } else {
            return findGCD(num2, num1 % num2);
        }
    }
}
