package br.com.confidencecambio.javabasico.imc.model;

import lombok.*;

@NoArgsConstructor
@Data
@Getter
@Setter
@EqualsAndHashCode
@AllArgsConstructor
public class Imc {
    private double peso;
    private double altura;
}
