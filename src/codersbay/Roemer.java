package codersbay;

import java.util.Scanner;

public class Roemer {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Welche Zahl soll verrömert werden?(1-100)");
        int number = sc.nextInt();
        String output = "";

        if (number < 1 || number > 100) {
            System.out.println("Erlaubten Zahlenbereich beachten!");
        }
        char[] ziffern = {'I', 'V', 'X', 'L', 'C'};
        int[] wert = {1, 5, 10, 50, 100};

        if (number == 100) {
            System.out.println(ziffern[4]);

        } else if (number >= 90 && number < 100) {
            number -= 90;
            output = output + ziffern[2] + ziffern[4];
        }
        if (number >= 80) {
            number -= 80;
            output = output + ziffern[2] + ziffern[2] + ziffern[4];
        }

        if (number > 50) {
            number -= 50;
            output = output + ziffern[3];
        }

        if (number == 50) {
            number -= 50;
            output = output + ziffern[3];
        }

        if (number >= 40) {
            number -= 40;
            output = output + ziffern[2] + ziffern[3];
        }

        if (number >= 30) {
            number -= 30;
            output = output + ziffern[2] + ziffern[2] + ziffern[2];
        }

        if (number >= 20) {
            number -= 20;
            output = output + ziffern[2] + ziffern[2];
        }

        if (number > 10) {
            number -= 10;
            output = output + ziffern[2];
        }

        if(number == 9) {
            number -= 9;
            output = output+ziffern[0]+ziffern[2];
        }

        if(number == 8){
            number-= 8;
            output = output+ziffern[0]+ziffern[0]+ziffern[2];
        }

        if (number >= 5) {
            number -= 5;
            output = output + ziffern[1];
        }
        if (number == 4) {
            number -= 4;
            output = output + ziffern[0] + ziffern[1];
        }

        if (number == 3) {
            number -= 3;
            output = output + ziffern[0] + ziffern[0] + ziffern[0];
        }

        if (number == 2) {
            number -= 2;
            output = output + ziffern[0] + ziffern[0];
        }

        if (number == 1) {
            number -= 1;
            output = output + ziffern[0];
        }


        System.out.println(output);

    }
}
