package com.company;

public abstract class Checker {
    private Checker nextChecker=null;

    public void setNextChecker(Checker nextChecker) {
        this.nextChecker = nextChecker;
    }

    public void handlerRequest(CreditRequest request)
    {
        if(analysisRequest(request))
        {
            if(nextChecker!=null)
                nextChecker.handlerRequest(request);
        }
    }

    public abstract boolean analysisRequest(CreditRequest request);


}
