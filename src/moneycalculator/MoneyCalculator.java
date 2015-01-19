package moneycalculator;

/* @author r3b0rn
 */
import Persistance.MockCurrencySetLoader;
import View.ConsoleExchanger;
import View.SwingExchanger;


public class MoneyCalculator {

    
    public static void main(String[] args) {
        new MockCurrencySetLoader().load();
        new SwingExchanger().execute();
    
    }
}
