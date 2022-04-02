package br.com.confidencecambio.javabasico.nomeDesafio;

import lombok.*;

import java.util.Locale;

@NoArgsConstructor
@Getter
@EqualsAndHashCode
@AllArgsConstructor
public class Robo extends Usuario{
    private String nome;

    @Override
    public void nomeDaClasse() {
        System.out.println("- Robo Class\n");
    }

    @Override
    public boolean validaNome(String nome) {
        return super.validaNome(nome);
    }

    @Override
    public void obtemPrimeiroNome(String nome) {
        super.obtemPrimeiroNome(nome);
    }

    @Override
    public void obterUltimoNome(String nome) {
        super.obterUltimoNome(nome);
    }

    @Override
    public void completamenteMaiusculo(String nome) {
        super.completamenteMaiusculo(nome);
    }

    @Override
    public void abreviacaoNome(String nome) {
        super.abreviacaoNome(nome);
    }



}
