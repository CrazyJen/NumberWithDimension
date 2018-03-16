package Number;

import static org.junit.jupiter.api.Assertions.*;

class Test {

    private final Number num1 = new Number(2.51, "м");
    private final Number num2 = new Number(312.678, "кг");
    private final Number num3 = new Number(9675.8358, "с");
    private final Number num4 = new Number("989.7689 м");
    private final Number num5 = new Number("574.98235 кг");
    private final Number num6 = new Number("98 с");

    @org.junit.jupiter.api.Test
    void getValue() {
        assertEquals(2.51, num1.getValue());
        assertEquals(312.678, num2.getValue());
        assertEquals(9675.8358, num3.getValue());
        assertEquals(989.7689, num4.getValue());
        assertEquals(574.98235, num5.getValue());
        assertEquals(98, num6.getValue());
    }

    @org.junit.jupiter.api.Test
    void getDimension() {
        assertEquals("м", num1.getDimension());
        assertEquals("кг", num2.getDimension());
        assertEquals("с", num3.getDimension());
        assertEquals("м", num4.getDimension());
        assertEquals("кг", num5.getDimension());
        assertEquals("с", num6.getDimension());
    }

    @org.junit.jupiter.api.Test
    void add() {
        assertEquals(new Number(992.2789, "м"),
                num1.add(num4));
        assertEquals(new Number(887.66035, "кг"),
                num2.add(num5));
        assertEquals(new Number(9773.8358, "с"),
                num3.add(num6));
    }

    @org.junit.jupiter.api.Test
    void subtract() {
        assertEquals(new Number(-987.2589, "м"),
                num1.subtract(num4));
        assertEquals(new Number(-262.30435, "кг"),
                num2.subtract(num5));
        assertEquals(new Number(9577.8358, "с"),
                num3.subtract(num6));
        assertEquals(new Number(987.2589, "м"),
                num4.subtract(num1));
        assertEquals(new Number(262.30435, "кг"),
                num5.subtract(num2));
        assertEquals(new Number(-9577.8358, "с"),
                num6.subtract(num3));
    }

    @org.junit.jupiter.api.Test
    void doubleMultiply() {
        assertEquals(num1, num1.multiply(1.0));
        assertEquals(new Number(1141.2747, "кг"),
                num2.multiply(3.65));
        assertEquals(new Number(14862.08378, "с"),
                num3.multiply(1.536));
        assertEquals(new Number(22141.1303, "м"),
                num4.multiply(22.37));
        assertEquals(new Number(5205.31521, "кг"),
                num5.multiply(9.053));
        assertEquals(new Number(1220.9722, "с"),
                num6.multiply(12.4589));
    }

    @org.junit.jupiter.api.Test
    void doubleDivide() {
        assertEquals(num1, num1.divide(1.0));
        assertEquals(new Number(125.0712, "кг"),
                num2.divide(2.5));
        assertEquals(new Number(63.61579, "с"),
                num3.divide(152.098));
        assertEquals(new Number("9.897689 м"),
                num4.divide(100.0));
        assertEquals(new Number("57498.235 кг"),
                num5.divide(0.01));
        assertEquals(new Number("19.6 с"),
                num6.divide(5.0));
    }

    @org.junit.jupiter.api.Test
    void multiply() {
        assertEquals(new Number(2484.31994, "м"),
                num1.multiply(num4));
        assertEquals(new Number(179784.33123, "кг"),
                num2.multiply(num5));
        assertEquals(new Number(948231.9084, "с"),
                num3.multiply(num6));
    }

    @org.junit.jupiter.api.Test
    void divide() {
        assertEquals(new Number(0.00253, "м"),
                num1.divide(num4));
        assertEquals(new Number(0.5438, "кг"),
                num2.divide(num5));
        assertEquals(new Number(98.73301, "с"),
                num3.divide(num6));
    }

    @org.junit.jupiter.api.Test
    void compareTo() {
        assertEquals(0,
                num1.compareTo(new Number(2.51, "м")));
        assertEquals(-1, num1.compareTo(num4));
        assertEquals(-1, num2.compareTo(num5));
        assertEquals(1, num3.compareTo(num6));
    }
}