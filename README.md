
# Java 101

Dieser Java-Workshop behandelt alle wichtigsten Grundlagen von Java. Mit Hilfe des Paketmanagers Gradle erstellen Sie
 ein neues Java-Projekt von Grund auf. Erstellt wird eine kleine UI-Anwendung, mit der auf Knopfdruck ein Witz aus der
 International Chuck Norris Database angefordert und in unserer Anwendung angezeigt wird. Für das Handling der HTTP-
 Request- u. -Responses soll eine moderne Java Bibliothek verwendet werden.

<hr>

## Tech Stack

- Gradle 6.1.1
- JDK 13.0.1
- JUnit 4.12
- Google HTTP Client 1.34.1

<hr>

## Projekt-Setup

### 1. Gradle-Projekt anlegen

![gradle](https://github.com/christopherstock/AntDesignPrimer/raw/master/_ASSET/readme/150px/logo_npm.png)

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

Die Hauptklasse und deren statische **main**-Methode stellt den Einstieg in unsere Anwendung dar. Sie wurde von Gradle
 erstellt unter:

`src/main/java/de/mayflower/java101/App.java`

Alle Sourcecodes siedeln somit an unter:

`src/main/java`

Es empfiehlt sich, diesen Pfad in der IDE Ihrer Wahl explizit als **Sources Root** zu definieren.


### 2.2. Tests

Ein Beispiel JUnit-Test wurde von Gradle bereits erstellt unter:

`src/test/java/de/mayflower/java101/AppTest.java`

Alle JUnit-Tests siedeln somit an unter:

`src/test/java`

Es empfiehlt sich, diesen Pfad in der IDE Ihrer Wahl explizit als **Test Resources Root** zu definieren.


### 3. Kompilieren und starten der Anwendung und der Tests

### 3.1. Anwendung kompilieren und starten

Der folgende Befehl kompiliert die Projektsources und startet die Anwendung:

`gradle run`

Es sollte ein `Hello world.` auf der Konsole ausgegeben werden.


### 3.2. Tests

Alle JUnit-Tests können mit dem folgenden Befehl ausgeführt werden:

`gradle test`

Laufen alle Tests korrekt durch, so wird lediglich `BUILD SUCCESSFUL` auf der Konsole ausgegeben. Es erfolgt keine
 explizite Ausgabe für die einzelnen Tests.

<hr>

## Coding DOJO

1. Anlegen eines neuen Gradle-Projekts.
2. Starten der Anwendung und Ausführen der Tests.
3. Erstellen einer neuen Klasse AppFrame in der main-Methode und Aufrufen deren nicht-statischer Methode `show()`.
4. Erstellen und Konfektionieren einer JFrame Instanz mit einer beinhaltenden JPanel Instanz. 
5. Erstellen und Konfektionieren eines JButtons und eines JTextFields und Hinzufügen zum JPanel.
6. Erstellen eines ActionListeners, Zuweisen auf den JButton und Ausgabe einer Konsolenausgabe beim Klicken auf den 
 Button.
7. Installation der aktuellsten Version der Library `google-http-client` via Gradle.
8. Einbauen eines GET-Requests zum Requesten eines zufälligen Witzes aus der International Chuck Norris Database
 URL: `http://api.icndb.com/jokes/random`
9. Der Response Body soll als String in der Konsole ausgegeben werden.
10. Der Response Body soll automatisch in eine Instanz der neuen Klasse JokeResponse geparsed werden, welche die
 Struktur des JSON-Response-Bodies repräsentiert.
