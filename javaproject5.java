package com.company;
import java.util.*;

public class Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please insert any number");
        int n = sc.nextInt();
        boolean isPrime = true;
        for (int i = 2; i < n; i++)
        {
            if (n%i == 0)
            {
                isPrime = false;
                System.out.println(n + " is not a Prime Number.");
                break;
            }
        }
        if (isPrime)
        {
            System.out.println(n + " is a Prime Number.");
        }
    }
}
