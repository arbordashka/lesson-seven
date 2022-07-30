public class Cat {
    private int appetite;
    private String name;
    private boolean full;

    public boolean isFull() {
        return full;
    }
    public void setFull(boolean full) {
        this.full = full;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAppetite() {
        return appetite;
    }
    public void setAppetite(int appetite) {
        this.appetite = appetite;
    }

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.full = false;
    }

    public void eat(Plate p) {
        System.out.println("Кот "+getName()+" с аппетитом "+ getAppetite()+ " пытается поесть из тарелки:" );
        setFull(p.decreaseFood(appetite));
        System.out.println("Кот "+getName()+" сыт? " + isFull());
    }

    public void eat() { }
}
