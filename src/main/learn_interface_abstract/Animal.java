package learn_interface_abstract;

import static app.codge.utilities.Utils.print;

abstract public class Animal {
    public String type;
    public String name;
    public int numLegs;

    public void printName() {
        print("My name is: " + name);
    }
}
