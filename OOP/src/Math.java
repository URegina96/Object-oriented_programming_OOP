public class Math { //перегрузка методов
    //условие: параметры () должны отличаться либо типом, либо кол-во
    //данные методы относятся к объекту Main
    int multiple(int a, int b) {
        return a * b;
    }
    double multiple(double a, double b){
        return a * b;
    }
    int multiple(int a) {
        return a * a;
    }


//    //если добавить static, то метод относится к данному классу, а не к объекту
//    static int multiple(int a, int b) {
//        return a * b;
//    }
}


