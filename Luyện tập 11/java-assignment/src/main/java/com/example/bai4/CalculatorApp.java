package com.example.bai4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.text.DecimalFormat;

public class CalculatorApp extends JFrame {
    private final JTextField display = new JTextField("0");
    private double firstNumber = 0;
    private String operator = "";
    private boolean startNewNumber = true;
    private final DecimalFormat format = new DecimalFormat("0.##########");

    public CalculatorApp() {
        initUI();
    }

    private void initUI() {
        setTitle("Calculator");
        setSize(360, 520);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);

        display.setFont(new Font("Arial", Font.BOLD, 28));
        display.setHorizontalAlignment(JTextField.RIGHT);
        display.setEditable(false);
        display.setBackground(Color.WHITE);
        display.setPreferredSize(new Dimension(360, 80));

        JPanel buttonPanel = new JPanel(new GridLayout(6, 4, 8, 8));
        String[] buttons = {
                "C", "⌫", "%", "/",
                "7", "8", "9", "*",
                "4", "5", "6", "-",
                "1", "2", "3", "+",
                "+/-", "0", ".", "=",
                "x²", "√", "1/x", "CE"
        };

        for (String text : buttons) {
            JButton button = new JButton(text);
            button.setFont(new Font("Arial", Font.PLAIN, 20));
            button.addActionListener(this::handleButtonClick);
            buttonPanel.add(button);
        }

        JPanel container = new JPanel(new BorderLayout(10, 10));
        container.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        container.add(display, BorderLayout.NORTH);
        container.add(buttonPanel, BorderLayout.CENTER);

        add(container);
    }

    private void handleButtonClick(ActionEvent event) {
        String command = ((JButton) event.getSource()).getText();

        if (command.matches("[0-9]")) {
            appendNumber(command);
            return;
        }

        switch (command) {
            case "." -> appendDecimal();
            case "+", "-", "*", "/", "%" -> setOperator(command);
            case "=" -> calculate();
            case "C" -> clearAll();
            case "CE" -> clearEntry();
            case "⌫" -> backspace();
            case "+/-" -> toggleSign();
            case "x²" -> square();
            case "√" -> squareRoot();
            case "1/x" -> reciprocal();
        }
    }

    private void appendNumber(String number) {
        if (startNewNumber || "0".equals(display.getText())) {
            display.setText(number);
            startNewNumber = false;
        } else {
            display.setText(display.getText() + number);
        }
    }

    private void appendDecimal() {
        if (startNewNumber) {
            display.setText("0.");
            startNewNumber = false;
        } else if (!display.getText().contains(".")) {
            display.setText(display.getText() + ".");
        }
    }

    private void setOperator(String selectedOperator) {
        firstNumber = Double.parseDouble(display.getText());
        operator = selectedOperator;
        startNewNumber = true;
    }

    private void calculate() {
        if (operator.isEmpty()) {
            return;
        }

        double secondNumber = Double.parseDouble(display.getText());
        double result;

        try {
            result = switch (operator) {
                case "+" -> firstNumber + secondNumber;
                case "-" -> firstNumber - secondNumber;
                case "*" -> firstNumber * secondNumber;
                case "/" -> {
                    if (secondNumber == 0) throw new ArithmeticException("Khong the chia cho 0");
                    yield firstNumber / secondNumber;
                }
                case "%" -> firstNumber % secondNumber;
                default -> secondNumber;
            };

            display.setText(format.format(result));
            operator = "";
            startNewNumber = true;
        } catch (ArithmeticException ex) {
            showError(ex.getMessage());
        }
    }

    private void clearAll() {
        firstNumber = 0;
        operator = "";
        startNewNumber = true;
        display.setText("0");
    }

    private void clearEntry() {
        display.setText("0");
        startNewNumber = true;
    }

    private void backspace() {
        if (startNewNumber) {
            return;
        }

        String current = display.getText();
        if (current.length() > 1) {
            display.setText(current.substring(0, current.length() - 1));
        } else {
            display.setText("0");
            startNewNumber = true;
        }
    }

    private void toggleSign() {
        double value = Double.parseDouble(display.getText());
        display.setText(format.format(-value));
    }

    private void square() {
        double value = Double.parseDouble(display.getText());
        display.setText(format.format(value * value));
        startNewNumber = true;
    }

    private void squareRoot() {
        double value = Double.parseDouble(display.getText());
        if (value < 0) {
            showError("Khong the can bac hai so am");
            return;
        }
        display.setText(format.format(Math.sqrt(value)));
        startNewNumber = true;
    }

    private void reciprocal() {
        double value = Double.parseDouble(display.getText());
        if (value == 0) {
            showError("Khong the chia cho 0");
            return;
        }
        display.setText(format.format(1 / value));
        startNewNumber = true;
    }

    private void showError(String message) {
        JOptionPane.showMessageDialog(this, message, "Loi", JOptionPane.ERROR_MESSAGE);
        clearAll();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new CalculatorApp().setVisible(true));
    }
}
