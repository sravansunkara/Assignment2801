import java.util.*;

public class ReverseString {
    public static void main(String[] args)
    {
        String text = "Hello, I'm Sravan!";
        String str[] = text.split(" ");
        Collections.reverse(Arrays.asList(str));
        System.out.println(String.join(" ", str));
    }
}