package bmicalculator;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class BMICalculator extends JFrame {

    private JLabel weightLabel = new JLabel("Weight (kg):");
    private JLabel heightLabel = new JLabel("Height (m):");
    private JTextField weightField = new JTextField(10);
    private JTextField heightField = new JTextField(10);
    private JButton calculateButton = new JButton("Calculate BMI");
    private JLabel resultLabel = new JLabel("Your BMI is: --");

    public BMICalculator() {
        setTitle("BMI...");
        setSize(300, 180);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(4, 2, 5, 5));

        JPanel weightPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        weightPanel.add(weightField);

        JPanel heightPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        heightPanel.add(heightField);

        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        buttonPanel.add(calculateButton);

        add(weightLabel);
        add(weightPanel);
        add(heightLabel);
        add(heightPanel);
        add(buttonPanel);
        add(new JLabel(""));
        add(resultLabel);
        add(new JLabel(""));

        calculateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double weight = Double.parseDouble(weightField.getText());
                    double height = Double.parseDouble(heightField.getText());
                    double bmi = weight / (height * height);
                    resultLabel.setText(String.format("Your BMI is: %.2f", bmi));
                } catch (NumberFormatException ex) {
                    resultLabel.setText("Invalid input!");
                }
            }
        });
    }

    public static void main(String[] args) {
        BMICalculator frame = new BMICalculator();
        frame.setVisible(true);
    }
}