package lesson7a;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyWindow extends JFrame {
    public MyWindow() {
        setBounds(400, 300, 600, 500);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setTitle("MyWindow");

//        setLayout(new BorderLayout());

//        JButton button = new JButton("btn1");
//        add(button, BorderLayout.NORTH);

//        JButton button2 = new JButton("btn2");
//        add(button2, BorderLayout.NORTH);


//        setLayout(null);
//        JButton button = new JButton("btn1");
//        button.setBounds(100,300, 100, 50);
//        add(button);


//        setLayout(new FlowLayout());
//        for (int i = 0; i < 10; i++) {
//            JButton button = new JButton("btn #"+i);
//            add(button);
//        }


//        setLayout(new GridLayout(3,3));
//        for (int i = 0; i < 12; i++) {
//            JButton button = new JButton("btn #"+i);
//            add(button);
//        }


        setLayout(new BorderLayout());

        JTextField textField = new JTextField();
        add(textField, BorderLayout.NORTH);

        JButton btnSend = new JButton("send");
        add(btnSend, BorderLayout.SOUTH);

        JTextArea textArea = new JTextArea();
        add(textArea, BorderLayout.CENTER);

//        btnSend.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                textArea.append(textField.getText() + "\n");
//                textField.setText("");
//            }
//        });

        btnSend.addActionListener(e -> {
            textArea.append(textField.getText() + "\n");
            textField.setText("");
        });


        setVisible(true);
    }
}
