package tdd;

public class Bank {
    Money reduce(Expression source, String to) {
        Sum sum = (Sum) source;
        return new Money(sum.augend.amount + sum.addend.amount, to);
    }
}
