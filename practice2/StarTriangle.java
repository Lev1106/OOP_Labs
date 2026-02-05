package practice2;

public class StarTriangle {
    private int width;
    
    public StarTriangle(int width) {
    	this.width = width;
    }
    
    public int getWidth() {
    	return width;
    }
    public String toString() {
		String s = "", t = "";
    	for (int i = 1; i <= width; i++) {
			t += "[*]";
    		s += t + "\n";
    	}
    	return s;
    }
}
