import java.util.ArrayList;

public class MusicalShow extends Show {
    Person musicAuthor;
    String librettoText;


    public MusicalShow(String title, int duration, Director director, Person musicAuthor, String librettoText ) {
        super(title, duration, director);
        this.musicAuthor = musicAuthor;
        this.librettoText = librettoText;
    }

    public void setLibrettoText(String librettoText) {
        this.librettoText = librettoText;
    }


    public void getLibrettoText() {
        System.out.println(librettoText);
    }
}
