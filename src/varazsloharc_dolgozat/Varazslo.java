package varazsloharc_dolgozat;

import java.util.Random;

/**
 *
 * @author Tóth Milán
 */
public class Varazslo {

    // Alap tulajdonságok
    private String nev;
    private Integer ero;
    private Integer vedelem;
    private Integer eletero;

    // Kellékek
    private Varazspalca varazspalca;
    private Palast palast;

    public Varazslo(String nev, Integer ero, Integer vedelem, Integer eletero, Varazspalca varazspalca, Palast palast) {
        this.nev = nev;
        this.ero = ero;
        this.vedelem = vedelem;
        this.eletero = eletero + palast.getEletero();
        this.varazspalca = varazspalca;
        this.palast = palast;
    }

    public String getNev() {
        return nev;
    }

    public void setNev(String nev) {
        this.nev = nev;
    }

    public Integer getEro() {
        return ero;
    }

    public void setEro(Integer ero) {
        this.ero = ero;
    }

    public Integer getVedelem() {
        return vedelem;
    }

    public void setVedelem(Integer vedelem) {
        this.vedelem = vedelem;
    }

    public Integer getEletero() {
        return eletero;
    }

    public void setEletero(Integer eletero) {
        this.eletero = eletero;
    }

    public Varazspalca getVarazspalca() {
        return varazspalca;
    }

    public void setVarazspalca(Varazspalca varazspalca) {
        this.varazspalca = varazspalca;
    }

    public Palast getPalast() {
        return palast;
    }

    public void setPalast(Palast palast) {
        this.palast = palast;
    }

    public int vedelem() {

        int minimum = palast.getMinimumVedelem();   // 2
        int maximum = palast.getMaximumVedelem();   // 9

        int tartomany = maximum - minimum;  // 7

        // Generál egy számot a palást minimum és maximum védelme  között
        int vedelem = new Random().nextInt(tartomany + 1);  // 0-7
        vedelem += minimum; // 0-7 + 2 => 2-7

        // Hozzájön a varázsló védelem tulajdonsága
        vedelem += this.vedelem;

        return vedelem;
    }

    public void tamadas(Varazslo szenvedo) {
        // A varázsló támadó értéke és a másik varázsló aktuális védelmi pontja
        int sebzes = ero + szenvedo.vedelem();

        // Hozzá jön a varázspálca ereje
        sebzes += varazspalca.getEro();

        System.out.println(nev + " megtámadja " + szenvedo.getNev() + ", ezzel " + sebzes + " sebzést okoz");

        if (szenvedo.getEletero() >= 0) {
            // Elszenvedi a támadást
            szenvedo.setEletero(szenvedo.getEletero() - sebzes);
        }

        System.out.println(szenvedo.getNev() + " életereje " + szenvedo.getEletero() + " lett");
    }

    public static void harc(Varazslo tamado, Varazslo szenvedo) {
        boolean jatek = true;

        while (jatek) {
            tamado.tamadas(szenvedo);
            if (szenvedo.getEletero() <= 0) {
                System.out.println("\nA győztes nem más, mint " + tamado.getNev() + "!");
                jatek = false;
            } else {
                szenvedo.tamadas(tamado);
                if (tamado.getEletero() <= 0) {
                    System.out.println("\nA győztes nem más, mint " + szenvedo.getNev() + "!");
                    jatek = false;
                }

            }
        }
    }

}
