package com.company;

public class CompletenessRequest extends Checker{
    @Override
    public boolean analysisRequest(CreditRequest request)
    {
        if((request.getFirstName()==null || request.getFirstName()=="") ||
            (request.getLastName()==null || request.getLastName()=="") ||
            (request.getAge()<=0) ||
            (request.getAverageIncome()<=0) ||
            (request.getInterestRate()<=0.0)  ||
            (request.getCreditTerm()<=0) ||
            (request.getMonthlyPayment()<=0) ||
            (request.getAmountLoan()<=0))
        {
            System.out.println("Заявка #"+request.getNumber()+" не прошла проверку на полноту заполнения!");
            return false;
        }

        System.out.println("Проверка заявки #"+request.getNumber()+" на полноту заполнения прошла успешно!");
        return true;
    }
}
