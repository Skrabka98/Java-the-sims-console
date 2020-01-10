
 package Shop.Food;

 import Game.Money;
 import Statistic.Hungry;

 import java.util.Scanner;


 public class Supermarket {
  private int chose;
  Chips chips;
  Cola cola;
  Money money;
  Hungry hungry;
  Pizza pizza;




  Supermarket(){
   this.chose=chose;
   this.chips = new Chips();
   this.cola = new Cola();
   this.pizza = new Pizza();
   this.hungry = new Hungry();
   this.money = new Money();

  }

  public void choseProduct(){
   System.out.println("1.chips\n2.cola\n3.pizza");
   Scanner sc=new Scanner(System.in);
   this.chose=sc.nextInt();

   switch (chose){
    case 1 :
     {
      hungry.addPoint(chips.setNumberOfPoints());
      money.shopping(chips.setPrice());
      System.out.println("Grr");
      break;
     }
    case 2:
    {
     hungry.addPoint(cola.setNumberOfPoints());
     money.shopping(cola.setPrice());
     System.out.println("Mlask mlask");
     break;
    }
    case 3: {
     hungry.addPoint(pizza.setNumberOfPoints());
     money.shopping(pizza.setPrice());
     System.out.println("Mnam mniam");
     break;
    }
    }
   }


}
