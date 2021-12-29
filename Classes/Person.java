package Classes;

import Util.PersonInterface;

public class Person implements PersonInterface {
    private String name;
    private boolean wasAbleGetAwayFromReckoning;

    public Person() {
        name = "Толстяк полицейский";
        wasAbleGetAwayFromReckoning = false;
        joinTheStory();
    }

    public Person(String name) {
        this.name = name;
        wasAbleGetAwayFromReckoning = false;
        joinTheStory();
    }

    public Person(String name, boolean wasAbleGetAwayFromReckoning) {
        this.name = name;
        this.wasAbleGetAwayFromReckoning = wasAbleGetAwayFromReckoning;
        joinTheStory();
    }

    private void joinTheStory() {
        System.out.println("Персонаж '" + name + "' присоединился к истории.");
    }

    public void kickHuman(Person2 person) {
        if (!wasAbleGetAwayFromReckoning) {
            System.out.println("Человек по имени '" + name + "' не смог уйти от расплаты, поэтому изловчился и пнул " +
                    "человека по имени '" + person.getName() + "'.");
        } else {
            System.out.println("Человек по имени '" + name + "' смог уйти от расплаты, поэтому человека по имени " +
                    "'" + person.getName() + "' он решил не пинать.");
        }
    }

    public void chillTrip() {
        System.out.println("Остаток пути наши друзья проехали без приключений.");
    }

    public void goOutFromWood() {
        System.out.println("Не прошло и 10 минут, как наши друзья выбрались из леса.");
    }

    public void comeToVillage(Village village, Person2 person) {
        System.out.println("Человек по имени '" + name + "' и человек по имени '" +
                person.getName() + "' подъехали к деревне '" + village.getName() + "'.");
    }

    @Override
    public String getName() {
        return name;
    }
}
