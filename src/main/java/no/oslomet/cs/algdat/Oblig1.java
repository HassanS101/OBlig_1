package no.oslomet.cs.algdat;

public class Oblig1 {

    private Oblig1() {}

    // Oppgave 0
    public static int gruppeMedlemmer() {
        return 1; 
        // Skal returne hvor mange som er i gruppa deres.
    }

    // Oppgave 1
    public static int maks(int[] a) {
        if (a.length < 1)
            throw new java.util.NoSuchElementException("Tabellen a er tom!");

        int m = 0;  // indeks til foreløpig største verdi (m for maks)

        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] > a[i + 1]) {

                int variabel = a[i];
                a[i] = a[i + 1];
                a[i + 1] = variabel;
            }
        }

        return a[a.length - 1];  // returnerer indeksen/posisjonen til største verdi
    }

    public static int ombyttinger(int[] a) {throw new UnsupportedOperationException();}

    // Oppgave 2
    public static int antallUlikeSortert(int[] a) {throw new UnsupportedOperationException();}

    // Oppgave 3
    public static int antallUlikeUsortert(int[] a) {throw new UnsupportedOperationException();}

    // Oppgave 4
    public static void sorter(int[] a, int fra, int til) {throw new UnsupportedOperationException();}

    // Oppgave 5
    public static void delsortering(int[] a) {throw new UnsupportedOperationException();}

    // Oppgave 6
    public static void rotasjon(char[] a) {throw new UnsupportedOperationException();}

    // Oppgave 7
    public static void rotasjon(char[] a, int k) {throw new UnsupportedOperationException();}

    // Oppgave 8
    public static String flett(String s, String t) {throw new UnsupportedOperationException();}

    public static String flett(String... s) {throw new UnsupportedOperationException();}

    // Oppgave 9
    public static int[] indeksSortering(int[] a) {throw new UnsupportedOperationException();}

    // Oppgave 10
    public static int[] tredjeMin(int[] a) {throw new UnsupportedOperationException();}

    // Oppgave 11
    public static boolean inneholdt(String a, String b) {throw new UnsupportedOperationException();}
}
