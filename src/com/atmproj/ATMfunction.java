package com.atmproj;

import java.util.Scanner;

public class ATMfunction {
    float balance;
    int pin=1234;

    public void pin(){
        System.out.println("Enter your pin");
        Scanner sc=new Scanner(System.in);
        int enterpin= sc.nextInt();
        if(enterpin==pin) {
            System.out.println("Welcome");
            Menu();
        }else
            System.out.println("you entere wrong pin");
            pin();
        }

    private void Menu() {
        System.out.println("Choose correct option::");
        System.out.println("Press 1: Check Accout balance");
        System.out.println("Press 2: Deposit money");
        System.out.println("Press 3: Withdraw Money");
        System.out.println("Press 4: Exit");
        Scanner sc=new Scanner(System.in);
        int option= sc.nextInt();
        switch (option){
            case 1:
                checkAccountBalance();
                Menu();
                break;
            case 2:
                depositMoney();
                Menu();
                break;
            case 3:
                WithdrawMoney();
                Menu();
                break;
            case 4:
                Exit();
                Menu();
                break;
            default:
                System.out.println("Choose Correct Option");
                Menu();
        }
    }



    private void WithdrawMoney() {
        System.out.println("Enter amount to withdraw Money");
        Scanner sc=new Scanner(System.in);
        float withdrawAmount=sc.nextFloat();
        if(withdrawAmount>balance){
            System.out.println("You have no sufficient fund");
        }else {
            balance-=withdrawAmount;{
                System.out.println("Success");
            }
        }
    }

    private void depositMoney() {
        System.out.println("Enter Amount to Deposit Money");
        Scanner sc=new Scanner(System.in);
        float amount=sc.nextFloat();
        balance+=amount;
    }

    private void checkAccountBalance() {
        System.out.println("Your current Balance is"+balance);
    }

    private void Exit() {
        System.out.println("Are you sure to exit (Y/N)");
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        if(str.equalsIgnoreCase("y")){
            System.out.println("Thanks for visiting");
        }else {
            Menu();
        }
    }
}
