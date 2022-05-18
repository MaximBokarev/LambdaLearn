package lambda6;

import lambda1.Apple;
import lambda1.Color;

import java.util.ArrayList;
import java.util.List;

public class PredicateUse {
    public static <T> List<T> filter(List<T> list, Predicate<T> p){
        List<T> result = new ArrayList<>();
        for(T e : list){
            if(p.test(e)){
                result.add(e);
            }
        }
        return result;
    }


}
