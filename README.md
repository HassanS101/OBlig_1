# Obligatorisk Oppgave 1 i DATS2300 - Algoritmer og Datastrukturer

Denne oppgaven er en innlevering i Algoritmer og Datastruktorer.
Oppgaven er levert av følgende studenter:
* s405093, s405093@oslomet.no

## Oppgavebeskrivelser

### Oppgave 1
  Algoritmen går gjennom tabellen og sammenligner hvert par av naboer fra venstre til høyre. hver gang et tall til høyre er større til venstre, så bytter de plass. Til slutt vil vi få ut verdien til den største verdien i tabellen ut. 

### Oppgave 2
I oppgave 2 så skulle vi finne frem til antall ulike i sortert tabell. oppgaven løeses ved først å returnere 0 dersom tabellen er tom. deretter gor en for løkke gjennom tabellen for å bekrefte om den er sotert i stigende rekkefølge og gir en IllegalStateException om den finner feilplasserte elementer. den sjekker samtidig for nabo eleemter har ulik verdi for å identifisere overganger til nye tall. hver unike overgang øker telleren med 1 og returnerer antall når løkken er ferdig. 

### Oppgave 3
I Oppgave 3 finner vi ut av antall ulike i et usortert tabell. Oppgaven løeses ved å la en løkke gå gjennom hvert element i tabellen. for hvert element søker en annen indre løkke bakover fra start til gjeldende indeks for å se om tallet har forekommet tidligere. dersom tallet ikke har blitt sett før, er det et nytt unikt tall som øker i telleren med 1. 

### Oppgave 4
I oppgave 4 så sorterer vi elementer som grenser fra posisjon og til posisjon. vi først validererom fra og til ligger innenfor tabellens lovlige indesker. deretter bruker vi algoritmen quicksort for å partisjonere og sortere intervallene effektivt uten bruk av hjelpetabeller for å effektivisere det. ved å dele tabellen i mindre deller oppnås den nødvendige tidskompleksiteten. dersom intervallet inneholder færre enn to elementer, avsluttes metoden uten at noe endrer seg. 

### Oppgave 5
i Oppgave 5 så skal vi delsortere oddetall til venstre side, og partall til høyre side. oppgaven løeses ved å bruke to pekere som går mot hverandre fra hver sin ende av tabellen for å partisjonere elementene. alle oddetall flyttes til venstre side, mens alle partall flyttes over til høyre side. når det er over så kaller vi sorter-metoden fra opp4 to ganger for å sortere oddetallene og partallene. 

### Oppgave 6
I oppgave 6 så skal vi utføre en tabellrotasjon. oppgaven løeses ved å først sjekke om tabellen har lengdekrav på to eller flere tegn. det siste elementet lagres i en midlertidig variabel før forskyving starter. en for løkke går bakfra gjennom tabellen og kopierer hvert element en plass til høyre. til slutt plasseres det lagrende elementet helt frem på posisjon 0.

### Oppgave 8
I oppgave 8 så skal vi flette sammen to strenger. det gjør vi at vi oppretter en StringBuilder for effektiv oppbygging av resultatteksten. en for løkke kjører like mange ganger som lengen på den legste strengen. på hver valgte indeks sjekkes det om strengene har et tegn tilgjengelig før tegnet hentes og legges til. dersom en av strengene er kortere, vil de resterende tegnene fra den lengste strengen automatisk legges til bakerst. 
