package tdd;

public class Franc extends Money {
    Franc(int amount, String currency) {
        super(amount, currency);
    }

    Money times(int multiplier) {
        return new Franc(this.amount * multiplier, this.currency);
    }
}
