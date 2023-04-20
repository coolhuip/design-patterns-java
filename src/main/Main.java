/**
 * You have a right to think freely.
 */
import learn_interface_abstract.Cat;
import learn_interface_abstract.Monkey;

import static app.codge.utilities.Utils.print;
import static app.codge.utilities.Utils.newline;


public class Main {

    public static void main(String[] args) {

        print();

        Cat myCat = new Cat("brownie");
        myCat.printName();
        myCat.makeNoise();
        myCat.move();

        newline();

        Monkey cGeorge = new Monkey("curious george", false);
        Monkey tGeorge = new Monkey("tired george", true);
        cGeorge.printName();
        cGeorge.makeNoise();
        cGeorge.move();
        cGeorge.stateOfMind();
        newline();
        tGeorge.printName();
        tGeorge.makeNoise();
        tGeorge.move();
        tGeorge.stateOfMind();


    }

}