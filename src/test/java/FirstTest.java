import First.First;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class FirstTest {

    @Test
    @DisplayName("test first")
    void testFirst(){
        assertThat(First.isValid(1)).isTrue();
        assertThat(First.isValid(2)).isFalse();
        assertThat(First.isValid(0)).isFalse();
    }
}
