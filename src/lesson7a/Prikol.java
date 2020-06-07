package lesson7a;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Random;

public class Prikol extends JFrame {
    Random random = new Random();
    public Prikol() {
        setBounds(400, 300, 800, 600);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setTitle("����������� �� ������������. �����");

        setLayout(null);

        Font font = new Font("Arial", NORMAL, 30);

        JLabel label = new JLabel("<html>������ <b>���������</b> <i>��������</i> � 2 ����?</html>");
        label.setBounds(50,100, 700,200);
        label.setFont(font);
        add(label);

        JButton buttonOk = new JButton("��");
        buttonOk.setBounds(100,300, 200, 70);
        buttonOk.setFont(font);
        buttonOk.setFocusable(false);
        add(buttonOk);

        JButton buttonNo = new JButton("���");
        buttonNo.setBounds(400,300, 200, 70);
        buttonNo.setFont(font);
        add(buttonNo);


        buttonOk.addMouseMotionListener(new MouseAdapter() {
            @Override
            public void mouseMoved(MouseEvent e) {
                buttonOk.setLocation(random.nextInt(600),random.nextInt(500));
            }
        });


        setVisible(true);
    }
}
