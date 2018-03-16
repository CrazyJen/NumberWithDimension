package Number;

public final class Number implements Comparable<Number> {

    //Поля
    private final double value;

    private final String dimension;

    private final double delta = 1e-5;

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
    public Number add(final Number other) {
        if (!this.dimension.equals(other.dimension))
            throw new IllegalArgumentException("Dimensions don't match");
        return new Number(this.value + other.value, this.dimension);
    }

    //Вычитание
    public Number subtract(final Number other) {
        if (!this.dimension.equals(other.dimension))
            throw new IllegalArgumentException("Dimensions don't match");
        return new Number(this.value - other.value, this.dimension);
    }

    //Умножение на вещественное число
    public Number multiply(double factor) {
        return new Number(this.value * factor, this.dimension);
    }

    //Деление на вещественное число
    public Number divide(double divisor) {
        return new Number(this.value / divisor, this.dimension);
    }

    //Умножение на число с той же размерностью
    public Number multiply(final Number other) {
        if (!this.dimension.equals(other.dimension))
            throw new IllegalArgumentException("Dimensions don't match");
        return new Number(this.value * other.value, this.dimension);
    }

    //Деление на число с той же размерностью
    public Number divide(final Number other) {
        if (!this.dimension.equals(other.dimension))
            throw new IllegalArgumentException("Dimensions don't match");
        return new Number(this.value / other.value, this.dimension);
    }

    //Сравнение чисел с одинаковой размерностью
    public int compareTo(Number other) {
        if (!this.dimension.equals(other.dimension))
            throw new IllegalArgumentException("Dimensions don't match");
        if (this.equals(other)) return 0;
        else if (this.value < other.value) return -1;
        else return 1;
    }

    @Override
    public String toString() {
        return this.value + " " + this.dimension;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Number number = (Number) o;
        return Math.abs(this.value - number.value) <= delta &&
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