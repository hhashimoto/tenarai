package tdd;

abstract class Money {
    protected int amount;
    protected String currency;

    public boolean equals(Object object) {
        Money money = (Money) object;
        return this.amount == money.amount && this.getClass().equals(money.getClass());
    }

    public static Money dollar(int amount) {
        return new Dollar(amount, null);
    }

    public static Money franc(int amount) {
        return new Franc(amount, null);
    }

    abstract Money times(int multiplier);

    String currency() {
        return this.currency;
    }
}
