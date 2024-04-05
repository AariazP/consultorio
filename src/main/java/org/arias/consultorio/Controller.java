package org.arias.consultorio;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/api/registro")
public class Controller {

    @GetMapping("/ciudades")
    public List<String> holaMundo() {
        return List.of(
                "Armenia",
                "Filandia",
                "Calarca",
                "Circasia",
                "Montenegro",
                "Quimbaya",
                "Salento",
                "Buenavista",
                "Cordoba",
                "La Tebaida",
                "Pijao",
                "Genova");
    }

}
