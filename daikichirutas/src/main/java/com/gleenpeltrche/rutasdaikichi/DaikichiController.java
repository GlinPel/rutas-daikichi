package com.gleenpeltrche.rutasdaikichi;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/daikichi")
public class DaikichiController {
    @RequestMapping("")
    public String daikichi() {
            return "¡Hola, mundo!";
    }
    @RequestMapping("/today")
    public String today() {
            return "¡Hoy encontrarás suerte en todos tus esfuerzos!";
    }
    @RequestMapping("/tomorrow")
    public String tomorrow() {
            return "¡Mañana, una oportunidad se presentará, así que estate abierto a nuevas ideas!";
    }
	
}
