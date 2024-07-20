package sealed_classes;

import java.util.Comparator;

// permits with classes

sealed class A extends Thread implements Comparator<Integer> permits B, C {

    @Override
    public int compare(Integer o1, Integer o2) {
        return o1 > o2 ? 1 : -1;
    }

}

final class B extends A {

}

sealed class C extends A permits D {

}

non-sealed class D extends C {

}

class E extends D {

}

// permits with interfaces

sealed interface X permits Y {

}

non-sealed interface Y extends X {

}

public class Main {
    public static void main(String[] args) {

    }

}