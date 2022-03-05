package MainClass;

import Classes.*;

public class Story {
    public static void main(String[] args) {
        Location location = new Location("поляна", "лес");
        Hero fatCop = new Hero("полицейский", 90);
        Hero vintik = new Hero("Винтик", 70);
        Hero friendsVintik = new Hero("друзья Винтика", 70);
        fatCop.setLocation(location);
        vintik.setLocation(location);
        friendsVintik.setLocation(location);
        fatCop.addFeeling(Feelings.RESENTMENT);
        fatCop.kick(vintik);

        fatCop.setLocation(location);
        Transport car = new Transport("машина", true);
        car.setLocation(location);
        vintik.goByTransport(car);
        friendsVintik.goByTransport(car);

        Location exitForest = new Location("выезд", "выезд с леса");
        car.setLocation(exitForest);
        vintik.goByTransport(car);
        friendsVintik.goByTransport(car);

        Location village = new Location("деревня", "Нееловка");
        car.setLocation(village);
        vintik.goByTransport(car);
        friendsVintik.goByTransport(car);
        Location houseVillage = new Location("дома деревни", "Нееловка");
        Hero countryPeople = new Hero("жители Нееловки", 70);
        countryPeople.setLocation(houseVillage);
        countryPeople.runOutOfHouse(car);
        countryPeople.addFeeling(Feelings.FEAR);
        countryPeople.doMove(car);
    }
}
