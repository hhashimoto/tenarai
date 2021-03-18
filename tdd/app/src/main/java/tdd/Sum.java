package tdd;

public class Sum implements Expression {
    Money augend;
    Money addend;

    Sum(Money augend, Money addend) {
        this.augend = augend;
        this.addend = addend;
    }

    public Money reduce(String to) {
        return new Money(this.augend.amount + this.addend.amount, to);
    }
}
