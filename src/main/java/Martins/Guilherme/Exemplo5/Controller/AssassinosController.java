package Martins.Guilherme.Exemplo5.Controller;

import Martins.Guilherme.Exemplo5.model.Assassinos;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class AssassinosController {

    @GetMapping("/assassinos")
    public ArrayList<Assassinos> getAssassino() {

        Assassinos assassino1 = new Assassinos();
        assassino1.setName("John Wick");
        assassino1.setAge(39);
        assassino1.setAbiliity(93.5);

        Assassinos assassino2 = new Assassinos();
        assassino2.setName("Laurence Fishburn/Morpheu");
        assassino2.setAge(43);
        assassino2.setAbiliity(83.2);

        Assassinos assassino3 = new Assassinos();
        assassino3.setName("Thomas Anderson");
        assassino3.setAge(33);
        assassino3.setAbiliity(99.7);

        ArrayList<Assassinos> assassino = new ArrayList<>();
        assassino.add(assassino1);
        assassino.add(assassino2);
        assassino.add(assassino3);

        return assassino;
    }


}
