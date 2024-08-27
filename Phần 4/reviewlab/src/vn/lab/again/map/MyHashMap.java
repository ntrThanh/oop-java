package vn.lab.again.map;

public class MyHashMap implements MyMap {
    private final static int INITIAL_SIZE = 8;
    private MyHashMapEntry[] table;
    private int size;
    public MyHashMap() {
        table = new MyHashMapEntry[INITIAL_SIZE];
        size = 0;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void put(Object key, Object value) {
        if (size >= table.length) {
            enlarge();
        }

        table[size] = new MyHashMapEntry(key, value);
        size++;
    }

    @Override
    public void remove(Object key) {
        if (key == null) {
            return;
        }
        int indexToRemove = -1;
        for (int i = 0; i < size; i++) {
            if (table[i] != null && table[i].getKey().equals(key)) {
                indexToRemove = i;
                break;
            }
        }

        if (indexToRemove != -1) {
            for (int i = indexToRemove; i < size; i++) {
                table[i] = table[i + 1];
            }
            size--;
        }
    }

    @Override
    public boolean contains(Object key) {
        if (key == null) {
            return false;
        }

        for (int i = 0; i < size; i++) {
            if (table[i] != null && table[i].getKey().equals(key)) {
                return true;
            }
        }
        return false;
    }


    private void enlarge() {
        MyHashMapEntry[] currentTable = new MyHashMapEntry[table.length * 2];
        System.arraycopy(table, 0, currentTable, 0, table.length);
        table = currentTable;
    }

    public double capacityRatio() {
        return size / (double) table.length;
    }

    public int getBucket(Object key) {
        int bucket = (Math.abs((key.hashCode()) % table.length));
        while(table[bucket] != null && table[bucket].getKey() != key) {
            bucket =(bucket + 1) / table.length;
        }

        return bucket;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < table.length; i++) {
            if (table[i] == null) {
                sb.append(String.format("[bucket %d] -> null\n", i));
            } else {
                sb.append(String.format("[bucket %d] -> (%s, %s)\n", i,
                        table[i].getKey(), table[i].getValue()));
            }
        }
        return sb.toString();
    }

    public Object get(Object key) {
        int bucket = getBucket(key);
        if (table[bucket] != null) {
            return table[bucket].getValue();
        }

        return -1;
    }

    public static void main(String[] args) {
        MyMap map  = new MyHashMap();
        Key testKey = new Key("Xin chao");

        map.put("Chi So Mot", 1000);
        map.put("Chi so Hai", 2000);
        map.put("Chi so Ba", 3000);
        map.put("Chi so Tam", 4000);
        map.put("Chi so Bay", 5000);
        map.put(testKey, 6000);

        System.out.println(map);
        System.out.println();

        System.out.println(map.contains(testKey) ? "map is contain" : "map isn\'t contain");
        System.out.println();

        map.remove(testKey);
        System.out.println(map);
    }
}

class Key {
    private String key;

    public Key(String key) {
        this.key = key;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    @Override
    public String toString() {
        return "Key" + '[' +
                "key='" + key + '\'' +
                ']';
    }
}