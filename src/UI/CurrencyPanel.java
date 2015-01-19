package UI;

import java.awt.PopupMenu;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.ArrayList;
import javax.swing.JComboBox;
import javax.swing.JPanel;
import Model.Currency;
import Model.CurrencySet;

class CurrencyPanel extends JPanel {
    private String currency = "HKD";

    public CurrencyPanel() {
        add(createComboBox());
    }
    
    private JComboBox createComboBox(){
        final JComboBox comboBox = new JComboBox(getCurrencies());
        
        comboBox.addItemListener(new ItemListener() {

            @Override
            public void itemStateChanged(ItemEvent e) {
                if(e.getStateChange() != ItemEvent.SELECTED) return;
                currency = comboBox.getSelectedItem().toString();
            }
        });
        return comboBox;
    }
    
    private String [] getCurrencies(){
        ArrayList<String> currencies = new ArrayList<>();
        for(Currency currency: CurrencySet.getInstance()){
            currencies.add(currency.getCode());
        }
        return currencies.toArray(new String[0]);
    }
    
    public String getCurrency(){
        return currency;
    }
    
}
