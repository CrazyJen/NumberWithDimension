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
    void summing() {
        assertEquals(new Number(992.2789, "м"),
                num1.summing(num4));
        assertEquals(new Number(887.66035, "кг"),
                num2.summing(num5));
        assertEquals(new Number(9773.8358, "с"),
                num3.summing(num6));
    }

    @org.junit.jupiter.api.Test
    void substraction() {
        assertEquals(new Number(-987.2589, "м"),
                num1.substraction(num4));
        assertEquals(new Number(-262.30435, "кг"),
                num2.substraction(num5));
        assertEquals(new Number(9577.8358, "с"),
                num3.substraction(num6));
        assertEquals(new Number(987.2589, "м"),
                num4.substraction(num1));
        assertEquals(new Number(262.30435, "кг"),
                num5.substraction(num2));
        assertEquals(new Number(-9577.8358, "с"),
                num6.substraction(num3));
    }

    @org.junit.jupiter.api.Test
    void doubleMultiplication(){
        assertEquals(num1, num1.doubleMultiplication(1.0));
        assertEquals(new Number(1141.2747, "кг"),
                num2.doubleMultiplication(3.65));
        assertEquals(new Number(14862.08378, "с"),
                num3.doubleMultiplication(1.536));
        assertEquals(new Number(22141.1303, "м"),
                num4.doubleMultiplication(22.37));
        assertEquals(new Number(5205.31521, "кг"),
                num5.doubleMultiplication(9.053));
        assertEquals(new Number(1220.9722, "с"),
                num6.doubleMultiplication(12.4589));
    }

    @org.junit.jupiter.api.Test
    void doubleDivision() {
        assertEquals(num1, num1.doubleDivision(1.0));
        assertEquals(new Number(125.0712, "кг"),
                num2.doubleDivision(2.5));
        assertEquals(new Number(63.61579, "с"),
                num3.doubleDivision(152.098));
        
    }

    @org.junit.jupiter.api.Test
    void multiplication() {
    }

    @org.junit.jupiter.api.Test
    void division() {
    }

    @org.junit.jupiter.api.Test
    void comparsion() {
    }
}