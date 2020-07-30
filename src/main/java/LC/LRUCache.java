package LC;

import java.util.HashMap;

/**
 * Created by fujie on 20/7/30.
 */
public class LRUCache {
    public HashMap<Integer, Integer> hashMap = new HashMap<>(2);
    public int capacity;

    public LRUCache(int capacity) {
        this.capacity = capacity;
    }

    public static void main(String[] args) {
        LRUCache cache = new LRUCache(2 /* 缓存容量 */);

        cache.put(1, 1);
        cache.put(2, 2);
        cache.get(1);       // 返回  1
        cache.put(3, 3);    // 该操作会使得密钥 2 作废
        cache.get(2);       // 返回 -1 (未找到)
        cache.put(4, 4);    // 该操作会使得密钥 1 作废
        cache.get(1);       // 返回 -1 (未找到)
        cache.get(3);       // 返回  3
        cache.get(4);       // 返回  4

    }

    public int get(int key) {
        if (hashMap.containsKey(key)) {
            return hashMap.get(key);
        } else {
            return -1;
        }

    }

    public void put(int key, int value) {
        if (capacity == 2) {
            System.out.println("扩容");
        } else {
            hashMap.put(key, value);
        }
    }

}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */