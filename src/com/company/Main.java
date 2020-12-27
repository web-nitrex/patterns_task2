package com.company;

public class Main {

    public static void main(String[] args) {
	    CreditRequest requestVasya = new CreditRequest(500000,
                                                     "Vasya",
                                                     "Petrov",
                                                         22,
                                                 70000,
                                               true,
                                                    7.8,
                                                     18,
                                                23000);

        CreditRequest requestVova = new CreditRequest(800000,
                "Vova",
                "Sidorov",
                16,
                30000,
                true,
                7.8,
                150,
                10000);

        CreditRequest requestMasha= new CreditRequest(600000,
                "Masha",
                "",
                18,
                30000,
                true,
                7.8,
                150,
                10000);

        CreditRequest requestPetya= new CreditRequest(10000000,
                "Petya",
                "Ivanov",
                34,
                300000,
                true,
                8.8,
                250,
                100000);

	    Checker checkerStep1 = new CompletenessRequest();
        Checker checkerStep2 = new ComplianceCheck();
        Checker checkerStep3 = new FinalChek();

        checkerStep1.setNextChecker(checkerStep2);
        checkerStep2.setNextChecker(checkerStep3);

        checkerStep1.handlerRequest(requestVasya);
        System.out.println();
        checkerStep1.handlerRequest(requestVova);
        System.out.println();
        checkerStep1.handlerRequest(requestMasha);
        System.out.println();
        checkerStep1.handlerRequest(requestPetya);
    }
}
