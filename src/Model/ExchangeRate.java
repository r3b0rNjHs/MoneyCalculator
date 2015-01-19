package Model;

import Model.Currency; 
import java.util.Date;

public class ExchangeRate {
   private Date date;
   private Currency from;
   private Currency to;
   private double rate;

    public ExchangeRate(Date date, Currency from, Currency to, double rate) {
        this.date = date;
        this.from = from;
        this.to = to;
        this.rate = rate;
    }
    
    public ExchangeRate(Currency from, Currency to, double rate) {
        this(new Date(),from,to,rate);
    }

    public Date getDate() {
        return date;
    }

    public Currency getFrom() {
        return from;
    }

    public Currency getTo() {
        return to;
    }

    public double getRate() {
        return rate;
    }
    
    
}
