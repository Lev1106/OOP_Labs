package lab1.problem5;

import java.util.Vector;

import static lab1.problem5.Gender.*;

public class DragonLaunch {
    Vector<Person> kidnapped;
    public void kidnap(Person p) {
        if (!willDragonEatOrNot()) return;
        if (kidnapped.lastElement().getGender() == BOY && p.getGender() == GIRL) return;
        kidnapped.add(p);
    }
    public boolean willDragonEatOrNot() {
        return !kidnapped.isEmpty();
    }
}
