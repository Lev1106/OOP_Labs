package practice2;

public class Main {
    public static void main(String[] args) {
    	// Problem 1
    	Student student = new Student("Lev", 31004);
    	System.out.println(student.getYearOfStudy());
    	student.incrementYearOfStudy();
    	System.out.println(student.getYearOfStudy());
    	
    	// Problem 2
        StarTriangle small = new StarTriangle(3);
        System.out.println(small.toString());
        
        // Problem 3
        Time t = new Time(23, 5, 6);
        System.out.println(t.toUniversal());
        System.out.println(t.toStandard());
        Time t2 = new Time(4, 24, 33);
        t.add(t2);
        System.out.println(t.toUniversal());
        System.out.println(t.toStandard());
    }
}
