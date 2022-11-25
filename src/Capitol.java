import java.util.List;

public class Capitol {
    String titlu_capitol;
    List<Sectiune> sectiuneList;

    public Capitol(String titlu_capitol, List<Sectiune> sectiuneList) {
        this.titlu_capitol = titlu_capitol;
        this.sectiuneList = sectiuneList;
    }
    public Capitol(){}

    public String getTitlu_capitol() {
        return titlu_capitol;
    }

    public void setTitlu_capitol(String titlu_capitol) {
        this.titlu_capitol = titlu_capitol;
    }

    public List<Sectiune> getSectiuneList() {
        return sectiuneList;
    }

    public void setSectiuneList(List<Sectiune> sectiuneList) {
        this.sectiuneList = sectiuneList;
    }

    @Override
    public String toString() {
        return "Capitol{" +
                "titlu_capitol='" + titlu_capitol + '\'' +
                ", sectiuneList=" + sectiuneList +
                '}';
    }
}
