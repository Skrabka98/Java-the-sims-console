package Game;

public class Money {
    private double money = 1110;

    public Money(){
       this.money=money;
    }

    public double getMoney() {
        return this.money;
    }

    public void salary(double salary) {
        this.money += salary;
    }

    public void shopping(double price){
        if((this.money-=price)>=0){
            this.money-=price;
        }else{
            System.out.println("Nie masz wystarczającej ilości pieniędzy.");
        }

    }

}

