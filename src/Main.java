import java.math.BigDecimal;
import java.util.Scanner;

public class Main {

    /*
    *  Kreiraj klasu Proizvod s privatnim atributima:
    *  naziv (tipa String)
    *  cijena (tipa BigDecimal)
    *  popust (tipa BigDecimal)
    *  Dodaj javni konstruktor za inicijalizaciju naziv i cijena
    *  Kreiraj public metodu postaviPopust koja omogućava postavljanje popusta u postocima (BigDecimal)
    *  Dodaj public metodu postaviPopust koja vraća konačnu cijenu proizvoda nakon što je popust primjenjen
    *  U glavnoj klasi kreiraj objekt klase Proizvod, postavi naziv, cijenu i popust te ispiši konačnu cijenu proizvoda
    *
    *  DODATNO: Od korisnika tražiti unos veličine polja te nakon toga kreirati onoliko objekata koliko je korisnik unio.
    *  Za svaki proizvod (objekt) potrebno je napraviti sve korake iz glavnog dijela zadatka.
    */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Unesi veličinu polja: ");

        int velicinaPolja = 0;

        velicinaPolja = scanner.nextInt();
        scanner.nextLine();


        Proizvod[] proizvodi = new Proizvod[velicinaPolja];

        for (int i = 0; i < velicinaPolja; i++) {
            System.out.println("\nUnesi podatke za proizvod " + (i + 1) + ":");

            System.out.print("Naziv: ");
            String naziv = scanner.nextLine();

            System.out.print("Cijena: ");
            BigDecimal cijena = scanner.nextBigDecimal();
            scanner.nextLine();

            System.out.print("Popust (u %): ");
            BigDecimal popust = scanner.nextBigDecimal();
            scanner.nextLine();

            Proizvod proizvod = new Proizvod(naziv, cijena);
            proizvod.postaviPopust(popust);

            proizvodi[i] = proizvod;
        }

        System.out.println("\n--- Podaci o proizvodima ---");
        for (Proizvod proizvod : proizvodi) {
            System.out.println("\nNaziv: " + proizvod.getNaziv());
            System.out.println("Originalna cijena: " + proizvod.getCijena());
            System.out.println("Popust: " + proizvod.getPopust() + "%");
            System.out.println("Konačna cijena nakon popusta: " + proizvod.izracunajCijenu());
        }
    }
}