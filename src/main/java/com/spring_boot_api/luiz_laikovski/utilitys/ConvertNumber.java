package com.spring_boot_api.luiz_laikovski.utilitys;


import com.spring_boot_api.luiz_laikovski.exception.UnsupportedMathOperationException;

public class ConvertNumber {

    private ConvertNumber() {}

    /*
    * Converte os numeros com virgula em .
    *  Parametro: strNumber;
    *  retorna 5,0 -> 5.0
    * */
    public static String replaceNumber(String strNumber) {
        if (strNumber == null || strNumber.isEmpty()) throw new UnsupportedMathOperationException("Insira um valor numerico");
        return strNumber.replace(',', '.');
    }
}
