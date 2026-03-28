package com.algaworks.algasensors.device.management;


import com.algaworks.algasensors.device.management.common.IdGenerator;
import io.hypersistence.tsid.TSID;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class TSIDTest {

    @Test
    void shouldGenerateTSID() {
        TSID tsid = IdGenerator.generateTSID();

        Assertions.assertThat(tsid).isNotNull();
        Assertions.assertThat(tsid).isInstanceOf(TSID.class);
    }
}
