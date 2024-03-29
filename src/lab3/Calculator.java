package lab3;

public class Calculator {
    public double addDoubles(double number1, double number2 ){
        return number1+number2;
    }
    public float subtractFloats(float number1, float number2 ){
        return number1 - number2;
    }
    public int multiplyInt(int number1, int number2 ){
        return number1*number2;
    }
    public String parseString(String str, int index){
        return str.substring(index);
    }
}
