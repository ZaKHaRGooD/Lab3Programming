package Classes;

import Util.HaveLocation;

public abstract class Human implements HaveLocation {
    private String name;
    final protected int dnacode;
    protected Feelings[] feelings = new Feelings[5];
    protected Location location;


    public Human(String name, int dnacode) {
        this.dnacode = dnacode;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    abstract public void changeLocation(String newLocation);
    abstract public void setLocation(Location location);
}
