package com.vin.back.domain.mapper.common;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class GenericMap<K, V> {
    private Map<K, V> map = new HashMap<>();
    
    public void put(K key, V value) {
        map.put(key, value);
    }
    
    public V get(K key) {
        return map.get(key);
    }
    
    public void remove(K key) {
        map.remove(key);
    }
    
    public Set<K> keySet() {
        return map.keySet();
    }
    
    public Collection<V> values() {
        return map.values();
    }
}
