package codersbay;

import java.util.Scanner;

public class PrimelCheck {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("Von welcher Zahl möchtest du wissen ob es eine Primzahl ist?");
        int number = sc.nextInt();

        if(number == 1){
            System.out.println("Weißt du eigentlich wie Primzahlen funktionieren?");
        }
        else if(number == 2 || number == 3 || number == 5 || number == 7 || number == 11){
            System.out.println("Definitiv eine Primzahl!");
        }
        else if(number%2 == 0 || number%3 == 0 || number%5 == 0 || number%7 == 0 || number%11 == 0){
            System.out.println("Keine Primzahl!");
        }
        else {
            System.out.println("Definitiv eine Primzahl!");
        }
    }
}
