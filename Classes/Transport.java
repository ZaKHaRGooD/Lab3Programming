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
            System.out.println("Транспорт '" + name + "' двигается.");
        } else {
            System.out.println("Транспорт '" + name + "' не двигается. Спустя время наши друщья поехали.");
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
    public boolean equals(Object otherObject) {
        if (this == otherObject) return true;
        if (otherObject == null) return false;
        if (getClass() != otherObject.getClass()) return false;
        Transport other = (Transport) otherObject;
        return ((this.moving == other.moving) && (this.name.equals(other.name)));
    }

    @Override
    public int hashCode() {
        int result = name == null ? 0 : name.hashCode();
        if (isMoving()) {
            result = (31 * result) + name.length();
            return result;
        } else {
            return result;
        }
    }

    @Override
    public String toString() {
        return "Транспорт '" + name + "'";
    }
}
