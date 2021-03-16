package fr.lernejo;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SampleTest {

    @Test
    void add_behave_as_expected() {
        int resultAdd = new Sample().op(Sample.Operation.ADD, 9,8);
        int resultMult = new Sample().op(Sample.Operation.MULT, 6,12);

        Assertions.assertThat(resultAdd).isEqualTo(17);
        Assertions.assertThat(resultMult).isEqualTo(72);

    }

}
