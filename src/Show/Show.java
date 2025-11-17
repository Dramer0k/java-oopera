package Show;

import Person.Actor;
import Person.Director;

import java.util.Iterator;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Objects;

public class Show {
    protected String title;
    protected int duration;
    protected Director director;
    protected ArrayList<Actor> listOfActors;
    protected Scanner scanner = new Scanner(System.in);

    public Show(String title, int duration, Director director) {
        this.title = title;
        this.duration = duration;
        this.director = director;
        listOfActors = new ArrayList<>();
    }

    public String getTitle() {
        return title;
    }

    public int getDuration() {
        return duration;
    }

    public void printDirector() {
        System.out.println(director);
    }

    public void getListOfActors() {
        if (listOfActors.isEmpty()) {
            System.out.println("Нет еще актеров в спектакле");
        } else {
            for (Actor actor : listOfActors) {
                System.out.println(actor);

            }
        }
    }

    public void addActor(Actor actor) {
        if (listOfActors.isEmpty()) {
            listOfActors.add(actor);
        } else {
            boolean actorExists = false;
            for (Actor actor1 : listOfActors) {
                if (actor1.equals(actor)) {
                    actorExists = true;
                    break;
                }
            }
            if (!actorExists) {
                listOfActors.add(actor);
            }
        }
    }

    public void replaceActor(Actor actor, String surname) {
        int actorCount = 0;
        for (Actor actor1 : listOfActors) {
            if (Objects.equals(actor1.getSurname(), surname)) {
                actorCount++;
            }
        }

        switch (actorCount) {
            case 0:
                System.out.println("Таких актеров нет");
                break;
            case 1:
                for (Actor actor1 : listOfActors) {
                    if (Objects.equals(actor1.getSurname(), surname)) {
                        listOfActors.remove(actor1);
                        listOfActors.add(actor);
                    }
                }
                break;
            default:
                System.out.println("Есть несколько актеров с такой фамилией. Заменить всех? - Да/Нет");
                String input = scanner.nextLine();
                switch (input) {
                    case "Да":
                        Iterator<Actor> actors = listOfActors.iterator();
                        while(actors.hasNext()) {
                            Actor nextActor = actors.next();
                            if (Objects.equals(nextActor.getSurname(), surname)) {
                                actors.remove();
                            }
                        }
                        listOfActors.add(actor);
                        break;
                    case "Нет":
                        System.out.println("Заменить актера не получилось");

                }
        }
    }
}
