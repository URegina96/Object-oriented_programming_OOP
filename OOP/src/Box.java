public class Box {
    double length;
    double width;
    double height;

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

