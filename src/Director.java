public class Director extends Person {
    int numberOfShows;

    public Director(Gender gender, String surname, String name, int numberOfShows) {
        super(gender, surname, name);
        this.numberOfShows = numberOfShows;
    }

    public void getNameDirector(Director director) {
        System.out.println(director.name + " " + director.surname);
    }
}
