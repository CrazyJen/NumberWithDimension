package Number;

import java.util.Objects;

public final class Number {

    //Поля
    private final double value;

    private final String dimension;

    //Конструктор
    public Number(final double value, final String dimension) {
        this.value = value;
        this.dimension = dimension;
    }

    //Строковый конструктор
    public Number(final String string) {
        String[] input = string.split(" ");
        this.value = Double.valueOf(input[0]);
        this.dimension = input[1];
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
        if (!this.dimension.equals(other.dimension))
            throw new IllegalArgumentException("Dimensions don't match");
        return new Number(this.value + other.value, this.dimension);
    }

    //Вычитание
    public Number substraction(final Number other) {
        if (!this.dimension.equals(other.dimension))
            throw new IllegalArgumentException("Dimensions don't match");
        return new Number(this.value - other.value, this.dimension);
    }

    //Умножение на вещественное число
    public Number doubleMultiplication(double factor) {
        return new Number(this.value * factor, this.dimension);
    }

    //Деление на вещественное число
    public Number doubleDivision(double divisor) {
        return new Number(this.value / divisor, this.dimension);
    }

    //Умножение на число с той же размерностью
    public Number multiplication(final Number other) {
        if (!this.dimension.equals(other.dimension))
            throw new IllegalArgumentException("Dimensions don't match");
        return new Number(this.value * other.value, this.dimension);
    }

    //Деление на число с той же размерностью
    public Number division(final Number other) {
        if (!this.dimension.equals(other.dimension))
            throw new IllegalArgumentException("Dimensions don't match");
        return new Number(this.value / other.value, this.dimension);
    }

    //Сравнение чисел с одинаково
    public

    @Override
    public String toString() {
        return this.value + " " + this.dimension;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Number number = (Number) o;
        return Math.abs(this.value - number.value) <= 1e-5 &&
                this.dimension.equals(number.dimension);
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        temp = Double.doubleToLongBits(value);
        result = (int) (temp ^ (temp >>> 32));
        result = 31 * result + (dimension != null ? dimension.hashCode() : 0);
        return result;
    }
}