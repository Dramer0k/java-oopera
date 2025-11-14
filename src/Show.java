import java.util.ArrayList;

public class Show {
    String title;
    int duration;
    Director director;
    ArrayList<Actor> listOfActors;

    public Show(String title, int duration, Director director) {
        this.title = title;
        this.duration = duration;
        this.director = director;
        listOfActors = new ArrayList<>();
    }

    public void getListOfActors() {
        if (listOfActors.isEmpty()) {
            System.out.println("Нет еще актеров в спектакле");
        } else {
            for (Actor actor : listOfActors) {
                System.out.println(actor.name + " " + actor.surname + "(" + actor.height + ")");
            }
        }
    }

    public void addActor(Actor actor) {
        if (listOfActors.isEmpty()) {
            listOfActors.add(actor);
        } else {
            boolean actorExists = false;
            for (Actor actor1 : listOfActors) {
                if (actor1.name.equals(actor.name) &&
                        actor1.surname.equals(actor.surname) &&
                        actor1.height == actor.height) {
                    actorExists = true;
                    break;
                }
            }
            if (!actorExists) {
                listOfActors.add(actor);
            }
        }
    }

    public void actorReplacement(Actor actor, String surname) {
        for (Actor actor1 : listOfActors) {
            if(actor1.surname.equals(surname)) {
                listOfActors.remove(actor1);
                listOfActors.add(actor);
                return;
            }
            System.out.println("Такого актера нет в спектакле");
        }
    }
}
