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

    private void joinTheStory() {
        System.out.println("Персонаж '" + name + "' присоединился к истории.");
    }

    @Override
    public String getName() {
        return name;
    }
}
