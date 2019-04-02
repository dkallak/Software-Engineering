Intruksjoner for oppstart av systemet

Her kommer instruksjoner over hvilke steg man må følge for at prototypen skal starte opp og kjøre på en my maskin. 

1. Hvis IntelliJ ikke er installert på datamaskinen som skal kjøre systemet, må det lastes ned fra https://www.jetbrains.com/idea/. aDersom IntelliJ finnes fra før, kan du gå videre til steg 3.

2. Følg deretter instruksene installasjonen av programmer gir for nedlastning. 

3. Når IntelliJ er ferdig installert, så kan prosjektet importeres fra datamaskinen. Klikk på Import Project og velg mappen som systemet befinner seg i. 

4. Når prosjektet er importert inn i IntelliJ, må jUnit4 konfigureres for at testene skal kunne kjøre. Klikk på @Test i en av testklassene som er rød (@Test er rød fordi jUnit4 ikke er konfigurert) og deretter klikk på den røde lyspæren som vil dukke opp til venstre. Her vil det stå "Add jUnit4 to classpath". Klikk på denne. Nå vil testene kunne kjøre.

5. For at systemet skal kjøre, må SDK konfigureres. Hvis det dukker opp en feilmelding som sier "Project SDK is not defined" må følgende gjøres i IDEen. I feilmeldingen som vises øvert i programmet - klikk på "Setup SDK". Det vil dukke opp en dialogboks Hvor du kan velge 9.0 (java version "9.0.1"). Velg denne og klikk OK.
    Pass på at du har minst versjon 9.0 her. I de ikke-funksjonelle kravene så er det nevnt at kravet for korrekt Java versjon skal minst være på 9.0 plattformen. Hvis man ikke har noen versjoner installert, må man laste ned Java fra: https://www.oracle.com/technetwork/java/javase/downloads/index.html.

6. Hvis man ikke har konfigurert stien(path) til java i miljøvariablene, er det viktig at dette gjøres før man i det hele tatt får kjørt og kompilert prosjekter i IntelliJ IDEA. 
    Om man da lokaliserer seg til Kontrollpanel → System og sikkerhet → System, finner man nede på siden at man kan endre innstillinger. Fra vinduet man får opp, trykker man videre på avansert og deretter på miljøvariabler. Screenshotet som vises under vil da bli vist, og man må da sette verdien til JAVA_HOME til installasjonsmappen hvor java er installert.
