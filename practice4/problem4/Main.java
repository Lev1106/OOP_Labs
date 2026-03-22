package practice4.problem4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        list.add(new Student("Lev", 3.65));
        list.add(new Student("GOAT", 4.0));
        list.add(new Student("John", 2.67));
        Collections.sort(list);
        System.out.println(list);
        Collections.sort(list, new NameComparator());
        System.out.println(list);
    }
}
