package usingJunit;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;

/*
junit5
ref : https://velog.io/@kyle/TDD%EB%A1%9C-%EA%B0%9C%EB%B0%9C%ED%95%98%EA%B8%B0-2%ED%83%84
 */
public class JunitServiceTest {

    @Test
    void lambdaExpressions() {
        List<Integer> numbers = Arrays.asList(1, 2, 3);
        assertTrue(getSum(numbers) > 5, () -> "Sum should be greater than 5");
    }

    private int getSum(List<Integer> numbers) {
        return numbers
                .stream()
                .mapToInt(i -> i)
                .sum();
    }
}
