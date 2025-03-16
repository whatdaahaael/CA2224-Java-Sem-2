/*
 * Question 5:
 * Build an AWT application that takes two numbers as input
 * and shows the result of division when a button is clicked.
 * Handle the ArithmeticException for division by zero.
 *
 *
 * 242BCA16
 * Sujan
 */

package Activity4ProgrammingExercise;
import java.awt.*;
import java.awt.event.*;

public class GUIQ5 extends Frame {
    private Label resultLabel;
    private TextField num1Field, num2Field;
    private Button divideButton;

    GUIQ5() {
        // Create components
        Label num1Label = new Label("Number 1:");
        Label num2Label = new Label("Number 2:");
        resultLabel = new Label("Result: ");
        num1Field = new TextField(10);
        num2Field = new TextField(10);
        divideButton = new Button("Divide");

        // Set up listeners
        addButtonClickListener();
        addWindowCloseListener();

        // Add components to frame
        add(num1Label);
        add(num1Field);
        add(num2Label);
        add(num2Field);
        add(divideButton);
        add(resultLabel);

        // Frame properties
        setSize(300, 200);
        setTitle("GUI: Division Calculator");
        setLayout(new FlowLayout());
        setVisible(true);
    }

    private void addButtonClickListener() {
        divideButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double num1 = Double.parseDouble(num1Field.getText());
                    double num2 = Double.parseDouble(num2Field.getText());
                    if (num2 == 0) {
                        throw new ArithmeticException("Cannot divide by zero");
                    }
                    double result = num1 / num2;
                    resultLabel.setText("Result: " + result);
                } catch (ArithmeticException ex) {
                    resultLabel.setText("Error: " + ex.getMessage());
                } catch (NumberFormatException ex) {
                    resultLabel.setText("Error: Invalid Input");
                }
            }
        });
    }

    private void addWindowCloseListener() {
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });
    }

    public static void main(String[] args) {
        new GUIQ5();
    }
}
