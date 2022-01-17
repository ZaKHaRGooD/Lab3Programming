package MainClass;

import Classes.*;
import Util.EmotionEnum;

public class Story {
    public static void main(String[] args) {
        Person fatCop = new Person();

        Person2 vintik = new Person2();

        fatCop.kickHuman(vintik);
        Transport car = new Transport();
        car.move();
        fatCop.chillTrip(car);
        Village village = new Village();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
        }

        fatCop.goOutFromWood();
        fatCop.comeToVillage(village, vintik, car);
        CountryPeople countryPeople = new CountryPeople();
        countryPeople.leaveHouse();
        countryPeople.seeSomething(car, EmotionEnum.FEAR);
    }
}
