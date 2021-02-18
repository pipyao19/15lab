import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class zadanie extends JFrame {
    zadanie(){
        setBounds(400, 400, 250, 300);
        JButton inc = new JButton("+1");
        JButton dec = new JButton("-1");
        JTextField num = new JTextField("0");
        JLabel label = new JLabel("Number");
        inc.setBounds(120, 20 , 50, 20);
        dec.setBounds(120, 40 , 50, 20);
        num.setBounds(60, 20 , 50, 20);
        label.setBounds(20, 20 , 30, 20);
        inc.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int i = Integer.parseInt(num.getText());
                if(i<3) i++;
                num.setText(Integer.toString(i));
                
            }
        });
        dec.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int i = Integer.parseInt(num.getText());
                if(i>-5) i--;
                num.setText(Integer.toString(i));
            }
        });
        add(inc);
        add(dec);
        add(num);
        add(label);
        setVisible(true);

    }

    public static void main(String[] args) { new zadanie(); }
}
