package Martins.Guilherme.Exemplo5.model;

import lombok.*;

/**
 * @Author Guilherme Martins
 * @Version 1.0
 * @Since 16/04/2020 17:40
 */

@ToString
@NoArgsConstructor @AllArgsConstructor
public class Assassinos {

    @Getter @Setter
    private String name;

    @Getter @Setter
    private int age;

    @Getter @Setter
    private double abiliity;

}

