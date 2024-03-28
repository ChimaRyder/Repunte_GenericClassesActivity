package Map;

import java.util.ArrayList;

public class MyMap<T,U> {
       ArrayList<T> keys;
       ArrayList<U> values;

    public MyMap() {
        keys = new ArrayList<>();
        values = new ArrayList<>();
    }

    public U get(T key) {
       if (keys.contains(key)) {
           return values.get(keys.indexOf(key));
       }

        return null;
    }

    public void put(T key, U value) {
        if (keys.contains(key)) {
            values.set(keys.indexOf(key), value);
        } else {
            keys.add(key);
            values.add(value);
        }
    }

    public U remove(T key) {
        if (keys.contains(key)) {
            U removed = values.remove(keys.indexOf(key));
            keys.remove(key);
            return removed;
        }

        return null;
    }
}
