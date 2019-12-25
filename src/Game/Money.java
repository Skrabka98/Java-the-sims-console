package Game;

public class Money {
    private double money = 2000;

    public Money(){
       this.money=money;
    }

    public double getMoney() {
        return this.money;
    }

    public void Salary(double salary) {
        this.money += salary;
    }

    public void Shopping(double price){
        this.money-=price;
    }

}
/*
Nrarazie umieściąłm tutaj bo nie wiem gdzie a zawsze można ja wrzucic gdzie indziej
 */
