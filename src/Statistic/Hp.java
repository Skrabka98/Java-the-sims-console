package Statistic;

public class Hp extends Statistic {

    public Hp(int numberOfPoint) {
        super(numberOfPoint);
    }

    public Hp() {
        super(0);
    }

    public void die(){
        if(numberOfPoint<=0){
            System.exit(0);
        }
    }
}
