package br.com.confidencecambio.javabasico.imc.service;

import org.springframework.stereotype.Component;


@Component
public class ImcService {

    public double retornaValorValido( double peso,  double altura) {
        double resultadoIMC = peso/Math.pow(altura,2);

        return (Math.round(resultadoIMC*100.0)/100.0);
    }
}
