package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scan=new Scanner(System.in);
        Random rastgele=new Random();
        System.out.println("How many random numbers should be printed?");
        int again=Integer.valueOf(scan.nextLine());
        for (int i = 0; i < again ; i++) {
            int number=rastgele.nextInt(11);
            System.out.println(number);
        }
    }
}
