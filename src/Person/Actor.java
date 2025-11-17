package Person;

import java.util.Objects;

public class Actor extends Person {
    private final int height;

    public Actor(Gender gender, String surname, String name, int height) {
        super(gender, surname, name);
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Actor actor = (Actor) o;
        return height == actor.height;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), height);
    }


    @Override
    public String toString() {
        return super.toString() + "(" + height + ")";
    }


}
