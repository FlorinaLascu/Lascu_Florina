import java.util.List;

public class Carte {
    String titlu;
    String numele_autorului;
    List<Capitol> capitols;
    List<Sectiune> sectiunes;

    public Carte(String titlu, String numele_autorului, List<Capitol> capitols, List<Sectiune> sectiunes) {
        this.titlu = titlu;
        this.numele_autorului = numele_autorului;
        this.capitols = capitols;
        this.sectiunes = sectiunes;
    }

    public String getTitlu() {
        return titlu;
    }

    public void setTitlu(String titlu) {
        this.titlu = titlu;
    }

    public String getNumele_autorului() {
        return numele_autorului;
    }

    public void setNumele_autorului(String numele_autorului) {
        this.numele_autorului = numele_autorului;
    }

    public List<Capitol> getCapitols() {
        return capitols;
    }

    public void setCapitols(List<Capitol> capitols) {
        this.capitols = capitols;
    }

    public List<Sectiune> getSectiunes() {
        return sectiunes;
    }

    public void setSectiunes(List<Sectiune> sectiunes) {
        this.sectiunes = sectiunes;
    }

    @Override
    public String toString() {
        return "Carte{" +
                "titlu='" + titlu + '\'' +
                ", numele_autorului='" + numele_autorului + '\'' +
                ", capitols=" + capitols +
                ", sectiunes=" + sectiunes +
                '}';
    }

    public long getNrCap() {
        return this.capitols.stream().count(); }
}
