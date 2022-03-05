package Classes;

public class Location {
    private String nameLocation;
    private String namePlace;

    public Location(String nameLocation, String namePlace){
        this.nameLocation = nameLocation;
        this.namePlace = namePlace;
    }

    public void changeLocation(String newLocation){
        nameLocation = newLocation;
    }

    public void changeCity(String newLocation, String newPlace){
        nameLocation = newLocation;
        namePlace = newPlace;
    }


    public boolean compareLocation(Hero hero, Transport transport) {
        return hero.getNamePlace().equals(transport.getNamePlace());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Location l = (Location) o;
        return namePlace == l.namePlace;
    }

    @Override
    public int hashCode() {
        return nameLocation.hashCode();
    }

    @Override
    public String toString() {
        return "Локация " + nameLocation + " в месте " + namePlace;
    }

    public String getNameLocation() {
        return nameLocation;
    }

    public String getNamePlace() {
        return namePlace;
    }
}


