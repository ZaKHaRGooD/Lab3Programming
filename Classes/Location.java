package Classes;

public class Location {
    private String location;

    public Location(String location){
        this.location = location;
    }

    public void changeLocation(String newLocation){
        location = newLocation;
    }

    public boolean compareLocation(Hero hero, Transport transport) {
        return hero.getLocation().equals(transport.getLocation());
    }

    // исправить
    @Override
    public boolean equals(Object otherObject) {
        if (this == otherObject) return true;
        if (otherObject == null || getClass() != otherObject.getClass()) return false;
        Location l = (Location) otherObject;
        return location == l.location;
    }

    @Override
    public int hashCode() {
        return location.hashCode();
    }

    public String getLocation() {
        return location;
    }

    @Override
    public String toString() {
        return "Локация " + location;
    }

}
