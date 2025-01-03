package app;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static int num;
    static int count;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("-------------------------------------" +
                "\n1.Square of a number");
        System.out.print("Enter number for calculate it square: ");
        num = scanner.nextInt();
        int square = calculateSquareNum(num);
        System.out.println("Square of number " + num + " = " + square);
        System.out.println("---------------------------" +
                "\n2.Calculating a volume of cylinder");
        System.out.print("Enter radius: ");
        double radius = scanner.nextDouble();
        System.out.print("Enter high: ");
        double high = scanner.nextDouble();
        if(radius <= 0 || high <= 0){
            System.out.println("Error! Radius and high can not be less or equals 0");
        }else {
            double volume = calculateCylinderVolume(radius, high);
            System.out.println("The volume of cylinder with radius " + radius + " and high "
                    + high + " equals " + volume);
        }
        System.out.println("----------------------------" +
                "\n3.Calculating the sum of array value");
        System.out.print("Enter size: ");
        int size = scanner.nextInt();
        if (size <= 0){
            System.out.println("Error! Size of array can not be less or equals 0");
        }else {
            int[] array = new int[size];
            count = 0;
            System.out.println("Enter numbers: ");
            do {
                int arrayNumber = scanner.nextInt();
                array[count] = arrayNumber;
                count++;
            } while (count < size);
            int sum = calculateArraySum(array);
            System.out.println("The sum value of array" + Arrays.toString(array) + " is " + sum);
        }
        scanner.nextLine();
        System.out.println("--------------------------" +
                "\n4.Turn the row over");
        System.out.print("Enter row: ");
        String row = scanner.nextLine();
        String invertedRow = turnTheRowOver(row);
        System.out.println("Inverted row is " + invertedRow);
        System.out.println("----------------------------" +
                "\n5.raise to a power ");
        System.out.print("Enter number: ");
        num = scanner.nextInt();
        System.out.print("Enter power of a number: ");
        int power = scanner.nextInt();
        int result = raiseToAPower(num, power);
        System.out.println("Result " + num + "^" + power + " = " + result);
        System.out.println("-------------------------" +
                "\n6.Repeat a text message");
        System.out.print("Enter number of plays: ");
        num = scanner.nextInt();
        scanner.nextLine();
        if(num <= 0 ){
            System.out.println("Error! Number of plays can not be less or equals 0");
        }else {
            System.out.print("Enter a text for playing: ");
            String text = scanner.nextLine();
            repeatText(num, text);
        }
    }

    private static int calculateSquareNum(int num) {
        return num * num;
    }

    private static double calculateCylinderVolume(double radius, double high) {
        return radius * high;
    }

    private static int calculateArraySum(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }

    private static String turnTheRowOver(String row) {
        //coздаём объект StringBuilder с именем inverting и передаём в него значение  row
        StringBuilder inverting = new StringBuilder(row);
        //переворачиваем строку с помощью метода reverse() который встроен в StringBuilder
        inverting.reverse();
        // возвращаем значение row обратно в строковое
        String invertedRow = inverting.toString();
        return invertedRow;
    }

    private static int raiseToAPower(int a, int b) {
        int res = (int) Math.pow(a, b);
        return res;
    }

    private static void repeatText(int a, String text) {
        int count = 0;
        while (count < a) {
            count++;
            System.out.println(count + ") " + text);
        }
    }

}
