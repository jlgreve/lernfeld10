# Lernfeld 10: Workshop (Builder Pattern)

## Credit

This workshop was prepared by Jan Leon Greve and Maximilian Staas of the IT2L.

## Introduction

Welcome to this workshop. In this workshop, we will be using the builder pattern
to make complex classes with many constructor parameters more accessible and
flexible when programming with Java.

This project uses the IntelliJ IDEA build system and requires IntelliJ IDEA to be run
out of the box.

## The builder pattern

The builder pattern involves creating a special class known as a builder for the
complex class you wish to construct in a more flexible and procedural manner.

## Examples

In this workshop, we have prepared two classes:
* The `Pizza` class
* The `Car` class

The `Pizza` class already has a builder and is constructed in the `main` method 
included in the `Main` class (`./src/lften/itech/de/main.java`) using this builder.
As one can see, the construction of a `Pizza` instance is achieved by the successive
invocation of methods provided by the `PizzaBuilder` class, followed by a call to `.build()`,
which finally constructs and returns the completed `Pizza` object.

The `PizzaBuilder`'s methods also include certain sanity checks to ensure that, for example,
a `Pizza` maybe not be smaller than 10 centimeters.
As this logic is included in the builder itself, there should never occur a situation in which
a constructed `Pizza` is too small to be enjoyed.

The `Car` class is very similar to the `Pizza` class, only that the `Car` class has no builder
and must be constructed directly by using the constructor.
Furthermore, there are no checks to ensure that, for example, a `Car` instance has a negative amount
of seats.

## Tasks

### Task 1: Pizza variety

For your first task, add a new `Topping` class for the `Pizza` class and create a `Pizza` using this topping.
Ensure that the `Topping` is properly implemented such that adding it to a single `Pizza` twice will result in a runtime error.

### Task 2: Car builder

For the second task,
you will take inspiration from the `PizzaBuilder` and create a builder class for the `Car` class called the `CarBuilder`.
Your builder should include reasonable sanity checks
to ensure that only plausible and functional `Car` objects may be constructed.
Finally, use your builder to construct two `Car` instances in the existing `main` method and print their details.

### BONUS TASK: Car director

For the bonus task, you will create a director that uses the car builder to construct a predefined `SUV` Car Object and 
a predefined `SportsCar` Object to replace the construction of these objects in the `main` method.