package Classes;

import Util.PersonInterface;

public class Person2 implements PersonInterface {
    private String name;

    public Person2() {
        name = "Винтик";
        joinTheStory();
    }

    public Person2(String name) {
        this.name = name;
        joinTheStory();
    }

    public void joinTheStory() {
        System.out.println("Персонаж '" + name + "' присоединился к истории.");
    }

    @Override
    public String getName() {
        return name;
    }

    // name
    @Override
    public boolean equals(Object otherObject) {
        if (this == otherObject) return true;
        if (otherObject == null) return false;
        if (!(otherObject instanceof Person2)) return false;
        Person2 other = (Person2) otherObject;
        return (this.name.equals(other.name));
    }

    // name
    @Override
    public int hashCode() {
        return name == null ? 0 : name.hashCode();
    }

    @Override
    public String toString() {
        return "Персонаж '" + name + "'";
    }
}
