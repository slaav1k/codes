class Packet {
    private int _source;
    private int _destination;
    private int _timestamp;

    public Packet(int source, int destination, int timestamp) {
        _source = source;
        _destination = destination;
        _timestamp = timestamp;
    }

    public int getSource() {
        return _source;
    }

    public int getDestination() {
        return _destination;
    }

    public int getTimestamp() {
        return _timestamp;
    }
}
