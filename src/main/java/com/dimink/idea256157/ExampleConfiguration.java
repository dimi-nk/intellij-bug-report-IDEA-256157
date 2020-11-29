package com.dimink.idea256157;

import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ExampleConfiguration {

  @Bean
  @ConditionalOnProperty(value = "fooable.noop", havingValue = "true")
  public Fooable noopFooable() {
    return new NoopFooable();
  }

  @Bean
  @ConditionalOnMissingBean
  public Fooable defaultFooable() {
    return new DefaultFooable();
  }

  @Bean
  // The fooable prop is complaining that there are more than one beans available
  public String fooableValue(Fooable fooable) {
    return fooable.getValue();
  }
}
