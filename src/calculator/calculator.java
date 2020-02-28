
/*
 * Created by: Maria Temu
 * Created on: 11-Feb-2020
 * Created for: ICS4U
 * Day #6 (Calculator)
 * This program acts as a simple calculator,
 * letting the user input numbers and either multiply,
 * divide, subtract or add
 */

package calculator;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class calculator {
    private JButton btnAdd;
    private JButton btnSubtract;
    private JTextField txtSecondnumb;
    private JTextField txtFirstnumb;
    private JButton btnDivide;
    private JButton btnMultiply;
    private JLabel lblAnswer;
    private JPanel mainPanel;

    public static void main(String[] args) {
        JFrame frame = new JFrame("calculator");
        frame.setContentPane((new calculator().mainPanel));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public calculator() {
        btnMultiply.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                double fNumb = Double.parseDouble(String.valueOf(txtFirstnumb.getText()));
                double sNumb = Double.parseDouble(String.valueOf(txtSecondnumb.getText()));
                //System.out.println(fNumb);
                Double answer = fNumb * sNumb;
                String strAnswer = Double.toString(answer);
                lblAnswer.setText(strAnswer);
            }
        });
        btnDivide.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                double fNumb = Double.parseDouble(String.valueOf(txtFirstnumb.getText()));
                double sNumb = Double.parseDouble(String.valueOf(txtSecondnumb.getText()));
                Double answer = fNumb / sNumb;
                String strAnswer = Double.toString(answer);
                lblAnswer.setText(strAnswer);
            }
        });
        btnAdd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                double fNumb = Double.parseDouble(String.valueOf(txtFirstnumb.getText()));
                double sNumb = Double.parseDouble(String.valueOf(txtSecondnumb.getText()));
                Double answer = fNumb + sNumb;
                String strAnswer = Double.toString(answer);
                lblAnswer.setText(strAnswer);
            }
        });
        btnSubtract.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                double fNumb = Double.parseDouble(String.valueOf(txtFirstnumb.getText()));
                double sNumb = Double.parseDouble(String.valueOf(txtSecondnumb.getText()));
                Double answer = fNumb - sNumb;
                String strAnswer = Double.toString(answer);
                lblAnswer.setText(strAnswer);
            }
        });
    }
}
