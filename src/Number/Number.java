package Number;

public final class Number {

    //Поля
    private final float value;

    private final String dimension;

    //Конструктор
    public Number (final float value, final String dimension) {
        this.value = value;
        this.dimension = dimension;
    }

    //Геттеры
    public float getValue() {
        return value;
    }

    public String getDimension() {
        return dimension;
    }

    //Сложение
    public Number sum (final Number other) {
        if (this.dimension != other.dimension) throw new IllegalArgumentException("Dimensions don't match");
    }
}