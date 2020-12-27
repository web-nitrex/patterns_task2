package com.company;

public class ComplianceCheck extends Checker{
    @Override
    public boolean analysisRequest(CreditRequest request)
    {
        if( (request.getAge()<18) ||
            (request.isGoodCreditHistory()==false) ||
            (request.getAverageIncome() <= request.getMonthlyPayment()))
        {
            System.out.println("Заявка #"+request.getNumber()+" не прошла комплаенс  проверку!");
            return false;
        }

        System.out.println("Комплаенс проверка заявки #"+request.getNumber()+" прошла успешно!");
        return true;
    }
}
