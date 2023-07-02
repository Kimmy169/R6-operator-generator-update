package com.mycompany.r6_update;

import java.util.Scanner;


public class Main extends Management {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String vstup;
        do{
        System.out.println("Co chcete udelat:\n1) uprava databaze\n2) pouzivat aplikaci\n3) exit");
        vstup = scanner.nextLine();
        
        switch (vstup){
            case "1" -> 
                System.out.println("xd");
            case "2" -> 
                System.out.println("xd");
            case "3" -> 
                System.out.println("xd");
        }
        }while (!"3".equals(vstup));
        
    }
}
