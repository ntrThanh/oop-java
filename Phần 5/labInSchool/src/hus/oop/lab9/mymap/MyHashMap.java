package hus.oop.lab9.mymap;

public class MyHashMap implements MyMap {
    private static int INITIAL_SIZE = 8;
    private MyHashMapEntry[] table;
    private int size;

    public MyHashMap() {
        table = new MyHashMapEntry[INITIAL_SIZE];
        size = 0;
    }

    public Object get(Object key) {
        int bucket = getBucket(key);
        if (table[bucket] != null) {
            return table[bucket].getValue();
        }
        return -1;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void put(Object key, Object value) {
        if (capacityRatio() > 0.75) {
            enlarge();
        }

        int bucket = getBucket(key);
        if (table[bucket] == null) {
            table[bucket] = new MyHashMapEntry(key, value);
            size++;
        }
    }

    @Override
    public void remove(Object key) {
        for (int i = 0; i < size; i++) {
            if (table[i].getKey().equals(key) && table[i] != null && table[i].getKey() != null) {
                int temp = i;
                for (int j = temp; j < size; j++) {
                    table[j] = table[j + 1];
                }
                break;
            }
        }
        size--;
    }

    @Override
    public boolean contains(Object key) {
        for (int i = 0; i < table.length; i++) {
            if (table[i] != null && table[i].getKey() != null) {
                if (table[i].getKey().equals(key)) {
                    return true;
                }
            }
        }
        return false;
    }

    int getBucket(Object key) {
        int bucket = (Math.abs(key.hashCode())) % table.length;
        while (table[bucket] != null && table[bucket].getKey() != key) {
            bucket = (bucket + 1) % table.length;
        }
        return bucket;
    }

    double capacityRatio() {
        return size / (double) table.length;
    }

    void enlarge() {
        MyHashMapEntry[] temp = new MyHashMapEntry[size * 2];
        System.arraycopy(table, 0, temp, 0, size);
        table = temp;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < table.length; i++) {
            if (table[i] == null) {
                sb.append(String.format("[bucket %d] -> null\n", i));
            } else {
                sb.append(String.format("[bucket %d] ->(%s, %s)\n", i,
                        table[i].getKey(), table[i].getValue()));
            }
        }
        return sb.toString();
    }
}
