import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

class MyHashSet {
    private final Set<Integer> set;

    public MyHashSet() {
        this.set = new HashSet<Integer>();
    }

    public void add(int key) {
        if (!this.contains(key)) {
            this.set.add(key);
        }
    }

    public void remove(int key) {
        if (this.contains(key)) {
//            this.set.remove(this.set.indexOf(key));
            this.set.remove(key);
        }
    }

    public boolean contains(int key) {
        return this.set.contains(key);
    }

    @Override
    public String toString() {
        return "MyHashSet{" +
                "set=" + set +
                '}';
    }
}
