package LC.DESIGN;



/**
 * Created by fujie on 20/7/30.
 */
public class LRUCache {
    public int index = 0; //找到可以使用的下表
    public int date = 0; //当作时间戳
    //「项的使用次数」就是自插入该项以来对其调用 get 和 put 函数的次数之和。使用次数会在对应项被移除后置为 0 。
    public int capacity;
    public int[] cache;
    public int[] value;
    public int[] cnt; //该内存的使用次数
    public int[] used; //该内存是否被使用

    public LRUCache(int capacity) {
        this.capacity = capacity;
        cache = new int[capacity];
        value = new int[capacity];
        used = new int[capacity];
        cnt = new int[capacity];
    }

    public static void main(String[] args) {
        LRUCache cache = new LRUCache(2 /* 缓存容量 */);

        cache.get(2);       // 返回  1
        cache.put(2, 6);
        cache.get(1);       // 返回  1
        cache.put(1, 5);
        cache.put(1, 2);    // 该操作会使得关键字 2 作废
        cache.get(1);       // 返回 -1 (未找到)
        cache.get(2);       // 返回 -1 (未找到)
    }


    public static int isCZ(int[] cache, int key) {
        for (int i = 0; i < cache.length; i++) {
            if (cache[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static int length(int[] used) {
        int i = 0;
        for (int j = 0; j < used.length; j++) {
            if (used[j] == 1) {
                i++;
            }
        }
        return i;
    }

    public int get(int key) {
        if (index == 0) {
            return -1;
        }
        int loc = isCZ(cache, key);
        if (loc == -1) {
            System.out.println(-1);
            return -1;
        } else {
            System.out.println(value[loc]);
            cnt[loc] = ++date;
            return value[loc];
        }

    }

    public void put(int key, int value1) {

        int loc = isCZ(cache, key);
        if (loc == -1 && length(used) < capacity) {
            cache[index] = key;
            value[index] = value1;
            used[index] = 1;
            cnt[index] = ++date;
            index++;
        } else if (loc == -1 && length(used) == capacity) {
            int minloc = min(cnt);
            cache[minloc] = key;
            value[minloc] = value1;
            cnt[minloc] = ++date;
        } else if (loc != -1 ) {
            cache[loc] = key;
            value[loc] = value1;
            used[loc] = 1;
            cnt[loc] = ++date;
        }

    }


    public int min(int cnt[]) {
        int min = cnt[0];
        int loc = 0;
        for (int i = 0; i < cnt.length; i++) {
            if (cnt[i] < min) {
                min = cnt[i];
                loc = i;
            }
        }
        return loc;
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */