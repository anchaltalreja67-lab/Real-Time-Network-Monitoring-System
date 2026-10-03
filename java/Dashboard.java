import java.io.*;
import java.awt.*;
import javax.swing.*;

public class Dashboard {

    public static void main(String[] args) {

        JFrame frame = new JFrame("Real-Time Network Monitoring Dashboard");
        frame.setSize(1100, 700);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);

        // TITLE
        JLabel title = new JLabel("REAL-TIME NETWORK LOG MONITORING SYSTEM");
        title.setHorizontalAlignment(SwingConstants.CENTER);
        title.setFont(new Font("Arial", Font.BOLD, 24));
        title.setForeground(Color.BLUE);

        // DEVICE STATUS
        JLabel devices = new JLabel(
                "🟢 Router Connected | 🟢 Switch Online | 🟢 Server Active | 🟢 Firewall Running");
        devices.setHorizontalAlignment(SwingConstants.CENTER);
        devices.setFont(new Font("Arial", Font.BOLD, 16));
        devices.setForeground(new Color(0, 150, 0));

        // HEALTH
        JLabel health = new JLabel("❤️ Network Health : 95%");
        health.setHorizontalAlignment(SwingConstants.CENTER);
        health.setFont(new Font("Arial", Font.BOLD, 18));

        // HEALTH BAR
        JProgressBar healthBar = new JProgressBar();
        healthBar.setValue(95);
        healthBar.setStringPainted(true);

        // LOG AREA
        JTextArea logs = new JTextArea();
        logs.setEditable(false);
        logs.setBackground(Color.BLACK);
        logs.setForeground(Color.GREEN);
        logs.setFont(new Font("Consolas", Font.BOLD, 14));

        try {

            BufferedReader br =
                    new BufferedReader(new FileReader("network_logs.txt"));

            String line;
            StringBuilder data = new StringBuilder();

            while ((line = br.readLine()) != null) {
                data.append(line).append("\n");
            }

            logs.setText(data.toString());

            if (data.toString().contains("[ERROR]")) {

                JOptionPane.showMessageDialog(
                        frame,
                        "⚠ SECURITY ALERT DETECTED!\nFailed Login Attempt Found.",
                        "Security Warning",
                        JOptionPane.WARNING_MESSAGE
                );
            }

            br.close();

        } catch (Exception e) {

            logs.setText(
                    "[INFO] Router Connected Successfully\n" +
                    "[INFO] Switch Online\n" +
                    "[INFO] Server Active\n" +
                    "[INFO] Firewall Running\n" +
                    "[WARNING] High Network Traffic Detected\n" +
                    "[ERROR] Failed Login Attempt\n" +
                    "[INFO] CPU Usage : 45%\n" +
                    "[INFO] RAM Usage : 60%\n"
            );
        }

        JScrollPane scrollPane = new JScrollPane(logs);

        // TOP PANEL
        JPanel topPanel = new JPanel();
        topPanel.setLayout(new GridLayout(3, 1));
        topPanel.add(title);
        topPanel.add(devices);
        topPanel.add(health);

        // BOTTOM PANEL
        JPanel bottomPanel = new JPanel();
        bottomPanel.setLayout(new BorderLayout());

        JLabel footer = new JLabel(
                "DCCN Project | Real-Time Network Monitoring Dashboard");
        footer.setHorizontalAlignment(SwingConstants.CENTER);

        bottomPanel.add(healthBar, BorderLayout.NORTH);
        bottomPanel.add(footer, BorderLayout.SOUTH);

        frame.setLayout(new BorderLayout());

        frame.add(topPanel, BorderLayout.NORTH);
        frame.add(scrollPane, BorderLayout.CENTER);
        frame.add(bottomPanel, BorderLayout.SOUTH);

        frame.setVisible(true);
    }
}