package box;
public class Box {
    //если модификатор доступа не указан, то он автоматически считается paced private (default)
    double length;
    double width;
    double height;
    //у всех конструкторов, должно быть имя класса
    Box() { //конструктор_1
        this(10);
    }

    Box (Box another) {//в качестве параметров принимает другую коробку
        this(another.length, another.width, another.height);

    }
    Box(double length, double width, double height) { //конструктор_2
        this.length = length;
        this.width = width;
        this.height = height;
    }
    Box(double size){//конструктор_3
        this(size,size,size);
    }

    void setDimens(double length, double width, double height) { //метод устанавливающий значения
        this.length = length;
        this.width = width;
        this.height = height;
    }
    //метод для сравнения коробок
    void compare(Box another){ //ссылочный тип_1
        double currentVolume = getVolume();
        double anotherVolume = another.getVolume();
        if (currentVolume > anotherVolume){
            System.out.println("Current > Another");
        } else if (currentVolume < anotherVolume) {
            System.out.println("Current < Another");
        }else{
            System.out.println("Current == Another");
        }
    }
//      для возвращения
//    int compare(Box another){ // в качестве параметров можем передавать ссылочный тип_2
//        double currentVolume = getVolume();
//        double anotherVolume = getVolume();
//        if (currentVolume > anotherVolume){
//            return 1;
//        } else if (currentVolume < anotherVolume) {
//            return -1;
//        }else{
//            return 0;
//        }
//    }

    double getVolume() { //метод на возвращение, в качестве параметров можем передавать ссылочный так и возвращаемый метод может быть ссылочным типом
        return length * width * height;
    }

    void showVolume() { //метод на вывод в консоль
        System.out.println(getVolume());

    }
}

