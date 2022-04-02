package br.com.confidencecambio.javabasico.service;


import br.com.confidencecambio.javabasico.imc.service.ImcService;
import org.junit.Before;

public class ImcServiceTest {

    private ImcService service;

    @Before
    public void init(){
         service= new ImcService();
    }

}