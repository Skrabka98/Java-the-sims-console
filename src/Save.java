import Game.Bath;
import Game.Money;
import Game.Time;
import Statistic.Hp;
import Statistic.Hungry;
import Statistic.Stench;
import Statistic.Tired;

import java.io.*;

public class Save {
    private Hungry hungry;
    private Hp hp;
    private Stench stench;
    private Tired tired;
    private Time time;
    private Money money;

    private Save(){
        this.hungry = new Hungry();
        this.hp = new Hp();
        this.money= new Money();
        this.stench = new Stench();
        this.time = new Time();
        this.tired = new Tired();
    }

    public void write(){
        try{
            FileOutputStream fileOutputStream = new FileOutputStream(new File("save.txt"));
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(hungry);
            objectOutputStream.writeObject(hp);
            objectOutputStream.writeObject(money);
            objectOutputStream.writeObject(stench);
            objectOutputStream.writeObject(time);
            objectOutputStream.writeObject(tired);
             objectOutputStream.close();
             fileOutputStream.close();

        }catch (FileNotFoundException e ){
            System.out.println("Nie znaleziono pliku");
        }catch (IOException e){
            System.out.println("Błąd  czegoś tam pytać Bartka");
        }catch (ClassNotFoundException e){
            e.printStackTrace();
        }
    }

    public void read(){
        try{
            FileOutputStream fileOutputStream = new FileOutputStream(new File("save.txt"));
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

            objectOutputStream.


            objectOutputStream.close();
            fileOutputStream.close();

        }catch (FileNotFoundException e ){
            System.out.println("Nie znaleziono pliku");
        }catch (IOException e){
            System.out.println("Błąd  czegoś tam pytać Bartka");
        }catch (ClassNotFoundException e){
            e.printStackTrace();
        }
    }





}
