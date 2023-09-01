package org.example;

class CurrenciesDoNotMatchException extends Exception{
    public CurrenciesDoNotMatchException(String message){
        super(message);
    }
}

class Amount {
    private String currency;
    private int amount;

    public Amount (String currency, int amount){
        this.currency = currency;
        this.amount = amount;
    }

    public void add (Amount other) throws Exception{
        if (this.currency == other.currency){
            this.amount = this.amount + other.amount;
        }
        else {
            //throw new Exception("Currencies don't match");
            throw new CurrenciesDoNotMatchException("Currencies don't match");
        }
    }

    public String toString (){
        return this.amount + " " + this.currency;
    }
}

public class ThrowingExceptionRunner {
    public static void main(String[] args) throws Exception {
        Amount Amount1 = new Amount("USD",10);
        Amount Amount2 = new Amount("EUR",20);
        Amount1.add(Amount2);
        System.out.println(Amount1.toString());

    }
}
