package tdd;

abstract class Money {
    protected int amount;

    public boolean equals(Object object) {
        Money money = (Money) object;
        return this.amount == money.amount && this.getClass().equals(money.getClass());
    }

    public static Dollar dollar(int amount) {
        return new Dollar(amount);
    }

    abstract Money times(int multiplier);
}
