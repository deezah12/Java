package chapter16;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Color {

    String[] colors = {"Green", "Yellow", "Blue", "Red", "Brown"};
    HashMap map = new HashMap<>((Map) Arrays.asList(colors));
}
