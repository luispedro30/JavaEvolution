package org.example;

public class MyCustomRefListRunner {
    public static void main(String[] args) {
        MyCustomRefList list = new MyCustomRefList();
        list.addElement("Element 1");
        list.addElement("Element 2");

        String value = (String) list.get(0);

        System.out.println(value);


        System.out.println(list);

        MyCustomRefList list2 = new MyCustomRefList();
        list2.addElement(1);
        list2.addElement(2);

        System.out.println(list2);
    }
}
