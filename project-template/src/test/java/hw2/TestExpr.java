package hw2;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class TestExpr {

    @Test
    public void TestExpr() {
        var two = new Expr.Constant(2.0);
        var three = new Expr.Constant(3.0);
        assertThat(new Expr.Addition(two, three).evaluate()).isEqualTo(5.0);

        var minusTwo = new Expr.Negate(new Expr.Constant(2.0));
        assertThat(new Expr.Exponent(minusTwo, 5.0).evaluate()).isEqualTo(0.04);
    }
}
