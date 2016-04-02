package org.springframework.samples.petclinic.model;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

public class OwnerTests {
    @Test
    public void getPetForNonExistentPetReturnsNull() {
        Owner owner = new Owner();
        owner.addPet(new Pet());

        assertThat(owner.getPet("Flammarion")).isNull();
    }
}
