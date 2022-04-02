package br.com.confidencecambio.javabasico.controller;

import br.com.confidencecambio.javabasico.imc.model.Imc;
import br.com.confidencecambio.javabasico.service.ImcService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/imc")
public class ImcController {

    @Autowired
    private ImcService service;

    @GetMapping
    public ResponseEntity<String> resultadoImc(@RequestBody Imc imc) {
        double response = service.retornaValorValido(imc.getPeso(), imc.getAltura());
        return ResponseEntity.ok().body("IMC: "+ String.valueOf(response));
    }
}
