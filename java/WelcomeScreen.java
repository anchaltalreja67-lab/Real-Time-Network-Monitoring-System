import java.awt.*;
import javax.swing.*;

public class WelcomeScreen {

    public static void main(String[] args) {

        JFrame frame = new JFrame("DCCN Project");
        frame.setSize(1200, 800);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.setBackground(new Color(10, 20, 50));

        JLabel heading = new JLabel("WELCOME TO OUR DCCN PROJECT");
        heading.setBounds(0, 30, 1200, 50);
        heading.setHorizontalAlignment(JLabel.CENTER);
        heading.setForeground(Color.CYAN);
        heading.setFont(new Font("Arial", Font.BOLD, 34));

        JLabel subject = new JLabel("DATA COMMUNICATION AND COMPUTER NETWORKS");
        subject.setBounds(0, 90, 1200, 35);
        subject.setHorizontalAlignment(JLabel.CENTER);
        subject.setForeground(Color.WHITE);
        subject.setFont(new Font("Arial", Font.PLAIN, 22));

        JLabel title = new JLabel("REAL-TIME NETWORK LOG MONITORING AND VISUALIZATION SYSTEM");
        title.setBounds(0, 160, 1200, 40);
        title.setHorizontalAlignment(JLabel.CENTER);
        title.setForeground(Color.ORANGE);
        title.setFont(new Font("Arial", Font.BOLD, 26));

        JTextArea info = new JTextArea();

        info.setText(

                "GROUP MEMBERS\n\n" +

                "☑ Anchal Talreja (CS231124)\n" +
                "☑ Taneesha Wadhwa (CS231137)\n" +
                "☑ Varoon Kumar (CS231142)\n\n" +

                "TECHNOLOGIES USED\n\n" +

                "☑ Cisco Packet Tracer\n" +
                "☑ Java Swing\n" +
                "☑ Python\n" +
                "☑ Ubuntu Linux\n" +
                "☑ ELK Stack\n\n" +

                "PROJECT FEATURES\n\n" +

                "☑ Live Network Monitoring\n" +
                "☑ Log Analysis & Visualization\n" +
                "☑ Security Event Detection\n" +
                "☑ Network Traffic Monitoring\n" +
                "☑ Centralized Dashboard\n\n" +

                "PROJECT OBJECTIVE\n\n" +

                "This project collects logs from routers,\n" +
                "switches and servers in real time.\n\n" +

                "The logs are processed and displayed\n" +
                "through a centralized dashboard for\n" +
                "monitoring, troubleshooting and\n" +
                "security analysis."
        );

        info.setEditable(false);
        info.setBackground(new Color(15, 23, 42));
        info.setForeground(Color.WHITE);
        info.setFont(new Font("Arial", Font.PLAIN, 18));

        JScrollPane scrollPane = new JScrollPane(info);
        scrollPane.setBounds(170, 230, 850, 260);

        JLabel status = new JLabel("● NETWORK STATUS : ONLINE");
        status.setBounds(0, 520, 1200, 40);
        status.setHorizontalAlignment(JLabel.CENTER);
        status.setForeground(Color.GREEN);
        status.setFont(new Font("Arial", Font.BOLD, 24));

        JButton startBtn = new JButton("START PROJECT");
        startBtn.setBounds(470, 580, 260, 55);
        startBtn.setBackground(new Color(34, 197, 94));
        startBtn.setForeground(Color.WHITE);
        startBtn.setFont(new Font("Arial", Font.BOLD, 20));

        startBtn.addActionListener(e -> {
            frame.dispose();
            Dashboard.main(null);
        });

        JLabel footer = new JLabel(
                "Developed By : Anchal Talreja | Taneesha Wadhwa | Varoon Kumar");
        footer.setBounds(0, 690, 1200, 30);
        footer.setHorizontalAlignment(JLabel.CENTER);
        footer.setForeground(Color.LIGHT_GRAY);
        footer.setFont(new Font("Arial", Font.ITALIC, 16));

        panel.add(heading);
        panel.add(subject);
        panel.add(title);
        panel.add(scrollPane);
        panel.add(status);
        panel.add(startBtn);
        panel.add(footer);

        frame.add(panel);
        frame.setVisible(true);
    }
}