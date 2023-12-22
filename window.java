import javax.swing.*;

public class SimpleWindowExample {
    public static void main(String[] args) {
        // Create a JFrame (window)
        JFrame frame = new JFrame("Simple Window Example");

        // Set the default close operation
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Set the size of the window
        frame.setSize(400, 300);

        // Set the layout manager (optional)
        frame.setLayout(new java.awt.FlowLayout());

        // Create a label
        JLabel label = new JLabel("Hello, Kali Linux!");

        // Add the label to the frame
        frame.add(label);

        // Center the window on the screen
        frame.setLocationRelativeTo(null);

        // Make the window visible
        frame.setVisible(true);
    }
}
