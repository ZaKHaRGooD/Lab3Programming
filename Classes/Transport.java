package Classes;

import Util.HaveLocation;
import Util.ThingInterface;

public class Transport implements HaveLocation, ThingInterface {
    private String name;
    protected Location location;
    protected boolean isNoisy;

    public Transport(String name, boolean isNoisy) {
        this.name = name;
        this.isNoisy = isNoisy;
    }

    @Override
    public void changeLocation(String newLocation) {
        location.changeLocation(newLocation);
        System.out.println("Транспорт " + this.getName() + " поменял свою локацию на " + location.toString());
    }

    public String getLocation() {
        return location.getLocation();
    }

    @Override
    public void setLocation(Location location) {
        this.location = location;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object otherObject) {
        if (this == otherObject) {
            return true;
        }
        if (otherObject == null || getClass() != otherObject.getClass()) {
            return false;
        }
        Transport transport = (Transport) otherObject;
        return (this.location == transport.location && this.name == transport.name && this.isNoisy && transport.isNoisy);
    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }

    @Override
    public String toString() {
        return "Транспорт " + name;
    }
}
