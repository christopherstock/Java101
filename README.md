
# Java 101

![Java](https://github.com/christopherstock/Java101/raw/master/_ASSET/readme/logo_java.png)

Dieser Java-Workshop behandelt die wichtigsten Grundlagen der Programmiersprache Java. Mit Hilfe des Paketmanagers 
 **Gradle** erstellen wir ein neues Java-Projekt von Grund auf. Entwickelt wird eine kleine UI-Anwendung, mit der
 auf Knopfdruck ein Witz aus der **International Chuck Norris Database** angefordert und in unserer Anwendung
 angezeigt wird. Für das Handling der HTTP-Request- u. -Responses soll eine moderne Java Bibliothek verwendet werden.

<hr>

## Tech Stack

- Gradle 6.1.1
- JDK 13.0.1
- JUnit 4.12
- Google HTTP Client 1.34.1

<hr>

## Projekt-Setup

![gradle](https://github.com/christopherstock/Java101/raw/master/_ASSET/readme/logo_gradle.png)

### 1. Gradle-Projekt anlegen

Erstellen Sie einen neuen Ordner mit einem beliebigen Namen für das Projekt. Wechseln Sie in diesen Ordner und
 initialisieren Sie ein neues Gradle-Projekt mit dem folgenden Befehl:

`gradle init`

Bitte beantworten Sie die Rückfragen der Konsole wie folgt:

- Select type of project to generate: `2: application`
- Select implementation language: `3. Java`
- Select build script DSL: `1. Groovy`
- Select test framework: `1. JUnit 4`
- Project name: `Java101`
- Source package: `de.mayflower.java101`


### 2. Projektstruktur

### 2.1. Hauptklasse

Die Hauptklasse und deren statische **main**-Methode stellt den Einstieg in unsere Anwendung dar. Die Hauptklasse wurde
 von Gradle erstellt unter:

`src/main/java/de/mayflower/java101/App.java`

Alle Sourcecodes für das Projekt siedeln somit an unter:

`src/main/java`

Es empfiehlt sich, diesen Pfad in der IDE Ihrer Wahl explizit als **Sources Root** zu definieren.

![Junit](https://github.com/christopherstock/Java101/raw/master/_ASSET/readme/logo_junit.png)

### 2.2. Tests

Ein Beispiel JUnit-Test wurde von Gradle bereits erstellt unter:

`src/test/java/de/mayflower/java101/AppTest.java`

Alle JUnit-Tests siedeln an unter:

`src/test/java`

Es empfiehlt sich, diesen Pfad in der IDE Ihrer Wahl explizit als **Test Resources Root** zu definieren.


### 3. Kompilieren und starten der Anwendung und der Tests

### 3.1. Anwendung kompilieren und starten

Der folgende Befehl kompiliert die Projektsources und startet die Anwendung:

`gradle run`

In der Konsolenausgabe sollte nun ein `Hello world.` zu sehen sein.


### 3.2. Tests

Alle JUnit-Tests können mit dem folgenden Befehl ausgeführt werden:

`gradle test`

Laufen alle Tests korrekt durch, so wird lediglich `BUILD SUCCESSFUL` auf der Konsole ausgegeben. Es erfolgt keine
 explizite Ausgabe der einzeln durchgeführten Tests.

<hr>

![The International Chuck Norris Database](https://github.com/christopherstock/Java101/raw/master/_ASSET/readme/chuck.jpg)

## Development

Die folgenden Aufhaben können im Rahmen eines Coding DOJOs oder im Workshopformat durchgeführt werden:

1. Instanziieren Sie die neue Klasse `AppFrame` in der `main`-Methode und rufen Sie deren nicht-statischer Methode
 `show()` auf.
2. Erstellen und Konfektionieren Sie eine Instanz von `JFrame` im Konstruktor der Klasse `AppFrame` und fügen Sie dem
 `JFrame` eine Instanz von `JPanel` hinzu. 
3. Erstellen und Konfektionieren Sie einen `JButton` und ein `JTextField` und fügen Sie die beiden Objekte zum
 `JPanel` hinzu. Das Textfeld soll `read-only` sein.
4. Fügen Sie dem Button einen `ActionListener` hinzu, als der die Klasse `AppFrame` fungieren soll.
 Beim Klick auf den `JButton` soll vorerst eine Ausgabe auf der Ausgabekonsole erscheinen.
5. Installieren Sie die aktuellste Version der Bibliothek `google-http-client` aus dem Maven Repository via Gradle.
6. Erstellen Sie beim Klick auf den Button einen GET-Request zum Requesten eines zufälligen Witzes aus der 
 **International Chuck Norris Database** unter der URL `http://api.icndb.com/jokes/random`.
7. Geben Sie den Response Body als String in der Konsole aus.
8. Fügen Sie das automatische Parsen des Response Bodies in eine Instanz der neuen Klasse **JokeResponse** hinzu.
 Diese Datenklasse soll die Struktur des JSON-Response-Bodies repräsentieren.
9. Zeigen Sie den Witz im Ausgabefeld an.
10. Lagern Sie die Funktionalität des Request- und des Response-Handlings in eine neue Klasse API aus.
