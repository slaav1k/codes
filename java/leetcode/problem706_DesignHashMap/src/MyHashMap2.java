import java.util.LinkedList;

class MyHashMap2 {
    private static final int DEFAULT_CAPACITY = 1024;
    private LinkedList<Entry>[] buckets;

    public MyHashMap2() {
        buckets = new LinkedList[DEFAULT_CAPACITY];
    }

    private int hash(int key) {
        return key % DEFAULT_CAPACITY;
    }

    public void put(int key, int value) {
        int hash = this.hash(key);
        if (buckets[hash] == null) {
            buckets[hash] = new LinkedList<>();
        }

        for (Entry entry : buckets[hash]) {
            if (entry.key == key) {
                entry.value = value;
                return;
            }
        }

        buckets[hash].add(new Entry(key, value));
    }

    public int get(int key) {
        int hash = this.hash(key);
        if (buckets[hash] == null) {
            return -1;
        }

        for (Entry entry : buckets[hash]) {
            if (entry.key == key) {
                return entry.value;
            }
        }
        return -1;
    }

    public void remove(int key) {
        int hash = this.hash(key);
        if (buckets[hash] == null) {
            return;
        }
        buckets[hash].removeIf(entry -> entry.key == key);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        boolean hasElements = false;

        for (LinkedList<Entry> list : buckets) {
            if (list != null) {
                for (Entry entry : list) {
                    sb.append(entry.toString()).append("\n");
                    hasElements = true;
                }
            }
        }

        return hasElements ? sb.toString() : "{}";
    }



}
