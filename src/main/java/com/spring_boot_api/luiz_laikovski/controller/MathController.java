package com.spring_boot_api.luiz_laikovski.controller;

import com.spring_boot_api.luiz_laikovski.exception.UnsupportedMathOperationException;
import com.spring_boot_api.luiz_laikovski.service.MathService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import static com.spring_boot_api.luiz_laikovski.utilitys.ConvertNumber.isNumeric;


@RestController
@RequestMapping("/math")
public class MathController {

    MathService mathService;

    @RequestMapping("/sum/{numberOne}/{numberTwo}")
    public Double sum(
            @PathVariable("numberOne") String numberOne,
            @PathVariable("numberTwo") String numberTwo
    ) throws Exception {
        if (!isNumeric(numberOne) || !isNumeric(numberTwo)) throw  new UnsupportedMathOperationException("Insira um valor numerico");
        return mathService.sum(numberOne, numberTwo);
    }

    @RequestMapping("/subtract/{numberOne}/{numberTwo}")
    public Double subtract(
            @PathVariable("numberOne") String numberOne,
            @PathVariable("numberTwo") String numberTwo
    ) {
        if (!isNumeric(numberOne) || !isNumeric(numberTwo)) throw  new UnsupportedMathOperationException("Insira um valor numerico");
        return mathService.subtract(numberOne, numberTwo);
    }

    @RequestMapping("/multiplication/{numberOne}/{numberTwo}")
    public Double multiplication(
            @PathVariable("numberOne") String numberOne,
            @PathVariable("numberTwo") String numberTwo
    ) {
        if (!isNumeric(numberOne) || !isNumeric(numberTwo)) throw  new UnsupportedMathOperationException("Insira um valor numerico");
        return mathService.multiplication(numberOne, numberTwo);
    }

    @RequestMapping("/division/{numberOne}/{numberTwo}")
    public Double division(
            @PathVariable("numberOne") String numberOne,
            @PathVariable("numberTwo") String numberTwo
    ) {
        if (!isNumeric(numberOne) || !isNumeric(numberTwo)) throw  new UnsupportedMathOperationException("Insira um valor numerico");
        return mathService.division(numberOne, numberTwo);
    }

    @RequestMapping("/mean/{numberOne}/{numberTwo}")
    public Double mean(
            @PathVariable("numberOne") String numberOne,
            @PathVariable("numberTwo") String numberTwo
    ) throws Exception {
        if (!isNumeric(numberOne) || !isNumeric(numberTwo)) throw  new UnsupportedMathOperationException("Insira um valor numerico");
        return mathService.mean(numberOne, numberTwo);
    }

    @RequestMapping("/squareRoot/{number}")
    public Double squareRoot(
            @PathVariable("number") String number
    ) throws Exception {
        if (!isNumeric(number)) throw  new UnsupportedMathOperationException("Insira um valor numerico");
        System.out.println(squareRoot(number));
        return mathService.squareRoot(number);
    }
}