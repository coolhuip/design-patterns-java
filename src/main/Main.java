/**
 * You have a right to think freely.
 */
import static app.codge.utilities.Utils.print;

import learn_interface_abstract.Animal;
import learn_interface_abstract.Cat;
import learn_interface_abstract.Monkey;

import designpatterns.factorymethod.BeefBurgerRestaurant;
import designpatterns.factorymethod.VeggieBurgerRestaurant;
import designpatterns.factorymethod.Restaurant;
import designpatterns.factorymethod.Burger;
import designpatterns.factorymethod.BeefBurger;
import designpatterns.factorymethod.VeggieBurger;


public class Main {

    public static void main(String[] args) {

        print("===================================================");
        print();

        Cat myCat = new Cat("brownie");
        myCat.printName();
        myCat.makeNoise();
        myCat.move();

        print();

        Monkey cGeorge = new Monkey("curious george");
        Monkey tGeorge = new Monkey("tired george", true);
        cGeorge.printName();
        cGeorge.makeNoise();
        cGeorge.move();
        cGeorge.stateOfMind();
        print();
        tGeorge.printName();
        tGeorge.makeNoise();
        tGeorge.move();
        tGeorge.stateOfMind();

        Restaurant beefResto = new BeefBurgerRestaurant();
        Burger beefBurger = beefResto.orderBurger();

        Restaurant veggieResto = new VeggieBurgerRestaurant();
        Burger veggieBurger = veggieResto.orderBurger();

        Monkey abom = new Monkey("abom");
        abom.printName();
        print(abom.type);


        print();
        print("===================================================");
    }

}
