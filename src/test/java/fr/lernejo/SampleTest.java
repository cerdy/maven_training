package fr.lernejo;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SampleTest {

    @Test
    void op() {
        Sample sampleobj= new Sample();

        int x = sampleobj.op(Sample.Operation.ADD,5,6);

        Assertions.assertThat(x)
                .isEqualTo(11);
    }
   /* @Test
    void dividing_10_by_2_should_produce_5() {
        int dividend = 10;
        int divisor = 2;

        int quotient = Sample.Operation.ADD

        Assertions.assertThat(quotient).as("quotient of 10 / 2")
            .isEqualTo(5);
    }
    */
}
