package DZ.Lesson4;

public class Cat extends Animal {
    private static final int MAX_RUN_DISTANCE = 200;
    private static int totalCats = 0;
    private boolean satiety = false;

    public Cat(String name) {
        super(name);
        totalCats++;
    }

    public static int getTotalCats() {
        return totalCats;
    }

    public boolean isSatiety() {
        return satiety;
    }

    @Override
    public void run(int distance) {
        if (distance <= MAX_RUN_DISTANCE) {
            System.out.println(name + " пробежал " + distance + " м.");
        } else {
            System.out.println(name + " не может пробежать " + distance + " м. Ограничение: " + MAX_RUN_DISTANCE + " м.");
        }
    }

    @Override
    public void swim(int distance) {
        System.out.println(name + " не умеет плавать.");
    }

    public void eat(Bowl bowl, int foodAmount) {
        if (bowl.getFood() >= foodAmount) {
            bowl.decreaseFood(foodAmount);
            satiety = true;
            System.out.println(name + " покушал и стал сытым.");
        } else {
            System.out.println(name + " не хватило еды в миске. Осталось еды: " + bowl.getFood());
        }
    }
}

