import javax.swing.*;

public class pr1{
    public pr1(){
        JFrame frame = new JFrame("Example 1");
        frame.setSize(200, 300);
        frame.setLayout(null);

        JButton button = new JButton("click");
        button.setBounds(50,100,100,40);

        frame.add(button);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new pr1();
    }

}
