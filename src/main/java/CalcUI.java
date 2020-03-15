import javax.swing.*;
import javax.swing.plaf.FontUIResource;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalcUI extends JFrame implements ActionListener {

    Calculator calculator = new Calculator();
    JLabel displayLabel;
    JLabel operationsListLabel;
    JButton clearButton;

    public CalcUI() {
        super("Calculator");

        // Make fonts bigger in the whole app
        UIManager.put("Label.font", new FontUIResource(new Font("Roboto", Font.PLAIN, 20)));
        UIManager.put("Button.font", new FontUIResource(new Font("Roboto", Font.PLAIN, 20)));

        //Create grid panel that buttons and label will go into
        JPanel panel = new JPanel();
        GridBagLayout gridBagLayout = new GridBagLayout();
        panel.setLayout(gridBagLayout);
        setContentPane(panel);

        //Make calculator window display
        displayLabel = new JLabel("");
        var displayLabelConstraints = new GridBagConstraints(0, 0, 3, 1, 1, 1, GridBagConstraints.CENTER, GridBagConstraints.BOTH, new Insets(20, 20, 20, 20), 0, 0);
        panel.add(displayLabel, displayLabelConstraints);

        //Make calculator window display
        operationsListLabel = new JLabel("");
        var operationsListLabelConstraints = new GridBagConstraints(0, 1, 4, 1, 1, 1, GridBagConstraints.CENTER, GridBagConstraints.BOTH, new Insets(20, 20, 20, 20), 0, 0);
        panel.add(operationsListLabel, operationsListLabelConstraints);

        //Make 0 Button
        JButton button0 = new JButton("0");
        var button0constraints = new GridBagConstraints(0, 5, 1, 1, 1, 1, GridBagConstraints.CENTER, GridBagConstraints.BOTH, new Insets(1, 1, 1, 1), 0, 0);
        button0.addActionListener(e -> {
            calculator.appendToMainNumber("0");
            displayLabel.setText(calculator.getMainNumber());
        });
        panel.add(button0, button0constraints);

        //Make 1 button
        JButton button1 = new JButton("1");
        var button1constraints = new GridBagConstraints(0, 4, 1, 1, 1, 1, GridBagConstraints.CENTER, GridBagConstraints.BOTH, new Insets(1, 1, 1, 1), 0, 0);
        button1.addActionListener(e -> {
            calculator.appendToMainNumber("1");
            displayLabel.setText(calculator.getMainNumber());
        });
        panel.add(button1, button1constraints);

        //Make 2 button
        JButton button2 = new JButton("2");
        var button2constraints = new GridBagConstraints(1, 4, 1, 1, 1, 1, GridBagConstraints.CENTER, GridBagConstraints.BOTH, new Insets(1, 1, 1, 1), 0, 0);
        button2.addActionListener(e -> {
            calculator.appendToMainNumber("2");
            displayLabel.setText(calculator.getMainNumber());
        });
        panel.add(button2, button2constraints);

        //Make 3 button
        JButton button3 = new JButton("3");
        var button3constraints = new GridBagConstraints(2, 4, 1, 1, 1, 1, GridBagConstraints.CENTER, GridBagConstraints.BOTH, new Insets(1, 1, 1, 1), 0, 0);
        button3.addActionListener(e -> {
            calculator.appendToMainNumber("3");
            displayLabel.setText(calculator.getMainNumber());
        });
        panel.add(button3, button3constraints);

        //Make 4 button
        JButton button4 = new JButton("4");
        var button4constraints = new GridBagConstraints(0, 3, 1, 1, 1, 1, GridBagConstraints.CENTER, GridBagConstraints.BOTH, new Insets(1, 1, 1, 1), 0, 0);
        button4.addActionListener(e -> {
            calculator.appendToMainNumber("4");
            displayLabel.setText(calculator.getMainNumber());
        });
        panel.add(button4, button4constraints);

        //Make 5 button
        JButton button5 = new JButton("5");
        var button5constraints = new GridBagConstraints(1, 3, 1, 1, 1, 1, GridBagConstraints.CENTER, GridBagConstraints.BOTH, new Insets(1, 1, 1, 1), 0, 0);
        button5.addActionListener(e -> {
            calculator.appendToMainNumber("5");
            displayLabel.setText(calculator.getMainNumber());
        });
        panel.add(button5, button5constraints);

        //Make 6 button
        JButton button6 = new JButton("6");
        var button6constraints = new GridBagConstraints(2, 3, 1, 1, 1, 1, GridBagConstraints.CENTER, GridBagConstraints.BOTH, new Insets(1, 1, 1, 1), 0, 0);
        button6.addActionListener(e -> {
            calculator.appendToMainNumber("6");
            displayLabel.setText(calculator.getMainNumber());
        });
        panel.add(button6, button6constraints);

        //Make 7 button
        JButton button7 = new JButton("7");
        var button7constraints = new GridBagConstraints(0, 2, 1, 1, 1, 1, GridBagConstraints.CENTER, GridBagConstraints.BOTH, new Insets(1, 1, 1, 1), 0, 0);
        button7.addActionListener(e -> {
            calculator.appendToMainNumber("7");
            displayLabel.setText(calculator.getMainNumber());
        });
        panel.add(button7, button7constraints);

        //Make 8 button
        JButton button8 = new JButton("8");
        var button8constraints = new GridBagConstraints(1, 2, 1, 1, 1, 1, GridBagConstraints.CENTER, GridBagConstraints.BOTH, new Insets(1, 1, 1, 1), 0, 0);
        button8.addActionListener(e -> {
            calculator.appendToMainNumber("8");
            displayLabel.setText(calculator.getMainNumber());
        });
        panel.add(button8, button8constraints);

        //Make 9 button
        JButton button9 = new JButton("9");
        var button9constraints = new GridBagConstraints(2, 2, 1, 1, 1, 1, GridBagConstraints.CENTER, GridBagConstraints.BOTH, new Insets(1, 1, 1, 1), 0, 0);
        button9.addActionListener(e -> {
            calculator.appendToMainNumber("9");
            displayLabel.setText(calculator.getMainNumber());
        });
        panel.add(button9, button9constraints);

        //Make + button
        JButton plusButton = new JButton("+");
        var plusButtonConstraints = new GridBagConstraints(3, 5, 1, 1, 1, 1, GridBagConstraints.CENTER, GridBagConstraints.BOTH, new Insets(1, 1, 1, 1), 0, 0);
        plusButton.addActionListener(this);
        panel.add(plusButton, plusButtonConstraints);

        //Make - button
        JButton minusButton = new JButton("-");
        var minusButtonConstraints = new GridBagConstraints(3, 4, 1, 1, 1, 1, GridBagConstraints.CENTER, GridBagConstraints.BOTH, new Insets(1, 1, 1, 1), 0, 0);
        minusButton.addActionListener(this);
        panel.add(minusButton, minusButtonConstraints);

        //Make * button
        JButton multiplyButton = new JButton("*");
        var multiplyButtonConstraints = new GridBagConstraints(3, 3, 1, 1, 1, 1, GridBagConstraints.CENTER, GridBagConstraints.BOTH, new Insets(1, 1, 1, 1), 0, 0);
        multiplyButton.addActionListener(this);
        panel.add(multiplyButton, multiplyButtonConstraints);

        //Make / button
        JButton divideButton = new JButton("/");
        var divideButtonConstraints = new GridBagConstraints(3, 2, 1, 1, 1, 1, GridBagConstraints.CENTER, GridBagConstraints.BOTH, new Insets(1, 1, 1, 1), 0, 0);
        divideButton.addActionListener(this);
        panel.add(divideButton, divideButtonConstraints);

        //Make = button
        JButton equalButton = new JButton("=");
        var equalButtonConstraints = new GridBagConstraints(1, 5, 2, 1, 1, 1, GridBagConstraints.CENTER, GridBagConstraints.BOTH, new Insets(1, 1, 1, 1), 0, 0);
        equalButton.addActionListener(this);
        panel.add(equalButton, equalButtonConstraints);

        //Make C button
        clearButton = new JButton("C");
        var clearButtonConstraints = new GridBagConstraints(4, 0, 1, 1, 1, 1, GridBagConstraints.CENTER, GridBagConstraints.BOTH, new Insets(1, 1, 1, 1), 0, 0);
        clearButton.addActionListener(e -> {
            if(clearButton.getText().contentEquals("C")){
                calculator.resetMainNumber();
                clearButton.setText("CE");
            }
            else if(clearButton.getText().contentEquals("CE")){
                calculator.holyHandGrenade();
                clearButton.setText("C");
                operationsListLabel.setText("");
            }
            displayLabel.setText(calculator.getMainNumber());
        });
        panel.add(clearButton, clearButtonConstraints);

        //Make M+ button
        JButton memPlusButton = new JButton("M+");
        var memPlusButtonConstraints = new GridBagConstraints(4, 2, 1, 1, 1, 1, GridBagConstraints.CENTER, GridBagConstraints.BOTH, new Insets(1, 1, 1, 1), 0, 0);
        memPlusButton.addActionListener(this);
        panel.add(memPlusButton, memPlusButtonConstraints);

        //Make M- button
        JButton memMinusButton = new JButton("M-");
        var memMinusButtonConstraints = new GridBagConstraints(4, 3, 1, 1, 1, 1, GridBagConstraints.CENTER, GridBagConstraints.BOTH, new Insets(1, 1, 1, 1), 0, 0);
        memMinusButton.addActionListener(this);
        panel.add(memMinusButton, memMinusButtonConstraints);

        //Make MC button
        JButton memClearButton = new JButton("MC");
        var memClearButtonConstraints = new GridBagConstraints(4, 4, 1, 1, 1, 1, GridBagConstraints.CENTER, GridBagConstraints.BOTH, new Insets(1, 1, 1, 1), 0, 0);
        memClearButton.addActionListener(this);
        panel.add(memClearButton, memClearButtonConstraints);

        //Make MR button
        JButton memReadButton = new JButton("MR");
        var memReadButtonConstraints = new GridBagConstraints(4, 5, 1, 1, 1, 1, GridBagConstraints.CENTER, GridBagConstraints.BOTH, new Insets(1, 1, 1, 1), 0, 0);
        memReadButton.addActionListener(this);
        panel.add(memReadButton, memReadButtonConstraints);

        //Closing thoughts, final window creation
        setPreferredSize(new Dimension(400, 600));
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        pack();
        setVisible(true);
    }

    public static void main(String[] args) {
        new CalcUI();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        clearButton.setText("C");
        if (((JButton) e.getSource()).getText().equals("=")) {
            //Equals sign special case
            calculator.addOperationAndValueToArray(displayLabel.getText(),"calculate");
            String result = calculator.calculate();
            operationsListLabel.setText("");
            displayLabel.setText(result);
            calculator.resetMainNumber();
            calculator.resetNAOArray();
        }
        else if (((JButton) e.getSource()).getText().contains("M")) {
            //Memory Access Controls
            if (((JButton) e.getSource()).getText().contains("+")){
                calculator.addToMemoryValue(displayLabel.getText());
            }
            else if (((JButton) e.getSource()).getText().contains("-")){
                calculator.subtractFromMemoryValue(displayLabel.getText());
            }
            else if (((JButton) e.getSource()).getText().contains("C")){
                calculator.clearMemoryValue();
            }
            else if (((JButton) e.getSource()).getText().contains("R")){
                displayLabel.setText(calculator.readMemoryValue());
            }
        }
        else {
            //Basic Calculation Controls
            if (((JButton) e.getSource()).getText().equals("+")) {
                calculator.addOperationAndValueToArray(displayLabel.getText(),"add");
            } else if (((JButton) e.getSource()).getText().equals("-")) {
                calculator.addOperationAndValueToArray(displayLabel.getText(),"subtract");
            } else if (((JButton) e.getSource()).getText().equals("*")) {
                calculator.addOperationAndValueToArray(displayLabel.getText(),"multipy");
            } else if (((JButton) e.getSource()).getText().equals("/")) {
                calculator.addOperationAndValueToArray(displayLabel.getText(),"divide");
            }
            operationsListLabel.setText(operationsListLabel.getText() + displayLabel.getText() + ((JButton) e.getSource()).getText());
            displayLabel.setText(calculator.getMainNumber());
        }
    }
}
