package com.spring_boot_api.luiz_laikovski.service;

import org.springframework.stereotype.Service;

import static com.spring_boot_api.luiz_laikovski.utilitys.ConvertNumber.convertToDouble;

public class MathService {
    public static Double sum(String numberOne, String numberTwo) {
        return convertToDouble(numberOne) + convertToDouble(numberTwo);
    }
    public static Double subtract(String numberOne, String numberTwo) {
        return convertToDouble(numberOne) + convertToDouble(numberTwo);
    }
    public static Double multiplication(String numberOne, String numberTwo) {
        return convertToDouble(numberOne) * convertToDouble(numberTwo);
    }
    public static Double division(String numberOne, String numberTwo) {
        return convertToDouble(numberOne) / convertToDouble(numberTwo);
    }

    public static Double mean(String numberOne, String numberTwo) {
        return (convertToDouble(numberOne) + convertToDouble(numberTwo)) / 2;
    }

    public static Double squareRoot(String number) {
        return Math.sqrt(convertToDouble(number));
    }
}
