package org.example;

public class Student {
public int Id;
public String name;

    public Student(int id, String name) {
        Id = id;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public void setName(String name) {
        this.name = name;
    }
}
