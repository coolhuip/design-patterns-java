package learn_interface_abstract;

import static app.codge.utilities.Utils.print;
import static app.codge.utilities.Utils.newline;

public abstract class Animal {
    public String type;
    public String name;
    public int numLegs;

    public void printName() {
        print("My name is: " + name);
    }
}
