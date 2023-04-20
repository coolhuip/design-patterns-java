package learn_interface_abstract;

import static app.codge.utilities.Utils.print;

public class Cat extends Animal implements AnimalActionable{

    public Cat(String name) {
         this.type = "cat";
         this.numLegs = 4;
         this.name = name;
    }

    @Override
    public void makeNoise() {
        print("Meow");
    }

    @Override
    public void move() {
        print(name + " gracefully struts by.");
    }

}
