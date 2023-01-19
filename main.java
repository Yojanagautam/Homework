import model.children;
import model.Hobby;

import java.util.ArrayList;

public class main{
    public static void main(String[] args) {
        Hobby h1 = new Hobby("reading book", "LongTerm");
        Hobby h2 = new Hobby("watching movie", "ShortTerm");
        Hobby h3 = new Hobby("singing", "short term");
        Hobby h4 = new Hobby("writing", "LongTerm");

        ArrayList<Hobby> hobby1 = new ArrayList<>();
        hobby1.add(h1);
        hobby1.add(h2);
        hobby1.add(h3);

        ArrayList<Hobby> hobby2 = new ArrayList<>();
        hobby2.add(h4);

        children c1 = new children("yojana", "h", 17, hobby1);
        children c2 = new children("aarya", "y", 15, hobby2);

        System.out.println(c1.getFullName());
        c1.getHobby();


    }
}