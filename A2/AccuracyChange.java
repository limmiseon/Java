package sec03;

import java.util.Scanner;

public class AccuracyChange
{

    public static void main(String[] args)
    {
        System.out.println("#Menu");
        System.out.println("1. Coke - 340");
        System.out.println("2. Orange Juice - 500");
        System.out.println("3. milk - 650");
        System.out.println("4. Water - 290");
        System.out.println("5. Coffee - 170");
        System.out.println("-> ");
        Scanner sc = new Scanner(System.in);
        int inputData = sc.nextInt();
        int price = 0;
        if(inputData == 1) {
            price = 340;
        } else if(inputData == 2) {
            price = 500;
        } else if(inputData == 3) {
            price = 650;
        } else if(inputData == 4) {
            price = 290;
        } else {
            price = 170;
        }
        int change = 1000 - price;
        int totalchange = 1000 - price;

        int num1 = 0, num2 = 0, num3 = 0;
        num1 = change / 100;
        change %= 100;
        num2 = change / 50;
        change %= 50;
        num3 = change / 10;

        System.out.println("The change is " + totalchange + "(100 X " + num1 + ", 50 X " + num2 + ", 10 X " + num3 + ")");
    }
}