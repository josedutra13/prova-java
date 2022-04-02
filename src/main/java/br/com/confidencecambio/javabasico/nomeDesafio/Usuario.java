package br.com.confidencecambio.javabasico.nomeDesafio;

import java.util.List;
import java.util.Locale;

abstract class Usuario {
    public void nomeDaClasse(){
        System.out.println("- Robo Class\n");
    }

    public boolean validaNome(String nome){
        if(nome == null || nome.isEmpty() || nome.endsWith(" ") || nome.startsWith(" ")){
            return false;
        }
        return true;
    }

    public void obtemPrimeiroNome(String nome){
        System.out.println("Primeiro nome: "+nome.split(" ")[0]);
    }

    public void obterUltimoNome(String nome){
        String ultimoNome = "";
        for (int i= 0; i<getSplit(nome).length; i++){
            if(i != 0){
                ultimoNome += getSplit(nome)[i] + " ";
            }
        }
        System.out.println("Último nome: "+ ultimoNome);
    }

    public void completamenteMaiusculo(String nome){
        System.out.println("Tudo maiúsculo: "+nome.toUpperCase(Locale.ROOT));
    }

    public void abreviacaoNome(String nome){
        String abreviacao = "";

        for (int i= 0; i<getSplit(nome).length; i++){
                if(i == 0 || i == getSplit(nome).length -1 || isComposicao(getSplit(nome)[i])){
                    abreviacao += getSplit(nome)[i] + " ";
                }
                else {
                    abreviacao += getSplit(nome)[i].charAt(0)+ ". ";
                }


        }
        System.out.println("Abreviação do nome: " +abreviacao +"\n");
    }

    private boolean isComposicao(String nome){
        String[] composicoes = {"de","da","do","das","dos"};
        for (String i : composicoes ){
            if(i.equals(nome)){
                return true;
            }
        }
        return false;
    }

    private String[] getSplit(String nome) {
        String[] split = nome.split(" ");
        return split;
    }
}
