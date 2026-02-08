package lab1.problem5;


import java.util.Vector;

import static lab1.problem5.Gender.*;

public class DragonLaunch {
    Vector<Person> kidnapped;
    public DragonLaunch() {
        this.kidnapped = new Vector<>();
    }
    public void kidnap(Person p) {
        if (!kidnapped.isEmpty() && kidnapped.lastElement().getGender() == BOY && p.getGender() == GIRL) {
            kidnapped.remove(kidnapped.size() - 1);
            return;
        }
        kidnapped.add(p);
    }
    public boolean willDragonEatOrNot() {
        return !kidnapped.isEmpty();
    }
}
