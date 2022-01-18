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

    public void joinTheStory() {
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

    public void chillTrip(Transport transport) {
        System.out.println("Остаток пути наши друзья проехали на " + transport.toString() + " без приключений.");
    }

    public void goOutFromWood() {
        System.out.println("Не прошло и 10 минут, как наши друзья выбрались из леса.");
    }

    public void comeToVillage(Village village, Person2 person, Transport transport) {
        System.out.println("Человек по имени '" + name + "' и человек по имени '" +
                person.getName() + "' подъехали к деревне '" + village.getName() + "' на " + transport.toString() + ".");
    }

    public boolean isReckoning() {
        return wasAbleGetAwayFromReckoning;
    }

    @Override
    public String getName() {
        return name;
    }

    // name, wasAbleGetAwayFromReckoning
    @Override
    public boolean equals(Object otherObject) {
        if (this == otherObject) return true;
        if (otherObject == null) return false;
        if (getClass() != otherObject.getClass()) return false;
        Person other = (Person) otherObject;
        return ((this.wasAbleGetAwayFromReckoning == other.wasAbleGetAwayFromReckoning) && (this.name.equals(other.name)));
    }

    // name, wasAbleGetAwayFromReckoning
    @Override
    public int hashCode() {
        int result = name == null ? 0 : name.hashCode();
        if (isReckoning()) {
            result = (31 * result) + name.length();
            return result;
        } else {
            return result;
        }
    }

    @Override
    public String toString() {
        return "Персонаж '" + name + "'";
    }
}
