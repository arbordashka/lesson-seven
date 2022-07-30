
public class Main {

    public static void main(String[] args) {

        Cat cat1 = new Cat("Барсик", 10);
        Plate plate1 = new Plate(100);
        plate1.info();
        cat1.eat(plate1);
        plate1.info();

        Cat[] cats = new Cat[3];
        cats[0] = new Cat("Томас", 50);
        cats[1] = new Cat("Бегемот", 45);
        cats[2] = new Cat("Филипп Маркович", 35);
        for (int i=0; i<3; i++){
            cats[i].eat(plate1);
        }
        plate1.info();
        plate1.addFood(100);
        plate1.info();
    }
}