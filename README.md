We define two beans returning `Fooable` inside `ExampleConfiguration`. The beans are essentially
mutually exclusive, since "noop" relies on a prop while "default" relies on no other available bean.

**Points of interest**

1. `ExampleConfiguration#fooableValue`'s parameter `fooable` complains that it doesn't know which
bean is going to get injected.
2. `DefaultFooableTests`'s `@Autowired` `fooable` complains that it doesn't know which bean is going
to get injected.
3. `NoopFooableTests`'s `@Autowired` `fooable` complains that it doesn't know which bean is going to
get injected.

In order to showcase that the configuration actually works and correctly returns only one bean for
each case, I've written two tests.
