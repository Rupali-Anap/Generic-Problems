package Generics;

public class Generics {

    public int maximum(Integer x, Integer y, Integer z) {
        Integer max = x;
        if (y.compareTo(max) > 0 && y.compareTo(z) > 0)
            max = y;
        else if (z.compareTo(max) > 0)
            max = z;
        return max;
    }

}
