package varazsloharc_dolgozat;

/**
 *
 * @author Tóth Milán
 */
public class Main {

    public static void main(String[] args) {
        // fixSebezs, ero
        Varazspalca varazspalca1 = new Varazspalca("pálca lv. 1", 10, 50);
        Varazspalca varazspalca2 = new Varazspalca("pálca lv. 2", 30, 70);

        // minSebezs, maxSebzes, eletero
        Palast palast1 = new Palast("Palást lv. 1", 10, 40, 50);
        Palast palast2 = new Palast("Palást lv. 2", 12, 40, 50);

        Varazslo v1 = new Varazslo("Tűz varázsló", 35, 10, 400, varazspalca1, palast2);
        Varazslo v2 = new Varazslo("Jég varázsló", 35, 10, 300, varazspalca2, palast1);

        Varazslo.harc(v1, v2);
    }

}
