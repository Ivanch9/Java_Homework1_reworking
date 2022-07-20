package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("please enter the 1st number: ");
            String firstNumber = sc.next().toLowerCase();
            if (firstNumber.equals("stop")) {
                break;
            }
            int intfirstNumber = Integer.parseInt(firstNumber.trim());

            System.out.print("please enter the 2nd number: ");
            String secondNumber = sc.next().toLowerCase();
            if (secondNumber.equals("stop")) {
                break;
            }
            int intsecondNumber = Integer.parseInt(secondNumber.trim());

            //System.out.println(secondNumber);
            System.out.print("please enter +,-,*,/ :");
            String operation = sc.next().toLowerCase();
            //System.out.println(operation);
            if (operation.equals("stop")) {
                break;
            }

            int a;
            switch (operation)
            {
                case "-":
                    a = intfirstNumber - intsecondNumber;
                    System.out.println(intfirstNumber + "-" + intsecondNumber + "=" + a);
                    break;
                case "+":
                    a = intfirstNumber + intsecondNumber;
                    System.out.println(intfirstNumber + "+" + intsecondNumber + "=" + a);
                    break;
                case "*":
                    a = intfirstNumber * intsecondNumber;
                    System.out.println(intfirstNumber + "*" + intsecondNumber + "=" + a);
                    break;
                case "/":
                    if (intsecondNumber==0) {
                        System.out.println("division by zero");
                        break;
                    }
                    a = intfirstNumber / intsecondNumber;
                    System.out.println(intfirstNumber + "/" + intsecondNumber + "=" + a);
                    break;
                default:
                    System.out.println("transaction entry error");
            }
        }
    }
}
