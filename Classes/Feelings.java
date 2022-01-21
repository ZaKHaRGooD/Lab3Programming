package Classes;

public enum Feelings {
    FEAR("Страх"),
    SURPRISE("Удивление"),
    GLADNESS("Счастье"),
    RESENTMENT("Негодование");


    private String feeling;

    Feelings(String feeling) {
        this.feeling = feeling;
    }

    @Override
    public String toString() {
        return "Чувство " + feeling;
    }
}
