public class Main {
    public static void main(String[] args) {
        Box box1 = new Box();
        //box1.setDimens(10, 10, 10);
        Box box2 = new Box(20, 20, 20);
        //box1.setDimens(20, 20, 20);
        box1.showVolume();
        box2.showVolume();
//        Test test = new Test(); //экземпляр класса
//        System.out.println(test.square(20));


    }
}