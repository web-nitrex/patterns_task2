package com.company;

public class CreditRequest {
    private int number=0;
    private int amountLoan=0;
    private String firstName="";
    private String lastName="";
    private int age=0;
    private int averageIncome=0; //средний заработок в месяц
    private boolean goodCreditHistory=false;

    private static int counterRequest = 0;

    private double interestRate =0.0; //процентная ставка
    private int creditTerm=0;         //срок кредита (в месяцах)
    private int monthlyPayment=0;     //ежемесячный платеж


    public CreditRequest(int amountLoan, String firstName, String lastName, int age, int averageIncome, boolean goodCreditHistory, double interestRate, int creditTerm, int monthlyPayment) {
        this.amountLoan=amountLoan;
        this.number = getValueCounter();
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.averageIncome = averageIncome;
        this.goodCreditHistory = goodCreditHistory;
        this.interestRate = interestRate;
        this.creditTerm = creditTerm;
        this.monthlyPayment = monthlyPayment;
    }

    public int getAmountLoan() {
        return amountLoan;
    }

    private static int getValueCounter()
    {
        return ++counterRequest;
    }

    public int getNumber() { return number; }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public int getAverageIncome() {
        return averageIncome;
    }

    public boolean isGoodCreditHistory() {
        return goodCreditHistory;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public int getCreditTerm() {
        return creditTerm;
    }

    public int getMonthlyPayment() {
        return monthlyPayment;
    }
}
