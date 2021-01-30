package moneycalculator.ui.swing;

import java.awt.Component;
import javax.swing.JLabel;
import javax.swing.JPanel;
import moneycalculator.model.Money;
import moneycalculator.ui.MoneyDisplay;

public class SwingMoneyDisplay extends JPanel implements MoneyDisplay{
    private Money money;
    
    @Override
    public void display(Money money) {
        this.money = money;
        removeAll();
        add(valuelabel());
        add(amount());
        add(currency());
        updateUI();
    }
    
    private Component amount(){
        return new JLabel(String.valueOf(money.getAmount()));
    }
    
    private Component currency() {
        return new JLabel(money.getCurrency().getCode());
    }
    
    private Component valuelabel() {
        return new JLabel("Resultado: ");
    }
}
