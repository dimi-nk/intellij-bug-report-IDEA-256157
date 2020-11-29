package com.dimink.idea256157;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

// NOOP is disabled
@SpringBootTest(properties = "fooable.noop=false")
class DefaultFooableTests {

  @Autowired
  // The fooable prop is complaining that there are more than one beans available
  private Fooable fooable;

  @Test
  void givenNoopFooableProp_WhenGettingItsValue_ThenReturnNoop() {
    assertThat(fooable.getValue()).isEqualTo("default");
  }
}
