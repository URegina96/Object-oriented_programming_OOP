package examples;

public class MyMath {

    public static final double PI = 3.14; //pi делаем статической, так как всегда одно и то же число
                                            // final что бы не могли изменить или присвоить значение к переменной, т.е. присвоить значение можно только один раз, в момент создания
    //как итог pi - константа, статическая переменная у которой есть конкретное значение, никогда не изменится, в таком случае можно его и публичным сделать
    ///такие переменные, как правило, указывают с заглавной буквы

    public static double length(double radius) {
        return 2 * PI * radius; //из статических методов мы не можем обращаться к переменным экземпляра, поэтому pi делаем статической
    }
    public static double area(double radius){
        return PI *radius*radius;
    }
    public static int sum(int... numbers){
        int sum=0;
        for (int namber:numbers){
            sum+=namber;
        }
        return sum;
    }




    //делаем методы статическими, и теперь они относятся к классу, а не к каким-то объектам(в этом классе объекты не указаны)
    public static int multiple(int a, int b) {
        return a * b;
    }

    public static double multiple(double a, double b) {
        return a * b;
    }

    public static int multiple(int a) {
        return a * a;
    }
}
