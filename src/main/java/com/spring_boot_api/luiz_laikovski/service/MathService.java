package com.spring_boot_api.luiz_laikovski.service;

import org.springframework.stereotype.Service;

import static com.spring_boot_api.luiz_laikovski.utilitys.ConvertNumber.convertToDouble;

@Service
public class MathService {
    public Double sum(String numberOne, String numberTwo) {
        return convertToDouble(numberOne) + convertToDouble(numberTwo);
    }
    public Double subtract(String numberOne, String numberTwo) {
        return convertToDouble(numberOne) + convertToDouble(numberTwo);
    }
    public Double multiplication(String numberOne, String numberTwo) {
        return convertToDouble(numberOne) * convertToDouble(numberTwo);
    }
    public Double division(String numberOne, String numberTwo) {
        return convertToDouble(numberOne) / convertToDouble(numberTwo);
    }

    public Double mean(String numberOne, String numberTwo) {
        return (convertToDouble(numberOne) + convertToDouble(numberTwo)) / 2;
    }

    public Double squareRoot(String number) {
        return Math.sqrt(convertToDouble(number));
    }
}
