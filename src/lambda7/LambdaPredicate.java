package lambda7;

import lambda1.Apple;
import lambda1.Color;

import java.util.Arrays;
import java.util.List;

import static lambda6.PredicateUse.filter;

public class LambdaPredicate {
    public static void main(String[] args) {

        List<Apple> inventory = Arrays.asList(new Apple(80, Color.GREEN),
                new Apple(155, Color.GREEN),
                new Apple(120, Color.RED));

        List<Apple> redApples = filter(inventory, (Apple apple) -> Color.RED.equals(apple.getColor()));
    }
}