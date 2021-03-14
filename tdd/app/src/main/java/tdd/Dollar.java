package tdd;

public class Dollar extends Money {
    Dollar(int amount) {
        this.amount = amount;
        this.currency = "USD";
    }

    Money times(int multiplier) {
        return new Dollar(this.amount * multiplier);
    }

    String currency() {
        return this.currency;
    }
}
