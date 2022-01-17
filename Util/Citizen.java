package Util;

import Classes.Transport;

public abstract class Citizen implements CitizenInterface {
    public abstract void leaveHouse();

    public abstract void seeSomething(Transport transport, EmotionEnum emotion);
}
