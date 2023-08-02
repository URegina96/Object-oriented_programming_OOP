public class Main {
    public static void main(String[] args) {
        Box box1 = new Box();
        box1.height = 10;
        box1.length = 10;
        box1.width = 10;

        Box box2 = new Box();
        box2.height = 20;
        box2.length = 20;
        box2.width = 20;

//        Box box3 = box2 ;
//        box3.width = 0;
        double volume = box1.getVolume();
        System.out.println(volume);

        box2.showVolume();

    }
}