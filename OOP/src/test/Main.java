package test;

import examples.Person;

public class Main {
    public static void main(String[] args) {
        Person person =new Person("Hahe", 6754);
        person.setAge(-6453);
        System.out.println("Name: "+person.getName()+", age: "+person.getAge());

        //Box box = new Box(5); - будет ошибка

    }
}