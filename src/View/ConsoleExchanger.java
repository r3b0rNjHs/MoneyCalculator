package View;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import Model.ExchangeRate;
import Model.MoneyExchanger;
import Persistance.MockExchangeRateLoader;


public class ConsoleExchanger implements Exchanger{

    @Override
    public void execute() {
        System.out.println("From:  ");
        MoneyDialog moneyDialog = new MoneyDialog();
        try {
            moneyDialog.execute();
        } catch (IOException ex) {
            Logger.getLogger(ConsoleExchanger.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        System.out.println("To:  ");
        CurrencyDialog currencyDialog = new CurrencyDialog();
        try {
            currencyDialog.execute();
        } catch (IOException ex) {
            Logger.getLogger(ConsoleExchanger.class.getName()).log(Level.SEVERE, null, ex);
        }
        ExchangeRate exchangeRate = new MockExchangeRateLoader().load(moneyDialog.getMoney().getCurrency(),currencyDialog.getCurrency());
        MoneyExchanger moneyExchanger = new MoneyExchanger();
        moneyExchanger.exchange(moneyDialog.getMoney(), exchangeRate);
        System.out.println(moneyExchanger.getMoney().getAmount());
    }        
}
