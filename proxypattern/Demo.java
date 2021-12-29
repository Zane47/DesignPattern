package DesignPattern.proxypattern;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        int n = 0;
        int v1 = 11;
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入整数：");
        int v110 =scanner.nextInt();

        if (v110 == v1) {
            System.out.println("==");
            n++;
            if (n >= 1) {
                // break;
            }

        }
        else {
            System.out.println("!=");
        }

        System.out.println("end");
    }





}




