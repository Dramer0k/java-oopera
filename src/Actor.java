import java.util.Objects;

public class Actor extends Person {
    int height;

    public Actor(Gender gender, String surname, String name, int height) {
        super(gender, surname, name);
        this.height = height;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Actor actor = (Actor) o;
        return height == actor.height &&
                Objects.equals(surname, actor.surname) &&
                Objects.equals(name, actor.name);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(super.name);
    }
}
