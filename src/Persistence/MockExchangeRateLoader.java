package Persistance;

import java.util.ArrayList;
import java.util.Date;
import Model.Currency;
import Model.CurrencySet;
import Model.ExchangeRate;

public class MockExchangeRateLoader implements ExchangeRateLoader{

@Override
    public ExchangeRate load(Currency from, Currency to) {
    ArrayList<ExchangeRate> exchangeList = new ArrayList<>();
    CurrencySet set = CurrencySet.getInstance();
    Currency fromCurrency = set.get("EUR");
    exchangeList.add(new ExchangeRate(fromCurrency, set.get("EUR"), 1.0000));
    exchangeList.add(new ExchangeRate(fromCurrency, set.get("USD"), 1.3587));
    exchangeList.add(new ExchangeRate(fromCurrency, set.get("JPY"), 142.67 ));
    exchangeList.add(new ExchangeRate(fromCurrency, set.get("BGN"), 1.9558 ));
    exchangeList.add(new ExchangeRate(fromCurrency, set.get("CZK"), 27.392 ));
    exchangeList.add(new ExchangeRate(fromCurrency, set.get("DKK"),  7.4621 ));
    exchangeList.add(new ExchangeRate(fromCurrency, set.get("GBP"),  0.82800));
    exchangeList.add(new ExchangeRate(fromCurrency, set.get("HUF"), 299.24 ));
    exchangeList.add(new ExchangeRate(fromCurrency, set.get("PLN"), 4.1749));
    exchangeList.add(new ExchangeRate(fromCurrency, set.get("SEK"), 8.8820));
    exchangeList.add(new ExchangeRate(fromCurrency, set.get("CHF"), 1.2342 ));
    exchangeList.add(new ExchangeRate(fromCurrency, set.get("NOK"), 8.4025));
    exchangeList.add(new ExchangeRate(fromCurrency, set.get("AUD"), 1.5265));
    exchangeList.add(new ExchangeRate(fromCurrency, set.get("CAD"), 1.4777));
    exchangeList.add(new ExchangeRate(fromCurrency, set.get("CNY"), 8.2230));
    exchangeList.add(new ExchangeRate(fromCurrency, set.get("HKD"), 10.5367));
    exchangeList.add(new ExchangeRate(fromCurrency, set.get("MXN"), 17.7718));
    exchangeList.add(new ExchangeRate(fromCurrency, set.get("NZD"), 1.6527));
    exchangeList.add(new ExchangeRate(fromCurrency, set.get("SGD"), 1.7255));
    exchangeList.add(new ExchangeRate(fromCurrency, set.get("SGD"), 14.6297));
    exchangeList.add(new ExchangeRate(fromCurrency, set.get("ZAR"), 13.4777));
    double rate = 1.;
    for (ExchangeRate exchangeRate : exchangeList) {
       
        if(exchangeRate.getTo().getCode().equals(null)){
            continue;
        }
        if(exchangeRate.getTo().getCode().equals(to.getCode())){
            rate *= exchangeRate.getRate();
            break;
        }
    }
    for (ExchangeRate exchangeRate : exchangeList) {
       
        if(exchangeRate.getTo().getCode().equals(null)){
            continue;
        }
        if(exchangeRate.getTo().getCode().equals(from.getCode())){
            rate /= exchangeRate.getRate();
            break;
        }
    }
    
    return new ExchangeRate (from,to,rate);
    
    }

    @Override
    public ExchangeRate load(Date date, Currency from, Currency to) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
}
