import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main extends JFrame implements ActionListener {
    JButton button;
    JLabel label;

    Main() {
        button = new JButton("Select");
        label = new JLabel();

        button.addActionListener(this);

        label.setBackground(Color.white);
        label.setText("Some text");
        label.setOpaque(true);
        label.setFont(new Font("MV Boli", Font.PLAIN, 100));

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());
        this.add(button);
        this.add(label);
        this.pack();
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button) {
            JColorChooser colorChooser = new JColorChooser();
            Color color = JColorChooser.showDialog(null, "Pick a color...", Color.black);
//            label.setForeground(color);
            label.setBackground(color);
        }
    }

    public static void main(String[] args) {
        new Main();
    }
}