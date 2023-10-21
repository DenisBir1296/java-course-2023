package hw2;

// Task 1

public sealed interface Expr {
    double evaluate();

    public record Constant(double val) implements Expr {
        @Override
        public double evaluate() {
            return val;
        }
    }

    public record Negate(Expr obj) implements Expr {
        @Override
        public double evaluate() {
            return -obj.evaluate();
        }
    }

    public record Exponent(Expr obj, double val) implements Expr {
        @Override
        public double evaluate() {
            return Math.pow(val, obj.evaluate());
        }
    }

    public record Addition(Expr obj1, Expr obj2) implements Expr {
        @Override
        public double evaluate() {
            return obj1.evaluate() + obj2.evaluate();
        }
    }

    public record Multiplication(Expr obj1, Expr obj2) implements Expr {
        @Override
        public double evaluate() {
            return obj1.evaluate() * obj2.evaluate();
        }
    }
}
