package Show;

import Person.Director;
import Person.Person;

public class MusicalShow extends Show {
    private final Person musicAuthor;
    String librettoText;


    public MusicalShow(String title, int duration, Director director, Person musicAuthor, String librettoText ) {
        super(title, duration, director);
        this.musicAuthor = musicAuthor;
        this.librettoText = librettoText;
    }

    public void setLibrettoText(String librettoText) {
        this.librettoText = librettoText;
    }


    public void printLibrettoText() {
        System.out.println(librettoText);
    }

    public Person getMusicAuthor() {
        return musicAuthor;
    }
}
