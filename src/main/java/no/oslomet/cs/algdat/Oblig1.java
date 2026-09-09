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
        return a[a.length - 1];  // returnerer verdien til størst verdi
    }
    public static int ombyttinger(int[] a) {
    }

    (a) det blir n - 1 sammenlikninger
    (b) det blir færrest ombyttinger om den største verdien i tabellen er første posisjon.
    (c) det blir flest ombyttinger om den største verdien i tabellen er i siste posisjon.
    (d) 

    // Oppgave 2
    public static int antallUlike(int[] a){

        if(a.length == 0){
            return 0;
        }

        int AntallUlike = 1;

        for(int i = 0; i < a.length - 1; i++){
            if(a[i] > a[i + 1]){
                throw new IllegalStateException("Tabellen er ikke sortert");
            }

            if(a[i] != a[i+1]){
                AntallUlike++;
            }
        }

        return antallUlike;
    }

    // Oppgave 3
    public static int antallUlikeUsortert(int[] a) {

        if(a.length == 0){
            return 0;
        }

        for(int i = 0; i < a.length; i++){
            boolean funnetTidligere = false;

            for(int j = 0; j < i; j++){
                if(a[i] == a[j]){
                    funnetTidligere = true;
                    break;
                }
            }

            if(!funnetTidligere){
                antallUlike++;
            }
        }

        return antallUlike;
    
    }

    // Oppgave 4
    public static void sorter(int[] a, int fra, int til) {
        if(fra < 0 || til > a.length){
            throw new IndexOutOfBoundsException("Ugyldig fra eller til-index");
        }
        if(fra >= til){
            return;
        }

        for(int i = fra + 1; i < til; i++){
            int verdi = a[i];
            int j = i - 1;

            while(j >= fra && a[j] > verdi){
                a[j + 1] = a[j];
                j--;
            }

            a[j + 1] = verdi;
        }
    }

    // Oppgave 5
    public static void delsortering(int[] a) {
        if(a.length == 0){
            return;
        }

            int venstre = 0;
            int høyre = a.length - 1;

            while(a[venstre] <= høyre){
                if(vesntre % 2 != 0){
                    venstre++;
                }

                else if(a[høyre] & 2 = 0){
                    høyre--;
                }
                else{
                    int bytt = a[venstre];
                    a[venstre] = a[høyre];
                    a[høyre] = bytt;
                    venstre++;
                    høyre--;
                }
            }
            sorter(a, 0, venstre);

            sorter(a, venstre, a.length);
    }

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
