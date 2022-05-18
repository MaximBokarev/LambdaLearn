package lambda1;

import java.util.Arrays;
import java.util.List;

import static lambda1.FilterApple.filterApplesByColor;
import static lambda1.FilterApple.filterApplesByWeight;

public class App {
    public static void main(String[] args) {
        List<Apple> inventory = Arrays.asList(new Apple(80, Color.GREEN),
                new Apple(155, Color.GREEN),
                new Apple(120, Color.RED));

        List<Apple> greenApples = filterApplesByColor(inventory, Color.GREEN);
        List<Apple> redApples = filterApplesByColor(inventory, Color.RED);
        List<Apple> weightApples = filterApplesByWeight(inventory, 150);
    }
}
