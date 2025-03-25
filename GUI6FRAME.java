import java.awt.*;
import java.awt.event.*;

public class GUI6FRAME extends Frame {
    private Label detailsLabel;
    private Button fatherButton, motherButton;

    GUI6FRAME() {
        // Create components
        detailsLabel = new Label("Click a button to see details.");
        fatherButton = new Button("Father");
        motherButton = new Button("Mother");

        // Set up listeners
        addButtonClickListener();
        addWindowCloseListener();

        // Add components to frame
        add(fatherButton);
        add(motherButton);
        add(detailsLabel);

        // Frame properties
        setSize(350, 200);
        setTitle("GUI: Parent Details");
        setLayout(new FlowLayout());
        setVisible(true);
    }

    private void addButtonClickListener() {
        fatherButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                detailsLabel.setText("Father: John, Age: 45, Designation: Engineer");
            }
        });

        motherButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                detailsLabel.setText("Mother: Mary, Age: 42, Designation: Doctor");
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
        new GUI6FRAME();
    }
}
