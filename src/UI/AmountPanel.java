package UI;

import java.awt.PopupMenu;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JPanel;
import javax.swing.JTextField;

class AmountPanel extends JPanel {
    
    private String amount;
    
    public AmountPanel() {
        add (createTextField());
    }
    
    private JTextField createTextField(){
        final JTextField jTextField = new JTextField(5);
        jTextField.addKeyListener(new KeyListener() {

            @Override
            public void keyTyped(KeyEvent e) {
            }

            @Override
            public void keyPressed(KeyEvent e) {
            }

            @Override
            public void keyReleased(KeyEvent e) {
                amount = jTextField.getText();
            }
        });
        return jTextField;
    }
    
    public String getAmount(){
        return amount;
    }
    
    
}
