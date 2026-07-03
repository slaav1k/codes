import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

class Notification implements Comparable<Notification> {
    int _id;
    long _p;
    long _s;

    Notification(int pId, int pP, int pS) {
        _id = pId;
        _p = pP;
        _s = pS;
    }

    public int get_id() {
        return _id;
    }

    public void redevelopment() {
        _s += _p;
    }

    @Override
    public int compareTo(Notification pOther) {
        if (this._s != pOther._s) {
            return Long.compare(this._s, pOther._s);
        }

        return Integer.compare(this._id, pOther._id);
    }
}


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        PriorityQueue<Notification> pq = new PriorityQueue<>();

        PrintWriter out = new PrintWriter(System.out);


        int id, p, s;

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            id = Integer.parseInt(st.nextToken());
            p = Integer.parseInt(st.nextToken());
            s = Integer.parseInt(st.nextToken());

            pq.add(new Notification(id, p, s));
        }

        Notification tmp;

        for (int i = 0; i < m; i++) {
            tmp = pq.poll();
            assert tmp != null;
            out.println(tmp.get_id());
            tmp.redevelopment();
            pq.add(tmp);
        }

        out.flush();
        out.close();
    }
}