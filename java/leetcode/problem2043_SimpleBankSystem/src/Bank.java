class Bank {
    private long[] bal;

    private boolean valid(int acc) {
        return acc >= 1 && acc <= bal.length;
    }

    public Bank(long[] balance) {
        this.bal = new long[balance.length];
        System.arraycopy(balance, 0, this.bal, 0, balance.length);
    }

    public boolean transfer(int from, int to, long money) {
        if (!valid(from) || !valid(to)) return false;
        if (bal[from - 1] < money) return false;
        bal[from - 1] -= money;
        bal[to - 1] += money;
        return true;
    }

    public boolean deposit(int acc, long money) {
        if (!valid(acc)) return false;
        bal[acc - 1] += money;
        return true;
    }

    public boolean withdraw(int acc, long money) {
        if (!valid(acc)) return false;
        if (bal[acc - 1] < money) return false;
        bal[acc - 1] -= money;
        return true;
    }
}

