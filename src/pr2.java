import javax.swing.*;
import java.awt.*;

public class pr2 extends JFrame {
    public pr2() {
        super("Second Window");
        setSize(200,300);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLayout(null);

        JButton button = new JButton("click");
        button.setBounds(50,100,100,40);

        add(button);
        setVisible(true);
    }

    public static void main(String[] args) {
        new pr2();
    }
}
