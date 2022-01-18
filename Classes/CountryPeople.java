package Classes;

import Util.Citizen;
import Util.EmotionEnum;

public class CountryPeople extends Citizen {
    private boolean hearSoundOfEngine;
    private String name;
    private final EmotionEnum TYPE = EmotionEnum.FEAR;

    public CountryPeople() {
        name = "Жители Нееловки";
        hearSoundOfEngine = true;
    }

    public CountryPeople(String name) {
        this.name = name;
        hearSoundOfEngine = true;
    }

    public CountryPeople(String name, boolean hearSoundOfEngine) {
        this.name = name;
        this.hearSoundOfEngine = hearSoundOfEngine;
    }

    @Override
    public void leaveHouse() {
        if (hearSoundOfEngine) {
            System.out.println("'" + name + "'" + ", услышав звук двигателя, выскочили из домов.");
        } else {
            System.out.println("'" + name + "'" + ", не услышав звук двигателя, остались в своих домах.");
        }
    }

    @Override
    public void seeSomething(Transport transport, EmotionEnum TYPE) {
        System.out.println("'" + name + "'" + " увидели " + transport.toString() + ".");
        switch (TYPE) {
            case FEAR:
                System.out.println("'" + name + "'" + " испытали " + EmotionEnum.FEAR + ", поэтому они в страхе попятелись.");
                break;
            case GLADNESS:
                System.out.println("'" + name + "'" + " испытали " + EmotionEnum.GLADNESS + ", поэтому они с радостью пошли встречать " + transport.toString() + ".");
                break;
            case SURPRISE:
                System.out.println("'" + name + "'" + " испытали " + EmotionEnum.SURPRISE + ", поэтому они были в шоке от увиденного.");
                break;
        }
    }

    @Override
    public EmotionEnum getEmotion() {
        return TYPE;
    }

    public boolean getHearSoundOfEngine() {
        return hearSoundOfEngine;
    }

    @Override
    public String getName() {
        return name;
    }

    // name, TYPE, hearSoundOfEngine
    @Override
    public boolean equals(Object otherObject) {
        if (this == otherObject) return true;
        if (otherObject == null) return false;
        if (!(otherObject instanceof CountryPeople)) return false;
        CountryPeople other = (CountryPeople) otherObject;
        return (this.name.equals(other.name) && (this.hearSoundOfEngine == other.hearSoundOfEngine) && (this.TYPE == other.TYPE));  // дописать
    }

    // name, TYPE, hearSoundOfEngine
    @Override
    public int hashCode() {
        int result = name == null ? 0 : name.hashCode();
        if (getHearSoundOfEngine()) {
            result = (31 * result) + name.length();
            result = (31 * result) + TYPE.hashCode();
        } else {
            return result;
        }
        return result;
    }

    @Override
    public String toString() {
        return name;
    }
}
