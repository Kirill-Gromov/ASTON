package DZ.Lesson4;

public class Dog extends Animal {
    private static final int MAX_RUN_DISTANCE = 500;
    private static final int MAX_SWIM_DISTANCE = 10;
    private static int totalDogs = 0;

    public Dog(String name) {
        super(name);
        totalDogs++;
    }

    public static int getTotalDogs() {
        return totalDogs;
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
        if (distance <= MAX_SWIM_DISTANCE) {
            System.out.println(name + " поплыл " + distance + " м.");
        } else {
            System.out.println(name + " не может проплыть " + distance + " м. Ограничение: " + MAX_SWIM_DISTANCE + " м.");
        }
    }
}

