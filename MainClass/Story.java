package MainClass;

import Classes.*;

public class Story {
    public static void main(String[] args) {
        Hero fatCop = new Hero("Толстяк полицейский", 1);
        Hero vintik = new Hero("Винтик", 2);
        Location forest = new Location("лес");
        fatCop.setLocation(forest);
        vintik.setLocation(forest);
        Transport car = new Transport("машина", true);
        fatCop.addFeeling(Feelings.RESENTMENT);
        fatCop.kick(vintik);
        car.setLocation(forest);
        fatCop.goByTransport(car);
        vintik.goByTransport(car);
        Location village = new Location("деревня Нееловка");
        Hero countryPeople = new Hero("Жители Нееловки", 3);
        countryPeople.setLocation(village);
        fatCop.changeLocation("деревня Нееловка");
        vintik.changeLocation("деревня Нееловка");
        car.changeLocation("деревня Нееловка");
        countryPeople.runOutOfHouse(car);
        countryPeople.addFeeling(Feelings.FEAR);
        countryPeople.doMove(car);
    }
}
