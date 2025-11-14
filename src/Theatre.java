import java.util.ArrayList;

public class Theatre {

    public static void main(String[] args) {

        Actor actor1 = new Actor(Gender.MALE, "Борисов", "Михаил", 180);
        Actor actor2 = new Actor(Gender.MALE, "Совельев", "Олег", 178);
        Actor actor3 = new Actor(Gender.FEMALE, "Миронова", "Александра", 175);
        Director director1 = new Director(Gender.MALE, "Попов", "Иван", 23);
        Director director2 = new Director(Gender.FEMALE, "Попова", "Дарья", 17);
        Person musicAuthor = new Person(Gender.MALE, "Шишкин", "Глеб");
        Person choreographer = new Person(Gender.FEMALE, "Немирова", "Лидия");

        Show show = new Show("Холодное сердце", 120, director1);
        Ballet ballet = new Ballet("Вихрь", 60, director2, musicAuthor, choreographer,
                "Текст балета");
        Opera opera = new Opera("Дикая роза", 90, director1, musicAuthor, "Текст оперы",
                15);

        show.addActor(actor1);
        show.addActor(actor2);
        ballet.addActor(actor2);
        ballet.addActor(actor3);
        opera.addActor(actor1);
        opera.addActor(actor3);

        System.out.println("Список актеров в шоу: " + show.title);
        show.getListOfActors();
        System.out.println("Список актеров в балете: " + ballet.title);
        ballet.getListOfActors();
        System.out.println("Список актеров в опере: " + opera.title);
        opera.getListOfActors();

        ballet.actorReplacement(actor1, "Совельев");

        System.out.println("Обновленный список актеров в балете: " + ballet.title);
        ballet.getListOfActors();

        System.out.println("Текс либретто в балете: " + ballet.title);
        ballet.getLibrettoText();
        System.out.println("Текс либретто в опере: " + opera.title);
        opera.getLibrettoText();

        System.out.println("Поехали!");
    }
}
