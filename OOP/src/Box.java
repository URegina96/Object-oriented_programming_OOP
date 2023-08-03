public class Box {
    double length;
    double width;
    double height;
    //у всех конструкторов, должно быть имя класса
    Box() { //конструктор_1
        this.length = 10;
        this.width = 10;
        this.height = 10;
    }
    Box(double length, double width, double height) { //конструктор_2
        this.length = length;
        this.width = width;
        this.height = height;
    }
    Box(double size){//конструктор_3
        this.length = size;
        this.width = size;
        this.height = size;
    }
    
    void setDimens(double length, double width, double height) { //метод устанавливающий значения
        this.length = length;
        this.width = width;
        this.height = height;
    }

    double getVolume() { //метод на возвращение
        return length * width * height;
    }

    void showVolume() { //метод на вывод в консоль
        System.out.println(getVolume());

    }
}

