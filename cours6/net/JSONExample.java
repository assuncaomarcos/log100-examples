package net;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

class Person {
    private String name;
    private String address;
    private int age;

    public Person(String name, String address, int age) {
        this.name = name;
        this.address = address;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

public class JSONExample {

    public static void main(String[] args) {
        Person[] people = new Person[] {
                new Person("Amaline Bélanger", "This Street, NS", 18),
                new Person("Jean-Baptiste Bouchard", "That Street, NS", 28),
                new Person("Morgause Traver", "The Other Street, NS", 35)
        };

        ObjectMapper mapper = new ObjectMapper();
        try {
            System.out.println(mapper.writeValueAsString(people));
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
    }
}
