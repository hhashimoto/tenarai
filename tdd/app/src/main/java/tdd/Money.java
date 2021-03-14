package tdd;

class Money {
    protected int amount;
    protected String currency;

    Money(int amount, String currency) {
        this.amount = amount;
        this.currency = currency;
    }

    public boolean equals(Object object) {
        Money money = (Money) object;
        return this.amount == money.amount && this.currency().equals(money.currency());
    }

    public static Money dollar(int amount) {
        return new Dollar(amount, "USD");
    }

    public static Money franc(int amount) {
        return new Franc(amount, "CHF");
    }

    String currency() {
        return this.currency;
    }

    public String toString() {
        return this.amount + " " + this.currency;
    }

    Money times(int multiplier) {
        return new Money(this.amount * multiplier, this.currency);
    }
}
