package varazsloharc_dolgozat;

/**
 *
 * @author Tóth Milán
 */
public class Palast {

    private String nev;
    private Integer minimumVedelem;
    private Integer maximumVedelem;
    private Integer eletero;

    public Palast(String nev, Integer minimumVedelem, Integer maximumVedelem, Integer eletero) {
        this.nev = nev;
        this.minimumVedelem = minimumVedelem;
        this.maximumVedelem = maximumVedelem;
        this.eletero = eletero;
    }

    public String getNev() {
        return nev;
    }

    public void setNev(String nev) {
        this.nev = nev;
    }

    public Integer getMinimumVedelem() {
        return minimumVedelem;
    }

    public void setMinimumVedelem(Integer minimumVedelem) {
        this.minimumVedelem = minimumVedelem;
    }

    public Integer getMaximumVedelem() {
        return maximumVedelem;
    }

    public void setMaximumVedelem(Integer maximumVedelem) {
        this.maximumVedelem = maximumVedelem;
    }

    public Integer getEletero() {
        return eletero;
    }

    public void setEletero(Integer eletero) {
        this.eletero = eletero;
    }

}
