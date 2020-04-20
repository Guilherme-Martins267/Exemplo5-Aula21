package Martins.Guilherme.Exemplo5.Controller;

import Martins.Guilherme.Exemplo5.model.Promissoria;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class PromissoriaController {

    @GetMapping("/promissoria")
    public ArrayList<Promissoria> getPromissoria() {

        Promissoria promissoria1 = new Promissoria();
        promissoria1.setPromissory("15.000.000 on John Wick's head");

        Promissoria promissoria2 = new Promissoria();
        promissoria2.setPromissory("11.000.000 on Thiago Cury's head");

        Promissoria promissoria3 = new Promissoria();
        promissoria3.setPromissory("7.000.000 on Catapimba's head");

        ArrayList<Promissoria> promissoria = new ArrayList<>();
        promissoria.add(promissoria1);
        promissoria.add(promissoria2);
        promissoria.add(promissoria3);

        return promissoria;
    }
}
