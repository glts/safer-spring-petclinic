package org.springframework.samples.petclinic.model;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

public class NamedEntityTests {
    @Test
    public void toStringReturnsNonNullString() {
        assertThat(new Pet().toString()).isEqualTo("null");
    }
}
