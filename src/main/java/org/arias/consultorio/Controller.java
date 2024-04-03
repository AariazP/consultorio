package org.arias.consultorio;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
@RequestMapping("/api/hola")
public class Controller {

    @GetMapping("/mundo")
    public String holaMundo() {
        return "Hola Mundo";
    }

}
