package Persistance;

import Model.ExchangeRate;
import Model.Currency;
import java.util.Date;


public interface ExchangeRateLoader {
    public ExchangeRate load(Date date, Currency from, Currency to);
    public ExchangeRate load(Currency from, Currency to);
}
