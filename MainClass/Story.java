package MainClass;

import Classes.*;

public class Story {
    public static void main(String[] args) {
        Person fatCop = new Person();
        Person2 vintik = new Person2();
        fatCop.kickHuman(vintik);
        Transport car = new Transport();
        fatCop.chillTrip();
        Village village = new Village();
        fatCop.goOutFromWood();
        fatCop.comeToVillage(village, vintik);
    }
}
