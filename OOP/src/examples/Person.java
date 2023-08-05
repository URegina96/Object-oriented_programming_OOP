package examples;
public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setAge(int age) { //возможность устанавливать значения из вне этого класса (допустим в main), несмотря на privat
        if (age >= 0) {
            this.age = age;
        }
    }

    public String getName() { //public метод, который возвращает значения, указанных переменных
        return name;
    }
    public int getAge() { //public метод, который возвращает значения, указанных переменных
        return age;
    }
}


