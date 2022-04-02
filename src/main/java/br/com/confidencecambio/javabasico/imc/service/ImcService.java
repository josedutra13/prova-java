package br.com.confidencecambio.javabasico.service;

import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class ImcService {

    public double retornaValorValido( double peso,  double altura) {
        double resultadoIMC = peso/Math.pow(altura,2);

        return (Math.round(resultadoIMC*100.0)/100.0);
    }
}
