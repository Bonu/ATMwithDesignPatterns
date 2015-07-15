package edu.mum.cs.ds.atm;

import java.util.Scanner;
 
public class CashDispenseChain {
 
    private DispenseChain c1;
 
    public CashDispenseChain() {
        // initialize the chain
        this.c1 = new Dollar50Dispenser();
        DispenseChain c2 = new Dollar20Dispenser();
        DispenseChain c3 = new Dollar10Dispenser();
 
        // set the chain of responsibility
        c1.setNextChain(c2);
        c2.setNextChain(c3);
    }
 
    public boolean dispenseCash(double amount){
    	c1.dispense(new Currency(amount));
    	return true;
    }
    
    public static void main(String[] args) {
        CashDispenseChain atmDispenser = new CashDispenseChain();
        while (true) {
        	double amount = 0;
            System.out.println("Enter amount to dispense");
            Scanner input = new Scanner(System.in);
            amount = input.nextInt();
            if (amount % 10 != 0) {
                System.out.println("Amount should be in multiple of 10s.");
                return;
            }
            // process the request
            atmDispenser.c1.dispense(new Currency(amount));
        }
 
    }
 
}
class Dollar10Dispenser implements DispenseChain {
	 
    private DispenseChain chain;
     
    @Override
    public void setNextChain(DispenseChain nextChain) {
        this.chain=nextChain;
    }
 
    @Override
    public void dispense(Currency cur) {
        if(cur.getAmount() >= 10){
        	double num = cur.getAmount()/10;
        	double remainder = cur.getAmount() % 10;
            System.out.println("Dispensing "+num+" 10$ note");
            if(remainder !=0) this.chain.dispense(new Currency(remainder));
        }else{
            this.chain.dispense(cur);
        }
    }
 
}
class Dollar20Dispenser implements DispenseChain{
	 
    private DispenseChain chain;
     
    @Override
    public void setNextChain(DispenseChain nextChain) {
        this.chain=nextChain;
    }
 
    @Override
    public void dispense(Currency cur) {
        if(cur.getAmount() >= 20){
        	double num = cur.getAmount()/20;
        	double remainder = cur.getAmount() % 20;
            System.out.println("Dispensing "+num+" 20$ note");
            if(remainder !=0) this.chain.dispense(new Currency(remainder));
        }else{
            this.chain.dispense(cur);
        }
    }
 
}
class Dollar50Dispenser implements DispenseChain {
	 
    private DispenseChain chain;
     
    @Override
    public void setNextChain(DispenseChain nextChain) {
        this.chain=nextChain;
    }
 
    @Override
    public void dispense(Currency cur) {
        if(cur.getAmount() >= 50){
        	double num = cur.getAmount()/50;
        	double remainder = cur.getAmount() % 50;
            System.out.println("Dispensing "+num+" 50$ note");
            if(remainder !=0) this.chain.dispense(new Currency(remainder));
        }else{
            this.chain.dispense(cur);
        }
    }
 
}
interface DispenseChain {
	 
    void setNextChain(DispenseChain nextChain);
     
    void dispense(Currency cur);
}
class Currency {
	 
    private double amount;
     
    public Currency(double amt){
        this.amount=amt;
    }
     
    public double getAmount(){
        return this.amount;
    }
}