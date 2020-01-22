package Game;

public class Money {
    private double money = 100;

    public Money() {

    }

    public double getMoney() {
        return this.money;
    }

    public void salary(double salary) {
        this.money += salary;
    }

    public void shopping(double price) {
        if ((this.money - price) < 0) {
            System.out.println("Nie masz wystarczającej ilości pieniędzy.");

        } else {
            this.money -= price;

        }

    }

}

