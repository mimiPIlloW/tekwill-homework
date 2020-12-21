package com.tekwill.learning.datatypes.operators;

import java.util.Scanner;

public class BalanceOnALoan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter amount of loan:");
        double loan = scanner.nextDouble();
        System.out.println("Enter interest rate:");
        double rate = scanner.nextDouble();
        System.out.println("Enter monthly payment:");
        double payment = scanner.nextDouble();

        double monthly_rate = loan * (rate / 100) / 12;
        System.out.println(monthly_rate);

        double balanceFirstPayment = loan - payment + monthly_rate;
        double balanceSecondPayment = balanceFirstPayment - payment + monthly_rate;
        double balanceThirdPayment = balanceSecondPayment - payment + monthly_rate;

        System.out.println("Balance remaining after first payment: $" + balanceFirstPayment);
        System.out.println("Balance remaining after second payment: $" + balanceSecondPayment);
        System.out.println("Balance remaining after third payment: $" + balanceThirdPayment);
    }
}

