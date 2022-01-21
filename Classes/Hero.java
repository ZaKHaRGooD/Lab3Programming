package Classes;

public class Hero extends Human {
    protected boolean isRunOutOfHouse;

    public Hero(String name, int dnacode) {
        super(name, dnacode);
        joinToStory();
    }

    public void joinToStory() {
        System.out.println(this.toString());
    }

    public void kick(Hero hero) {
        for (Feelings feeling : feelings) {
            if (feeling == Feelings.RESENTMENT) {
                System.out.println("Герой " + this.getName() + " не смог уйти от расплаты, поэтому пнул Героя " + hero.getName());
                delFeeling(Feelings.RESENTMENT);
                break;
            } else {
                System.out.println("Герой " + this.getName() + " смог уйти от расплаты, поэтому Герой " + hero.getName() + " остался без пинка");
                break;
            }
        }
    }

    public void goByTransport(Transport transport) {
        if (transport.location == this.location) {
            System.out.println("Герой " + this.getName() + " едет на траспорте " + transport.getName());
        } else {
            System.out.println("Герой " + this.getName() + " не едет на траспорте " + transport.getName());
        }
    }

    public void runOutOfHouse(Transport transport) {
        if ((location.compareLocation(this, transport)) && (transport.isNoisy)) {
            System.out.println(this.getName() + " услышали шум транспорта " + transport.getName() + " выбежал(и) из дома(ов)");
        } else {
            System.out.println(this.getName() + " ничего странного не услышал(и)");
        }
    }

    public void doMove(Transport transport) {
        for (Feelings feeling : feelings) {
            if (feeling == Feelings.FEAR) {
                System.out.println("Герой(и) " + this.getName() + " успугались незнакомого транспорта " + transport.getName() + ", поэтому в страхе попятелись");
                delFeeling(Feelings.FEAR);
                break;
            }
            if (feeling == Feelings.GLADNESS) {
                System.out.println("Герой(и) " + this.getName() + " обрадовались, увидев транспорт " + transport.getName() + ", поэтому пошли его встречать");
                delFeeling(Feelings.GLADNESS);
                break;
            }
            if (feeling == Feelings.SURPRISE) {
                System.out.println("Герой(и) " + this.getName() + " удивились, увидев транспорт " + transport.getName() + ", потому остались стоять ошарашенными некоторое время");
                delFeeling(Feelings.GLADNESS);
                break;
            }
        }
    }

    public void addFeeling(Feelings feel) {
        for (int i = 0; i < feelings.length; i++) {
            if (feelings[i] == null) {
                feelings[i] = feel;
                System.out.println("Герой(и) " + this.getName() + " начал(и) чувствовать " + feel.toString());
                break;
            }
        }
    }

    // переделать вывод, чувствовать Чуство как масло маслянное
    public void delFeeling(Feelings feel) {
        for (int i = 0; i < feelings.length; i++) {
            if (feelings[i] == feel) {
                feelings[i] = null;
                System.out.println("Герой(и) " + this.getName() + " перестал(и) чувствовать " + feel.toString());
                break;
            }
        }
    }

    public void setMove(Transport transport) {
        isRunOutOfHouse = transport.isNoisy;
    }

    @Override
    public void changeLocation(String newLocation) {
        location.changeLocation(newLocation);
        System.out.println("Герой " + this.getName() + " поменял свою локацию на " + location.getLocation());
    }

    public String getLocation() {
        return location.getLocation();
    }

    @Override
    public void setLocation(Location location) {
        this.location = location;
        System.out.println("Герой(и) " + this.getName() + " находится в " + location.toString());
    }

    @Override
    public boolean equals(Object otherObject) {
        if (this == otherObject) {
            return true;
        }
        if (otherObject == null || getClass() != otherObject.getClass()) {
            return false;
        }
        Hero hero = (Hero) otherObject;
        return (this.dnacode == hero.dnacode && this.feelings == hero.feelings && this.location == hero.location && this.getName() == hero.getName() && this.isRunOutOfHouse == hero.isRunOutOfHouse);
    }

    @Override
    public int hashCode() {
        return dnacode;
    }

    @Override
    public String toString() {
        return "Герой(и) " + this.getName() + " присоединился к истории";
    }
}

