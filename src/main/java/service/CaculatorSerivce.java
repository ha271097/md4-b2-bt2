package service;

import java.util.Date;

public class CaculatorSerivce {
    public double result(String vl1, String vl2, String operator){
        double a = Double.parseDouble(vl1);
        double b = Double.parseDouble(vl2);
        double c = 0.0;
        switch (operator){
            case "+":
                c = a + b;
                break;
            case "-":
                c = a - b;
                break;
            case "*":
                c = a * b;
                break;
            case "/":
                c = a / b;
                break;
        }
        return c;
    }
}
