public class Box {
    double length;
    double width;
    double height;

    double getVolume(){ //метод нга возвращение

        return length*width*height;
//       double volume = length*width*height;
//       return volume;
    }
    double showVolume(){ //метод на вывод в консоль
        double volume = length*width*height;
        System.out.println(volume);
        return volume;
    }
}
