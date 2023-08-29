package org.example;

public class Student2 implements Comparable<Student2>{

    private String name;

    private int id;

    public Student2 (String name, Integer id){
        super();
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setAge(Integer id) {
        this.id = id;
    }

    public String toString(){
        return id + " " + name;
    }

    @Override
    public int compareTo(Student2 that) {
        return Integer.compare(this.id, that.id);
    }
}
