package com.wipro.bank.main;

import com.wipro.bank.service.BankService;

import java.util.Scanner;

import com.wipro.bank.exception.BankValidationException;

public class Main {
    public static void main(String args[]) throws BankValidationException {
    	Scanner sc = new Scanner(System.in);
    	float principal = sc.nextFloat();
    	int tenure = sc.nextInt();
    	String gender = sc.next();
    	int age= sc.nextInt();
        BankService bank = new BankService();
        bank.calculate(principal, tenure, gender, age);
        
    }
}
