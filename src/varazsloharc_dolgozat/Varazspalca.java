package varazsloharc_dolgozat;

/**
 *
 * @author Tóth Milán
 */
public class Varazspalca {

    private String nev;
    private Integer fixSebzes;
    private Integer ero;

    public Varazspalca(String nev, Integer fixSebzes, Integer ero) {
        this.nev = nev;
        this.fixSebzes = fixSebzes;
        this.ero = ero;
    }

    public String getNev() {
        return nev;
    }

    public void setNev(String nev) {
        this.nev = nev;
    }

    public Integer getFixSebzes() {
        return fixSebzes;
    }

    public void setFixSebzes(Integer fixSebzes) {
        this.fixSebzes = fixSebzes;
    }

    public Integer getEro() {
        return ero;
    }

    public void setEro(Integer ero) {
        this.ero = ero;
    }

}
