import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
    static class Server implements Comparable<Server> {
        int id;
        long time;

        public Server(int id, long time) {
            this.id = id;
            this.time = time;
        }

        @Override
        public int compareTo(Server o) {
            if (this.time != o.time) {
                return Long.compare(this.time, o.time);
            }
            return Integer.compare(this.id, o.id);
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        StringTokenizer st = null;

        String line = br.readLine();
        if (line == null) return;
        st = new StringTokenizer(line);
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        PriorityQueue<Server> pq = new PriorityQueue<>(k);
        for (int i = 0; i < k; i++) {
            pq.add(new Server(i, 0));
        }

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            long t = Long.parseLong(st.nextToken());
            long d = Long.parseLong(st.nextToken());

            Server bestServer = pq.poll();

            long startTime = Math.max(t, bestServer.time);
            long endTime = startTime + d;

            if (i > 0) {
                out.print(" ");
            }
            out.print(endTime);

            bestServer.time = endTime;
            pq.add(bestServer);
        }

        out.println();
        out.flush();
        out.close();
    }
}