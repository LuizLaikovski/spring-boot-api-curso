package com.spring_boot_api.luiz_laikovski.controller;

import com.spring_boot_api.luiz_laikovski.exception.UnsupportedMathOperationException;
import com.spring_boot_api.luiz_laikovski.utilitys.ConvertNumber;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/math")
public class MathController {
    private MathController mathController;

    public Boolean isNumeric(String number) {
        String numberReplaced = ConvertNumber.replaceNumber(number);
        return numberReplaced.matches("[-+]?[0-9]*\\.?[0-9]+");
    }

    private Double convertToDouble(String strNumber) {
        String numberReplaced = ConvertNumber.replaceNumber(strNumber);
        return Double.parseDouble(numberReplaced);
    }

    @RequestMapping("/sum/{numberOne}/{numberTwo}")
    public Double sum(
            @PathVariable("numberOne") String numberOne,
            @PathVariable("numberTwo") String numberTwo
    ) throws Exception {
        if (!isNumeric(numberOne) || !isNumeric(numberTwo)) throw  new UnsupportedMathOperationException("Insira um valor numerico");
        return convertToDouble(numberOne) + convertToDouble(numberTwo);
    }

    @RequestMapping("/subtract/{numberOne}/{numberTwo}")
    public Double subtract(
            @PathVariable("numberOne") String numberOne,
            @PathVariable("numberTwo") String numberTwo
    ) {
        if (!isNumeric(numberOne) || !isNumeric(numberTwo)) throw  new UnsupportedMathOperationException("Insira um valor numerico");
        return convertToDouble(numberOne) - convertToDouble(numberTwo);
    }

    @RequestMapping("/multiplication/{numberOne}/{numberTwo}")
    public Double multiplication(
            @PathVariable("numberOne") String numberOne,
            @PathVariable("numberTwo") String numberTwo
    ) {
        if (!isNumeric(numberOne) || !isNumeric(numberTwo)) throw  new UnsupportedMathOperationException("Insira um valor numerico");
        return convertToDouble(numberOne) * convertToDouble(numberTwo);
    }

    @RequestMapping("/division/{numberOne}/{numberTwo}")
    public Double division(
            @PathVariable("numberOne") String numberOne,
            @PathVariable("numberTwo") String numberTwo
    ) {
        if (!isNumeric(numberOne) || !isNumeric(numberTwo)) throw  new UnsupportedMathOperationException("Insira um valor numerico");
        return convertToDouble(numberOne) / convertToDouble(numberTwo);
    }

    @RequestMapping("/mean/{numberOne}/{numberTwo}")
    public Double mean(
            @PathVariable("numberOne") String numberOne,
            @PathVariable("numberTwo") String numberTwo
    ) throws Exception {
        if (!isNumeric(numberOne) || !isNumeric(numberTwo)) throw  new UnsupportedMathOperationException("Insira um valor numerico");
        return (convertToDouble(numberOne) + convertToDouble(numberTwo)) / 2;
    }

    @RequestMapping("/squareRoot/{number}")
    public Double squareRoot(
            @PathVariable("number") String number
    ) throws Exception {
        if (!isNumeric(number)) throw  new UnsupportedMathOperationException("Insira um valor numerico");
        return Math.sqrt(convertToDouble(number));
    }
}
