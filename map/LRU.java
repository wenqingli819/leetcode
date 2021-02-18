package map;

import java.util.LinkedHashMap;

/*
 * Created by babydeveloper on 1/15/21.

 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */

public class LRU extends LinkedHashMap<Integer,Integer> {
    int initialCapacity;
    float loadFactor;
    public LRU(int initialCapacity, float loadFactor){
        super(initialCapacity, loadFactor, true);
    }
    public int get(Integer key){
        return super.getOrDefault(key,-1);
    }
    public Integer put(Integer key, Integer value){
        super.put(key,value);
        return key;
    }

    public static void main(String[] args) {
        LRU lru = new LRU(2,0.75F);
        lru.put(1,0);
        lru.put(2,0);
        lru.put(3,0);
        lru.put(4,0);
        lru.put(5,0);
        System.out.println(lru);
        lru.get(1);
        System.out.println(lru);
        lru.get(4);
        System.out.println(lru);


    }
}
