package Number;

public final class Number {

    //Поля
    private final double value;

    private final String dimension;

    //Конструктор
    public Number(final double value, final String dimension) {
        this.value = value;
        this.dimension = dimension;
    }

    //Геттеры
    public double getValue() {
        return value;
    }

    public String getDimension() {
        return dimension;
    }

    //Сложение
    public Number summing(final Number other) {
        if (this.dimension.equals(other.dimension))
            throw new IllegalArgumentException("Dimensions don't match");
        return new Number(this.value + other.value, dimension);
    }

    //Вычитание
    public Number substraction(final Number other) {
        if (this.dimension.equals(other.dimension))
            throw new IllegalArgumentException("Dimensions don't match");
        return new Number(this.value - other.value, dimension);
    }

    //Умножение на число
    public Number multiplication(double factor) {
        return new Number(this.value * factor, this.dimension);
    }

    //Деление на число
    public Number division(double divisor) {
        return new Number(this.value / divisor, this.dimension);
    }
}