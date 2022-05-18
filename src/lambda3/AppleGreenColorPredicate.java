package lambda3;

import lambda1.Apple;
import lambda1.Color;

public class AppleGreenColorPredicate implements ApplePredicate{

    public boolean test(Apple apple) {
        return Color.GREEN.equals(apple.getColor());
    }
}
