package Show;

import Person.Director;
import Person.Person;

public class Ballet extends MusicalShow {
    private final Person choreographer;

    public Ballet(String title, int duration, Director director, Person musicAuthor,
                  Person choreographer, String librettoText) {
        super(title, duration, director, musicAuthor, librettoText);
        this.choreographer = choreographer;
    }

    public Person getChoreographer() {
        return choreographer;
    }
}
