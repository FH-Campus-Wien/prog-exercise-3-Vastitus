package at.ac.fhcampuswien;

import java.util.Random;
import java.util.Scanner;

public class App {

    // Implement all methods as public static
    public static void oneMonthCalendar(int tagemax, int start) {
        for (int i = 0; i < start - 1; i++) System.out.print("   ");
        int spaltemax = 7;
        int monatstag = 1;
        for (int zeile = 0; ; zeile++) {
            int tage = spaltemax - (start - 1);
            for (int i = 0; i < tage; i++) {
                if (monatstag < 10) {
                    System.out.print(" ");
                }
                System.out.print(monatstag + " ");
                monatstag++;
                if (monatstag > tagemax) {
                    System.out.print(System.lineSeparator());
                    return;
                }
            }
            start = 1;
            System.out.print(System.lineSeparator());

        }

    }

    public static long[] lcg(long seed) {
        //seed = 12345;
        long[] generator = new long[10];
        generator[0] = number(seed);
        for (int i = 1; i < generator.length; i++) {
            generator[i] = number(generator[i - 1]);
        }
        return generator;
        // System.out.println(generator);
    }

    public static long number(long seed) {
        int c = 12345;
        long a = 1103515245;
        long m = 2147483648L;

        //Xi+1 = (aXi + c) mod m
        return (a * seed + c) % m;

    }

    public static void guessingGame(int numberToGuess) {
        int z = 1;
        Scanner sc = new Scanner(System.in);
        for (int i = 1; i <= 10; i++, z++) {
            System.out.print("Guess number " + z + ": ");
            if (z == 10) {
                System.out.println("You lost! Have you ever heard of divide & conquer?");
                break;
            }
            int number = sc.nextInt();
            if (numberToGuess < number) {
                System.out.println("The number AI picked is lower than your guess.");
            }
            if (numberToGuess > number) {
                System.out.println("The number AI picked is higher than your guess.");
            }
            if (numberToGuess == number) {
                System.out.println("You won wisenheimer!");
                break;
            }

        }
    }


    public static int randomNumberBetweenOneAndHundred() {
        Random random = new Random();
        return random.nextInt(99) + 1;

    }

    public static boolean swapArrays(int[] arr1, int[] arr2) {
        //lang(arr1,arr2); mit der klasse unten, geht aber glaub ich net
        int hold = 0;
        if (lang(arr1, arr2)) {
            for (int i = 0; i < arr1.length; i++) {
                hold = arr1[i];
                arr1[i] = arr2[i];
                arr2[i] = hold;
            }
            return true;
        }
        return false;
    }

    static public boolean lang(int[] arr1, int[] arr2) {
        return arr1.length == arr2.length;
    }

    public static int checkDigit(int[] arr) {
        int summe = 0;
        for (int i = 0; arr.length > i; i++) {
            arr[i] = arr[i] * (i + 2);
        }
        for (int i = 0; arr.length > i; i++) {
            summe = arr[i] + summe;
        }
        int rest = summe % 11;
        int diff = 11 - rest;
        if (diff == 10) return 0;
        if (diff == 11) return 5;
        else return diff;
    }

    public static int randomNumberToNine() {
        Random random = new Random();
        return random.nextInt(9);
    }

    public static void main(String[] args) {
        // test your method implementations here
        // make method calls
        // print their results
        // etc.
        //guessingGame(randomNumberBetweenOneAndHundred());
    }
}