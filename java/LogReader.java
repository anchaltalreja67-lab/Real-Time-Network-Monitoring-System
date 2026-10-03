import java.io.*;

public class LogReader {

    public static void readLogs() {

        try {
            BufferedReader br = new BufferedReader(
                    new FileReader("network_logs.txt"));

            String line;

            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

            br.close();

        } catch (Exception e) {
            System.out.println("Log file not found!");
        }
    }

    public static void main(String[] args) {
        System.out.println("Reading Network Logs...\n");
        readLogs();
    }
}