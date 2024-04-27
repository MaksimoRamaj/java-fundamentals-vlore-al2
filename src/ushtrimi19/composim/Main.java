package ushtrimi19.composim;

import ushtrimi19.Author;
import ushtrimi19.composim.Makina;
import ushtrimi19.composim.Motorri;

public class Main {
    public static void main(String[] args) {
        Author author =
                new Author("Frasheri","Shqiptar");

        author.setSurname(null);
        System.out.println(author.getSurname());

        Motorri motorri =
                new Motorri(6,150,"Renault");
        Makina makina =
                new Makina(motorri,"Renault");

        makina.getMotorri().getMarka();

        Makina m = new Makina(motorri,"dasd");
        Makina.CdPlayer cdPlayer = new Makina.CdPlayer();
    }
}
