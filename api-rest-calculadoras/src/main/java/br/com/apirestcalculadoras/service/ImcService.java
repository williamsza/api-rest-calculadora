package br.com.apirestcalculadoras.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.apirestcalculadoras.model.Imc;
import br.com.apirestcalculadoras.repository.ImcRepository;

@Service
public class ImcService {

    @Autowired
    private ImcRepository imcRepository;

    public void registrarImc(Imc imc){
        imcRepository.save(imc);

    }

    public List<Imc> listaTodos() {
        return imcRepository.findAll();
    } 
    
}
