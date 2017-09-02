package org.project;

import org.project.typeCars.Bus;
import org.project.typeCars.Car;

import java.util.Scanner;

public class Building {
    public Building() {







        System.out.println("Hello from Fleet Management, please choose option: ");
        System.out.println("1. Cars type\n2. Cars available");

        Scanner scanner = new Scanner(System.in);
        Integer choseOption = scanner.nextInt();
        switch (choseOption){
            case 1:
                System.out.println("Choose type: ");
                System.out.println("1. Bus \n2. Car \n3. Truck");

                break;

            default:
                System.out.println("All cars are available");
        }









    }
}
