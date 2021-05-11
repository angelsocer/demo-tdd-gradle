package ewan;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class EwanServiceTest {
    @Test
    @DisplayName("유안아 아빠 너무 졸려")
    public void areYouBaby(){
        assertThat(EwanService.areYouBaby(0)).isTrue();
        assertThat(EwanService.areYouBaby(10)).isTrue();
        assertThat(EwanService.areYouBaby(20)).isFalse();
        assertThat(EwanService.areYouBaby(19)).isTrue();
        assertThat(EwanService.areYouBaby(21)).isFalse();
    }
}
