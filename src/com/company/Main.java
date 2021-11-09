package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        System.out.println(matchsticks());
    }
    public static int matchsticks() {
        Scanner input = new Scanner(System.in);
        int userInput = input.nextInt();
        int sticksNeeded = (6 * userInput) - (userInput-1);
        return sticksNeeded;
    }
}
