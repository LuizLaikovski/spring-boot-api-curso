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

    @RequestMapping("/sum/{a}/{b}")
    public Double sum(
            @PathVariable("a") String a,
            @PathVariable("b") String b
    ) throws Exception {
        if (!isNumeric(a) || !isNumeric(b)) throw  new UnsupportedMathOperationException("Insira um valor numerico");
        return convertToDouble(a) + convertToDouble(b);
    }


}
