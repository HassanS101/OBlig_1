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
    if (a == null || a.length < 1) {
        throw new IllegalArgumentException("Tabellen må ha minst ett element.");
    }

    int antallOmbyttinger = 0;

    
    for (int i = 0; i < a.length - 1; i++) {
        
        if (a[i] > a[i + 1]) {
           
            int temp = a[i];
            a[i] = a[i + 1];
            a[i + 1] = temp;

            antallOmbyttinger++;
        }
    }

    return antallOmbyttinger;
}
    //denne metoden er mye dårligere fordi den gjør dyre operasjoner altså n ombyttinger mens en vanlig maksmetode oppdatere kun en variabel.

    /* (a) det blir n - 1 sammenlikninger
    (b) det blir færrest ombyttinger om den største verdien i tabellen er første posisjon.
    (c) det blir flest ombyttinger om den største verdien i tabellen er i siste posisjon.
    (d) gjennomsnittlig antall ombyttinger er n - ln(n) - 0,5772 */

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

        int antallUlike = 0;

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
    
    if (fra < 0 || til > a.length) {
        throw new IndexOutOfBoundsException("Ugyldig fra- eller til-indeks.");
    }

    if (fra >= til - 1) {
        return;
    }

    quicksort(a, fra, til - 1);
}

private static void quicksort(int[] a, int venstre, int høyre) {
    if (venstre >= høyre) {
        return;
    }

    int p = partisjoner(a, venstre, høyre);

    quicksort(a, venstre, p - 1);
    quicksort(a, p + 1, høyre);
}

private static int partisjoner(int[] a, int venstre, int høyre) {
    int pivot = a[høyre];
    int i = venstre - 1;

    for (int j = venstre; j < høyre; j++) {
        if (a[j] <= pivot) {
            i++;
            int temp = a[i];
            a[i] = a[j];
            a[j] = temp;
        }
    }

    int temp = a[i + 1];
    a[i + 1] = a[høyre];
    a[høyre] = temp;

    return i + 1;
}

    // Oppgave 5
    public static void delsortering(int[] a) {
        if(a.length == 0){
            return;
        }

            int venstre = 0;
            int høyre = a.length - 1;

            while(a[venstre] <= høyre){
                if(venstre % 2 != 0){
                    venstre++;
                }

                else if(a[høyre] % 2 == 0){
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
    public static void rotasjon(char[] a) {
        if(a.length <= 1){
            return;
        }

        char siste = a[a.length - 1];

        for(int i = a.length - 1; i > 0; i--){
            a[i] = a[i - 1];
        }

        a[0] = siste;
    }

    // Oppgave 7
    public static void rotasjon(char[] a, int k) {throw new UnsupportedOperationException();}

    // Oppgave 8
    public static String flett(String s, String t) {
    StringBuilder result = new StringBuilder();

    int maxLengde = Math.max(s.length(), t.length());

    for (int i = 0; i < maxLengde; i++) {
        
        if (i < s.length()) {
            result.append(s.charAt(i));
        }
        
        if (i < t.length()) {
            result.append(t.charAt(i));
        }
    }

    return result.toString();
}

    public static String flett(String... s) {throw new UnsupportedOperationException();}

    // Oppgave 9
    public static int[] indeksSortering(int[] a) {throw new UnsupportedOperationException();}

    // Oppgave 10
    public static int[] tredjeMin(int[] a) {throw new UnsupportedOperationException();}

    // Oppgave 11
    public static boolean inneholdt(String a, String b) {throw new UnsupportedOperationException();}
}
