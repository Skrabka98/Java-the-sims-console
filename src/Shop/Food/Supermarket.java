
 package Shop.Food;

 import Game.Money;
 import Shop.Buy;
 import Statistic.Hungry;

 import java.util.Scanner;


 public class Supermarket {
  private int chose;
  private Chips chips;
  private Cola cola;
  private Money money;
  private Hungry hungry;
  private Pizza pizza;





  public Supermarket(){
   this.chose=chose;
   this.chips = new Chips();
   this.cola = new Cola();
   this.pizza = new Pizza();
   this.hungry = new Hungry();
   this.money = new Money();

  }

  public void choseProduct(){
   System.out.println("1.chips\n2.cola\n3.pizza\n4.Powrót ");
   Scanner sc=new Scanner(System.in);
   this.chose=sc.nextInt();


   switch (chose){
    case 1 :
     {
      hungry.addPoint(chips.setNumberOfPoints());
      money.shopping(chips.setPrice());
      System.out.println("Grr");
      choseProduct();
      break;
     }
    case 2:
    {
     hungry.addPoint(cola.setNumberOfPoints());
     money.shopping(cola.setPrice());
     System.out.println("Mlask mlask");
     choseProduct();
     break;
    }
    case 3: {
     hungry.addPoint(pizza.setNumberOfPoints());
     money.shopping(pizza.setPrice());
     System.out.println("Mnam mniam");
     choseProduct();
     break;
    }
    case 4:
    {
     Buy buy = new Buy();
     buy.buying();
     break;
    }
    default:{
     System.out.println("Błędny przycisk!");
    }
    }
   }


}
