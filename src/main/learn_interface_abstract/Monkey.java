package learn_interface_abstract;

import static app.codge.utilities.Utils.print;


public class Monkey extends Animal implements AnimalActionable{
    boolean tired;

    public Monkey(String name) {
        this.type = "Monkey";
        this.numLegs = 2;
        this.name = name;
    }

    public Monkey(String name, boolean tired) {
        this.type = "Monkey";
        this.numLegs = 2;
        this.name = name;
        this.tired = tired;
    }

    @Override
    public void makeNoise() {
        print("ooh ooh ah ah");
    }

    @Override
    public void move() {
        if (tired) print(name + " would not put the bong down and get a job.");
        else print(name + " hops ahead from tree branch to tree branch.");
    }

    public void stateOfMind() {
        if (tired) print("I have grown tired of hunting and being hunted. I'm tryna eat bananas and chill.");
        else print("Wow, so those are humans! What are those metal devices with triggers on them for?");
    }

}
