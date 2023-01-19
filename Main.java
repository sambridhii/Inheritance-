import model.Children;
import model.Hobby;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Hobby h1 = new Hobby("reading", "LongTerm");
        Hobby h2 = new Hobby("dancing", "ShortTerm");
        Hobby h3 = new Hobby("playing", "LongTerm");
        Hobby h4 = new Hobby("swmming", "LongTerm");
        Hobby h5 = new Hobby("acting", "ShortTerm");
        Hobby h6 = new Hobby("writing", "ShortTerm");

        ArrayList<Hobby> hobby1 = new ArrayList<>();
        hobby1.add(h1);
        hobby1.add(h2);
        hobby1.add(h3);

        ArrayList<Hobby> hobby2 = new ArrayList<>();
        hobby2.add(h4);
        hobby2.add(h5);
        hobby2.add(h6);

        Children c1 = new Children("Samridhi", "A", 18, hobby1);
        Children c2 = new Children("aayusha", "B", 17, hobby2);

        System.out.println(c1.getFullName());
        c1.getHobby();


    }
}
