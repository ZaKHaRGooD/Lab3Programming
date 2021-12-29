package Classes;

import Util.ThingInterface;

public class Village implements ThingInterface {
    private String name;

    public Village() {
        name = "Нееловка";
        joinTheStory();
    }

    private void joinTheStory() {
        System.out.println("Деревня '" + name + "' появилась на пути.");
    }

    @Override
    public String getName() {
        return name;
    }
}
