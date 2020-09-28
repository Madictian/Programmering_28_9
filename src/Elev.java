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

    Elev(String navn, int alder) {
        this.navn = navn;
        this.alder = alder;
    }
}
