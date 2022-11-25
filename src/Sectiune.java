public class Sectiune {
    String titlu_sectiune;
    int numar_pagini;

    public Sectiune(String titlu_sectiune, int numar_pagini) {
        this.titlu_sectiune = titlu_sectiune;
        this.numar_pagini = numar_pagini;
    }
    public Sectiune (){}

    public String getTitlu_sectiune() {
        return titlu_sectiune;
    }

    public void setTitlu_sectiune(String titlu_sectiune) {
        this.titlu_sectiune = titlu_sectiune;
    }

    public int getNumar_pagini() {
        return numar_pagini;
    }

    public void setNumar_pagini(int numar_pagini) {
        this.numar_pagini = numar_pagini;
    }

    @Override
    public String toString() {
        return "Sectiune{" +
                "titlu_sectiune='" + titlu_sectiune + '\'' +
                ", numar_pagini=" + numar_pagini +
                '}';
    }

}
