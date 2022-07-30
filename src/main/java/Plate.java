public class Plate {
    private int food;

    public int getFood() {
        return food;
    }
    public void setFood(int food) {
        this.food = food;
    }


    public Plate(int food) {
        this.food = food;
    }

    public boolean decreaseFood(int n) {
        if ((food - n)<0)
        {
            System.out.println("В миске недостаточно еды");
            return false;
        }
        else {food -= n;
            System.out.println("Кот успешно поел!");
            return true;
        }
    }


    public void info() {
        System.out.println("В тарелке еды: " + food);
    }
    public void addFood(int food){
        System.out.println("В тарелку добавлено "+food+" еды");
        setFood(getFood()+food);

    }
}