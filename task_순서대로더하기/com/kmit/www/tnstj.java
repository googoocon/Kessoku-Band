package com.kmit.www;
import java.util.Scanner;
public class tnstj {
    public static void main(String[] args) {
        int sum = 0;

        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        for(int i = a; i<=b; i++) {
            sum += i;

        }
        System.out.print("합계 : " + sum);
    }
}
