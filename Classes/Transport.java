package Classes;

import Util.ThingInterface;

public class Transport implements ThingInterface {
    private String name;
    private boolean moving;

    public Transport() {
        name = "Машина";
        moving = true;
        joinTheStory();
    }

    public Transport(String name) {
        this.name = name;
        moving = false;
        joinTheStory();
    }

    private void joinTheStory() {
        System.out.println("Транспорт '" + name + "' возник.");
    }

    public void move() {
        if (moving) {
            System.out.println("Транспорт '" + name + "' двигается");
        } else {
            System.out.println("Транспорт '" + name + "' не двигается");
        }
    }

    public boolean isMoving() {
        return moving;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Транспорт '" + name + "'";
    }


    // Don't forget to remove
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Transport) {
            return name.equals(((Transport) obj).name) && moving == ((Transport) obj).isMoving();
        }
        return false;
    }

    @Override
    public int hashCode() {
        if (moving) {
            return name.hashCode() + name.length();
        }
        return name.hashCode();
    }
}
