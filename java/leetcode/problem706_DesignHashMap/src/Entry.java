public class Entry {
    int key;
    int value;

    public Entry(int key, int value) {
        this.key = key;
        this.value = value;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("[");
        stringBuilder.append(key);
        stringBuilder.append(": ");
        stringBuilder.append(value);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}
