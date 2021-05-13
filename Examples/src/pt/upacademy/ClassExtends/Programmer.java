package pt.upacademy.ClassExtends;

abstract class Writer {
	public String val = "";
	
    public static String write() {
        System.out.println("Writing...");
        return "Writing";
    }
}

class Author extends Writer {
    public static String write() {
        System.out.println("Writing book");
        return "Writing book";
    }
}

public class Programmer extends Writer {
	
    public static String write() {
        System.out.println("Writing code");
        return "Writing code";
    }

    public static void main(String[] args) {
         Writer w = new Programmer();
         w.val = write();
         
    }
}