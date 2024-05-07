import javax.xml.transform.Source;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {

    public static void main(String[] args) {

        Pattern p = Pattern.compile(".m");
        Matcher m = p.matcher("am");
        Boolean b = m.matches();

        // 2nd Method

        Boolean b1= Pattern.matches(".x","xx");

        // 3rd Method:

        Boolean b2 = Pattern.compile(".m").matcher("am").matches();

         System.out.println(b2);

       //   System.out.println(Pattern.matches("[amn]","c"));

       // System.out.println(Pattern.matches("[^amn]","c"));

       // System.out.println(Pattern.matches("[a-d[m-p]]","p")); // from a to d and then from m -p it will consider the element.

       // System.out.println(Pattern.matches("[a-z&&[def]]","d")); //  In this  d/e/f are must parameter

        //System.out.println(Pattern.matches("[a-z&&[^def]]","d"));


        // Regex Quantifier :

        //System.out.println(Pattern.matches("[amn]?","a"));

       // System.out.println(Pattern.matches("[amn]?","nnn"));




    }

}
