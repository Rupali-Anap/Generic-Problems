package Generics;

public class Generics {

    public Float maximum(Float x, Float y, Float z) {
        Float max = x;
        if (y.compareTo(max) > 0 && y.compareTo(z) > 0)
            max = y;
        else if (z.compareTo(max) > 0)
            max = z;
        return max;
    }

}

