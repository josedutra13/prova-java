package br.com.confidencecambio.javabasico.imc.model;

import lombok.*;

@NoArgsConstructor
@Getter
@EqualsAndHashCode
@AllArgsConstructor
public class Imc {
    private double peso;
    private double altura;
}
