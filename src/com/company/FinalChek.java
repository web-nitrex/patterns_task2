package com.company;

public class FinalChek extends Checker{
    @Override
    public boolean analysisRequest(CreditRequest request)
    {
        if( (request.getCreditTerm()<6)||
            (request.getInterestRate()<7.3)||
            (request.getAverageIncome() <= request.getMonthlyPayment())||
            (request.getAmountLoan()>9_000_000))
        {
            System.out.println("Заявка на кредит #"+request.getNumber()+" отклонена!");
            return false;
        }

        System.out.println("Заявка на кредит #"+request.getNumber()+" одобрена!");
        return true;
    }
}
