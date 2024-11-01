package com.example.lab1;

import lombok.Getter;
import lombok.Setter;

import java.util.Scanner;

@Getter
@Setter
public class SumAction {
    private Scanner sc = new Scanner(System.in);
    private int a;
    private int b;
    private int c;
    private double result;

    public SumAction() {
        System.out.print(" \nenter a = › ");
        int aValue = sc.nextInt();
        setA(aValue);

        System.out.print("enter b = > ");
        int bValue = sc.nextInt();
        setB(bValue);

        System.out.print("enter c = > ");
        int cValue = sc.nextInt();
        setC(cValue);

        result = Math.pow(b, 2) - 4 * a * c;
    }
}
