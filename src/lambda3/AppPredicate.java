package lambda3;

import lambda1.Apple;
import lambda1.Color;

import java.util.Arrays;
import java.util.List;

import static lambda3.FilterApple2.filterApples;

public class AppPredicate {
    public static void main(String[] args) {
        List<Apple> inventory = Arrays.asList(new Apple(80, Color.GREEN),
                new Apple(155, Color.GREEN),
                new Apple(120, Color.RED));

        List<Apple> heavyApples = filterApples(inventory, new AppleHeavyWeightPredicate());
        List<Apple> greenApples = filterApples(inventory, new AppleGreenColorPredicate());

    }
}
