package tdd;

public class Franc extends Money {
    private int amount;

    Franc(int amount) {
        this.amount = amount;
    }

    Franc times(int multiplier) {
        return new Franc(this.amount * multiplier);
    }

    public boolean equals(Object object) {
        Franc dollar = (Franc) object;
        return this.amount == dollar.amount;
    }
}
