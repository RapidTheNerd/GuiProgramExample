package sample;



import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {


    public static void main(String[] args) {

            new Main();
    }

    public Main(){
        JFrame guiFrame = new JFrame();
        final JTextField textField = new JTextField();
        JPanel panel = new JPanel();

        panel.add(textField);

        guiFrame.setVisible(true);
        guiFrame.setLocationRelativeTo(null); //will put the gui in the centre of the frame
        guiFrame.setSize(250, 250); // change this to the size of your frame
        guiFrame.add(panel);

        textField.setColumns(1);
        textField.setVisible(true);

        textField.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String textFieldInput = textField.getText().toString();
                if(textFieldInput == "-1"){
                    errorMessage();
                }
            }
        });


    }



    private void errorMessage(){
        JFrame errorFrame = new JFrame();
        JLabel label = new JLabel();
        JPanel jPanel = new JPanel();

        jPanel.add(label);

        errorFrame.add(jPanel);
        errorFrame.setVisible(true);
        errorFrame.setLocationRelativeTo(null);
        errorFrame.setSize(150, 100);

        label.setText("Error you can't have negative ID's");
    }
}
