package core.basesyntax.impl;

import core.basesyntax.Storage;

public class StorageImpl<K, V> implements Storage<K, V> {
    private K[] keysArray;
    private V[] valuesArray;
    private int storageValue;

    public StorageImpl() {
        this.keysArray = (K[]) new Object[10];
        this.valuesArray = (V[]) new Object[10];
    }

    @Override
    public void put(K key, V value) {
        for (int i = 0; i < storageValue; i++) {
            if (key == keysArray[i] || key != null && key.equals(keysArray[i])) {
                valuesArray[i] = value;
                return;
            }
            keysArray[storageValue] = key;
            valuesArray[storageValue] = value;
            storageValue++;

        }
    }

    @Override
    public V get(K key) {
        for (int i = 0; i < storageValue; i++) {
            if (key == keysArray[i] || key != null && key.equals(keysArray[i])) {
                return valuesArray[i];
            }
        }
        return null;
    }

    @Override
    public int size() {
        return storageValue;
    }
}
