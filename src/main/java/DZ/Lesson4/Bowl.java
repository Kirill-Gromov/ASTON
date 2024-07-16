package DZ.Lesson4;

public class Bowl {
    private int food;

    public Bowl(int initialFood) {
        if (initialFood < 0) {
            throw new IllegalArgumentException("Еды не может быть меньше 0");
        }
        this.food = initialFood;
    }

    public int getFood() {
        return food;
    }

    public void addFood(int amount) {
        if (amount < 0) {
            throw new IllegalArgumentException("Нельзя добавлять отрицательное количество еды");
        }
        this.food += amount;
        System.out.println("В миску добавлено " + amount + " еды. Сейчас в миске: " + food);
    }

    public void decreaseFood(int amount) {
        if (amount < 0) {
            throw new IllegalArgumentException("Нельзя уменьшать еду на отрицательное количество");
        }
        if (food >= amount) {
            food -= amount;
        } else {
            System.out.println("Недостаточно еды в миске для уменьшения на " + amount);
        }
    }
}


