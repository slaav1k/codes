import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        String line = reader.readLine();
        String[] tokens = line.split(" ");

        long a = Long.parseLong(tokens[0]);
        long b = Long.parseLong(tokens[1]);

        writer.write(String.valueOf(a + b));

        reader.close();
        writer.close();
    }
}