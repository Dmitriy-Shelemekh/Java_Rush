package com.javarush.task.task37.task3707;

/**
 * Created by Dmitry Shelemekh on 13.10.2017.
 */

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.*;

public class AmigoSet<E> extends AbstractSet<E> implements Serializable, Cloneable, Set<E> {
    private static final Object PRESENT = new Object();
    private transient HashMap<E, Object> map;
    private static final long serialVersionUID = 4243607099059311858L;

    public AmigoSet() {
        map = new HashMap<>();
    }

    public AmigoSet(Collection<? extends E> collection) {
        map = new HashMap<>((int) Math.ceil(Math.max(16, collection.size() / .75f)));
        this.addAll(collection);
    }

    private final void writeObject(ObjectOutputStream x) throws IOException {
        try {
            x.defaultWriteObject();

        } catch (IOException i) {
            i.printStackTrace();
        }
    }

    private final void readObject(ObjectInputStream x) throws IOException {
        try {
            x.defaultReadObject();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }


    @Override
    public Object clone() {
        AmigoSet amigoSet = new AmigoSet<>();
        try {
            amigoSet.addAll(this);
            amigoSet.map.putAll((Map) this.map.clone());
        } catch (Exception e) {
            throw new InternalError();
        }
        return amigoSet;
    }

    public boolean add(E e) {
        return null == map.put(e, PRESENT);
    }

    @Override
    public Iterator<E> iterator() {
        return map.keySet().iterator();
    }

    @Override
    public int size() {
        return map.size();
    }

    @Override
    public boolean isEmpty() {
        return map.isEmpty();
    }

    @Override
    public boolean contains(Object o) {
        return map.keySet().contains(o);
    }

    @Override
    public boolean remove(Object o) {
        return map.keySet().remove(o);
    }

    @Override
    public void clear() {
        map.clear();
    }
}