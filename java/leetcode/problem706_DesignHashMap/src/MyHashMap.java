import java.util.ArrayList;

class MyHashMap {
    private ArrayList<int[]> list;
    public MyHashMap() {
        list = new ArrayList<>();
    }

    public void put(int key, int value) {
        if (this.get(key) == -1) {
            this.list.add(new int[]{key, value});
        } else {
            this.remove(key);
            list.add(new int[]{key, value});
        }
    }

    public int get(int key) {
        for (int[] element : this.list) {
            if (element[0] == key) {
                return element[1];
            }
        }
        return -1;
    }

    private int getIndex(int key) {
        int index = -1;
        for (int i = 0; i < this.list.size(); i++) {
            if (this.list.get(i)[0] == key) {
                index = i;
            }
        }
        return index;
    }

    public void remove(int key) {
        int index = this.getIndex(key);
        if (index != -1) {
            this.list.remove(index);
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int[] element : this.list) {
            sb.append(element[0] + ": " + element[1] + "\n");
        }
        return sb.toString();
    }
}