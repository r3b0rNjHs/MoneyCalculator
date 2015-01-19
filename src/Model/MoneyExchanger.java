package Model;


import Model.ExchangeRate;

public class MoneyExchanger {
    private Money money;
    
    public MoneyExchanger(){
    }
    public Money getMoney(){
        return money;
    }
    public void exchange(Money money, ExchangeRate rate){
         this.money = new Money(money.getAmount() * rate.getRate(), rate.getTo());
    }


}
