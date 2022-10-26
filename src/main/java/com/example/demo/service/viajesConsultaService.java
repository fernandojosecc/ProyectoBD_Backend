package com.example.demo.service;
import com.example.demo.entity.*;

import com.example.demo.repository.busRepository;
import com.example.demo.repository.rutaRepository;
import com.example.demo.repository.tipoViajeRepository;
import com.example.demo.repository.tiempoViajeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;



import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/viajes")
@CrossOrigin
public class viajesConsultaService {
    @Autowired
    busRepository busRepository;

    @Autowired
    rutaRepository rutaRepository;

    @Autowired
    tipoViajeRepository tipoViajeRepository;

    @Autowired
    tiempoViajeRepository tiempoViajeRepository;

    @GetMapping(path = "/consulta")
    private ArrayList buses(){
        ArrayList algo = new ArrayList<>();

        List<bus> bus = busRepository.findAll();
        List<ruta> ruta = rutaRepository.findAll();
        List<tipoViaje> tipoViaje = tipoViajeRepository.findAll();
        List<tiempoViaje> tiempoViaje = tiempoViajeRepository.findAll();
        algo.add(bus);
        algo.add(ruta);
        algo.add(tipoViaje);
        algo.add(tiempoViaje);
        return algo;
    }
}
