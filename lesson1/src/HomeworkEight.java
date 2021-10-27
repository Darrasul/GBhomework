import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HomeworkEight extends JFrame {

    private static int counter = 0;

    public static void main(String[] args) {
        JFrame counterBody = initFrame();
        Font font = new Font("Arial", Font.BOLD, 28);
        JLabel value = initCounter(counterBody, font);
        initDecIncButtons(counterBody, font, value);
        initResetButton(counterBody, font, value);
        initStep(counterBody, font, value);

        counterBody.setVisible(true);
    }

    private static void initStep(JFrame counterBody, Font font, JLabel value) {
        JTextField stepText = new JTextField();
        stepText.setFont(font);
        stepText.setText("Enter number");
        counterBody.add(stepText, BorderLayout.PAGE_START);

        stepText.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String stepValue = stepText.getText();
                value.setText(String.valueOf(counter + Integer.parseInt(stepValue)));
                stepText.setText("Enter number");
            }
        });

    }

    private static void initResetButton(JFrame counterBody, Font font, JLabel value) {
        JButton resetButton = new JButton("Reset");
        resetButton.setFont(font);
        counterBody.add(resetButton, BorderLayout.PAGE_END);

        resetButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                value.setText(String.valueOf(counter = 0));
            }
        });

    }

    private static void initDecIncButtons(JFrame counterBody, Font font, JLabel value) {
        JButton decButton = new JButton("<");
        decButton.setFont(font);
        counterBody.add(decButton, BorderLayout.LINE_START);
        JButton incButton = new JButton(">");
        incButton.setFont(font);
        counterBody.add(incButton, BorderLayout.LINE_END);

        decButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            value.setText(String.valueOf(--counter));
            }
        });
        incButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                value.setText(String.valueOf(++counter));
            }
        });


    }

    private static JLabel initCounter(JFrame counterBody, Font font) {
        JLabel value = new JLabel();
        value.setText(getCounter());
        value.setFont(font);
        value.setHorizontalAlignment(SwingConstants.CENTER);
        counterBody.add(value, BorderLayout.CENTER);
        return value;
    }

    private static JFrame initFrame() {
        JFrame counterBody = new JFrame();
        counterBody.setTitle("Counter");
        counterBody.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        counterBody.setBounds(150,150,400,400);
        return counterBody;
    }

    private static String getCounter () {
        return String.valueOf(counter);
    }


}
