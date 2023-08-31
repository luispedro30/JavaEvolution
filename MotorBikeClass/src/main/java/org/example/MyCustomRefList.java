package org.example;

import java.util.ArrayList;

public class MyCustomRefList <T>{
    ArrayList<T> list = new ArrayList<>();

    public void addElement(T element){
        list.add(element);
    }

    public void deleteElement(T element){
        list.remove(element);
    }

    public String toString(){
        //
        return list.toString();
    }

    public T get(int index){
        return list.get(index);
    }
}
