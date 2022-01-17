package Util;

public enum EmotionEnum {
    FEAR("Страх"), SURPRISE("Удивление"), GLADNESS("Счастье");
    private String emotion;

    EmotionEnum(String emotion) {
        this.emotion = emotion;
    }

    @Override
    public String toString() {
        return "Эмоция '" + emotion + "'";
    }
}
