public class Elev {
    String navn;
    int     alder;
    String by;
    String linie;
    String semester;
    String campus;
    Elev(){ linie = "datamatiker"; semester = "første"; campus = "næstved"; }

    Elev(String navn, int alder, String by) {
        this.navn = navn;
        this.alder = alder;
        this.by = by;
    }
// String navn, int alder, String by, String linie, String semester, String campus
    Elev(String navn, int alder, String by, String linie, String semester, String campus) {
        this.navn = navn;
        this.alder = alder;
        this.by = by;
        this.linie = linie;
        this.semester = semester;
        this.campus = campus;
    }

    Elev(String navn, int alder) {
        this.navn = navn;
        this.alder = alder;
    }
}
