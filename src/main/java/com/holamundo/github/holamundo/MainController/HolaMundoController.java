package com.holamundo.github.holamundo.MainController;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HolaMundoController {

    @GetMapping("/hola")
    public String holaMundo() {
        return "Hola Mundo";
    }

    @GetMapping("/olax2")
    public String holaMund2() {
        return "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat." +
                " Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum";
    }

    @GetMapping("/olax3")
    public String holaMund3() {
        return "HAKARI nunca obtuvo la técnica maldita inversa pero la cantidad infinita de energía maldita que desbordaba su cuerpo causaba que este por reflejo realizara la técnica maldita inversa para evitar cualquier daño, en otras palabras durante los 4 minutos y 11 segundos, HAKARI es inmortal";

    }







}
