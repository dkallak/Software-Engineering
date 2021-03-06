INSTRUKSJONER FOR OPPSTART AV PROTOTYPEN

Link til GIT-repository: https://github.com/dkallak/Software-Engineering
 
Her kommer instruksjoner over hvilke steg man må følge for at prototypen skal starte opp og kjøre på en my maskin.
 
1. Hvis IntelliJ ikke er installert på datamaskinen som skal kjøre systemet, må det lastes ned fra https://www.jetbrains.com/idea/. Dersom IntelliJ finnes fra før, kan du gå videre til steg 3.
 
2. Følg deretter instruksene installasjonen av programmer gir for nedlastning.
 
3. Om man ikke har konfigurert stien (path) til java i miljøvariablene, er det viktig at dette gjøres før man i det hele tatt får kjørt og kompilert prosjekter i IntelliJ IDEA.
    Da må man lokalisere seg til Kontrollpanel → System og sikkerhet → System, finner man nede på siden at man kan endre innstillinger. Fra vinduet man får opp, trykker man videre på avansert og deretter på miljøvariabler.
    Vinduet viser variablene, hvis JAVA_HOME ikke finnes i listen, så må den opprettes. Trykk på Ny og skriv inn JAVA_HOME på Variabelnavn. Klikk på Bla igjennom katalog... og finn stien der hvor din java jdk er installert. Klikk til slutt på OK.  
 
4. Når IntelliJ er ferdig installert, så kan prosjektet importeres fra datamaskinen. Klikk på Import Project og velg mappen som systemet befinner seg i.
 
5. Når prosjektet er importert inn i IntelliJ, må jUnit4 konfigureres for at testene skal kunne kjøre. Klikk på @Test i en av testklassene som er rød (@Test er rød fordi jUnit4 ikke er konfigurert) og deretter klikk på den røde lyspæren som vil dukke opp til venstre.
    Her vil det stå "Add jUnit4 to classpath". Klikk på denne. Nå vil testene kunne kjøre (det kan også dukke opp en dialogboks som spør deg om du vil bruke JUnit4 fra IntellJ distribusjonen eller kopiere JUnit4 bibliotekts filene til valgte katalog, her velger man det første).
 
6. For at systemet skal kjøre, må SDK konfigureres. Hvis det dukker opp en feilmelding som sier "Project SDK is not defined" må følgende gjøres i IDEen: I feilmeldingen som vises øvert i programmet - klikk på "Setup SDK". Det vil dukke opp en dialogboks Hvor du kan velge 9.0 (java version "9.0.1"). Velg denne og klikk OK.
    Pass på at du har minst versjon 9.0 her. I de ikke-funksjonelle kravene så er det nevnt at kravet for korrekt Java versjon skal minst være på 9.0 plattformen. Hvis man ikke har noen versjoner installert, må man laste ned Java fra: https://www.oracle.com/technetwork/java/javase/downloads/index.html.
 
INTRUKSJONER FOR KJØRING AV .BAT FILER, FOR VISUALISERING AV USECASES
 
1. Finn frem til pathen Software-Engineering\ticketSystem\ticketSystem\src\main\java.
 
2. Klikk på usecases.bat. Deretter kan du velge use-case og få ut visualisering av denne.