package br.com.apirestcalculadoras.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.apirestcalculadoras.model.Imc;
import br.com.apirestcalculadoras.service.ImcService;

@RestController
@RequestMapping({ "/api/v1/imc" })
public class ImcController {

    @Autowired
    private ImcService imcService;
    
    @PostMapping
    public ResponseEntity<Imc> registrarImc(@RequestBody Imc registroImc) {
        imcService.registrarImc(registroImc);
        return ResponseEntity.badRequest().body(registroImc);

    }

    @GetMapping
    public ResponseEntity<List<Imc>> buscarListaImc(){
        return ResponseEntity.ok().body(imcService.listaTodos());

    }
}
