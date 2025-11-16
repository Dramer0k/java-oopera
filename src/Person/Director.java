package Person;

public class Director extends Person {
    private final int numberOfShows;

    public Director(Gender gender, String surname, String name, int numberOfShows) {
        super(gender, surname, name);
        this.numberOfShows = numberOfShows;
    }

    public int getNumberOfShows() {
        return numberOfShows;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
