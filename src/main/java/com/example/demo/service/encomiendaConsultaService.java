package com.example.demo.service;
import com.example.demo.entity.*;

import com.example.demo.repository.encomiendaRepository;
import com.example.demo.repository.rutaRepository;
import com.example.demo.repository.tarifaEncomiendaRepository;
import com.example.demo.repository.tipoEncomiendaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;



import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/encomiendas")
@CrossOrigin
public class encomiendaConsultaService {
    @Autowired
    encomiendaRepository encomiendaRepository;

    @Autowired
    rutaRepository rutaRepository;

    @Autowired
    tarifaEncomiendaRepository tarifaEncomiendaRepository;

    @Autowired
    tipoEncomiendaRepository tipoEncomiendaRepository;

    @GetMapping(path = "/consulta")
    private ArrayList encomiendas(){
        ArrayList algo = new ArrayList<>();

        List<encomienda> encomienda = encomiendaRepository.findAll();
        List<ruta> ruta = rutaRepository.findAll();
        List<tarifaEncomienda> tarifaEncomienda = tarifaEncomiendaRepository.findAll();
        List<tipoEncomienda> tipoEncomienda = tipoEncomiendaRepository.findAll();
        /*algo.add(encomienda);
        algo.add(ruta);*/
        algo.add(tarifaEncomienda);
        /*algo.add(tipoEncomienda);*/
        return algo;
    }
}
