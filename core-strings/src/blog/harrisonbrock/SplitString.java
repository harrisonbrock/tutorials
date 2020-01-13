package blog.harrisonbrock;

public class SplitString {

    public static void main(String[] args) {

        // Split String By Comma
        String[] colors = "red,yellow,green,blue".split(",");
        for (String color : colors) System.out.println(color);

        // Split String By Space
        String[] names = "john bob harry".split(" ");
        for (String name : names) System.out.println(name);

        // Split String By Period
        String[] ipAddress = "127.0.0.1".split("\\.");
        for (String number : ipAddress) System.out.println(number);

        // Split String By Space Using Limits (return array with two elements)
        String[] lines = "The Sky Is Blue".split(" ", 2);
        for(String line : lines) System.out.println(line);

        // Split String By Space Using Limits (return array with three elements)
         lines = "The Sky Is Blue".split(" ", 3);
        for(String line : lines) System.out.println(line);
    }
}
