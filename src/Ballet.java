import java.util.ArrayList;

public class Ballet extends MusicalShow {
    Person choreographer;

    public Ballet(String title, int duration, Director director, Person musicAuthor,
            Person choreographer, String librettoText) {
        super(title, duration, director, musicAuthor, librettoText);
        this.choreographer = choreographer;
    }
}
