public class Main {
    public static void main(String[] args) {
        //для "в качестве параметров принимает другую коробку"
        Box current = new Box(10);
        Box another = new Box(current);
        current.showVolume();
        another.showVolume();

        //для "ссылочный тип_1"
//        Box current = new Box(10);
//        Box another = new Box(20);
//        current.compare(another);

        //для "ссылочный тип_2"
//        Box current = new Box(10);
//        Box another = new Box(20);
//        int result = current.compare(another);
//        System.out.println(result);
    }
}