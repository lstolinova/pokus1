//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello and welcome!");
        int vymera=47;
        int cenaZaMetr=545;
        String nazev="Sad Pálava1";
        int cena=vymera*cenaZaMetr;
        Pozemek sadPalava =
                new Pozemek(250,200,"Sad Pálava");
        Pozemek dumBrno =
                new Pozemek(140,280,"Dům Brno");
                        System.out.println("Cena pozemku " + nazev + " je " + cena + " Kč");
        System.out.println(sadPalava.getNazev() + " má výměr " + sadPalava.getVymera());


    }
}