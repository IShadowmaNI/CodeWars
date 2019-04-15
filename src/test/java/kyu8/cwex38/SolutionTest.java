package kyu8.cwex38;

import static org.assertj.core.api.Assertions.*;
import org.junit.Test;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class SolutionTest {

    @Test
    public void testBasics()
    {
        System.out.println("Basic Tests");
        assertThat(BasicOperations.basicMath("+", 4, 7), is(11));
        assertThat(BasicOperations.basicMath("-", 15, 18), is(-3));
        assertThat(BasicOperations.basicMath("*", 5, 5), is(25));
        assertThat(BasicOperations.basicMath("/", 49, 7), is(7));
        assertThatThrownBy(() ->
            BasicOperations.basicMath("asdasfasdsa", 49, 7)).isInstanceOf(IllegalArgumentException.class)
                .hasMessage("Please enter a valid operator! Choices are: +, -, *, /");
    }
}
