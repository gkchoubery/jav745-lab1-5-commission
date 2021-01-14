package com.commission;

import java.util.Scanner;

public class CalculateSalary {
    public static void main(String[] args) {
        final double salesCommission = 20/100.0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter fixed salary of the employee");
        final double baseSalary = scanner.nextDouble();

        System.out.println("Enter total sale done in the current month");
        final double salesDone = scanner.nextDouble();

        // Commission
        final double commission = salesCommission * salesDone;
        System.out.println("Total commission earned for this month: " + commission);

        final double totalSalary = baseSalary + commission;
        System.out.println("Total salary received for the current month:" + totalSalary);

    }
}
