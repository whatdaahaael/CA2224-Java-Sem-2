/*
 * Question 4:
 * Write a Java AWT program to create a frame with a
 * button and a label. When the button is clicked,
 * change the label text.
 *
 *
 * 242BCA16
 * Sujan
 */

package Activity4ProgrammingExercise;
import java.awt.*;
import java.awt.event.*;

public class GUIQ4 extends Frame {
    private Label l;
    private Button b;

    GUIQ4() {
        // Create label and button
        l = new Label("Hello");
        b = new Button("Click Me");

        // Set button bounds
        b.setBounds(30, 100, 80, 30);

        // Set up listeners
        addButtonClickListener();
        addWindowCloseListener();

        // Add components to frame
        add(l);
        add(b);

        // Frame properties
        setSize(300, 300);
        setTitle("GUI: Question 4");
        setLayout(new FlowLayout());
        setVisible(true);
    }

    private void addButtonClickListener() {
        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                l.setText("World!");
                b.setLabel("Clicked!");
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
        new GUIQ4();
    }
}
