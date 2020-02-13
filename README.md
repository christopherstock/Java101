
# Systemvorraussetzungen

Gradle 6.1.1
JDK 13.0.1


# Projekt-Setup

## 1. Gradle-Projekt anlegen

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


## 2. Projektstruktur

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


## 3. Bauen und Starten der Anwendung




















![Ant Design](https://github.com/christopherstock/AntDesignPrimer/raw/master/_ASSET/readme/150px/logo_ant_design.png)

# React Hooks and React Context - Ant Design Web-Frontend Workshop 2.0

In diesem Workshop wollen wir die Komponentenbibliothek Ant Design im praktischen Einsatz kennenlernen. Die geniale 
 React-Komponentenbibliothek Ant Design bietet eine vollständige Palette an hochwertigen, responsiven und
 reaktiven Enterprise UI-Komponenten für Web-Frontends. Darüberhinaus ermöglicht sie die schnelle Realisierung 
 kompletter Webpräsenzen ohne dafür eine einzige Zeile HTML oder CSS Code schreiben zu müssen.

<hr>

![npm](https://github.com/christopherstock/AntDesignPrimer/raw/master/_ASSET/readme/150px/logo_npm.png)

## npm-Tech Stack

Zum Bauen unseres Web-Frontends nutzen wir den Paketmanager npm. Mit diesem können wir schnell und einfach
 einen modernen Web-Frontend Tech Stack unter Verwendung der Technologien TypeScript, Webpack und React realisieren.
 Außerdem können wir zahlreiche Zusatztools wie Tests, Linter und CSS-Präprozessoren aus der npm Registry nutzen.

Insgesamt kommen die folgenden Technologien zum Einsatz:

- Ant Design 3.26.9
- TypeScript 3.7.5
- Webpack 4.41.6
- React 16.12.0
- Axios Http Client 0.19.2
- Less 3.11.1
- Jest 25.1.0
- TypeDoc 0.16.9
- ESLint 6.8.0
- TSLint 6.8.0

<hr>

![The International Chuck Norris Database](https://github.com/christopherstock/AntDesignPrimer/raw/master/_ASSET/readme/150px/icndb.png)

## The International Chuck Norris Database

Als fertig bestehendes **Backend** für unser Frontend-Projekt bietet sich die **International
 Chuck Norris Database** an, eine einfache und klar strukturierte REST-API die wir mit der integrierten
 **JavaScript Fetch API** ansprechen können und die uns mit unendlich vielen Chuck Norris Witzen versorgt.
 Beispielsweise liefert hier ein simpler GET-Request auf http://api.icndb.com/jokes/random einen entsprechenden
 Response Body im JSON Format zurück, den wir anschließend in unserem Frontend parsen und anzeigen können:

```
{
    "type": "success", 
    "value": { 
        "id": 478, 
        "joke": "Chuck Norris can instantiate an abstract class.", 
        "categories": ["nerdy"] 
    }
}
```

<hr>

![Installation](https://github.com/christopherstock/AntDesignPrimer/raw/master/_ASSET/readme/150px/install.png)

## Installation

Nach dem Klones des Git Repositories installiert der folgende Befehl alle npm Pakete die der genannte Tech Stack 
 verwendet und die in der Datei **package.json** aufgelistet sind. Die in dieser Datei im Bereich **script** 
 aufgelisteten npm Targets stehen anschließend zur Verfügung.

`npm install`

<hr>

![Entwicklung](https://github.com/christopherstock/AntDesignPrimer/raw/master/_ASSET/readme/150px/develop.png)

## Entwicklung

Zum Bauen und Betrieben des Web-Frontends kann mit dem folgenden Befehl der Webpack Dev Server gestartet werden:

`npm run webpack:devserver`

Die gebaute und in den Webpack Dev Server gemountete Frontend Anwendung kann jetzt im Browser eingesehen werden unter:
 
`http://localhost:5000/`

Es sollte nun das folgende Frontend im Browser zu sehen sein:

![Frontend](https://github.com/christopherstock/AntDesignPrimer/raw/master/_ASSET/readme/150px/frontend.jpg)

Beim allen Änderungen am Projektcode baut der Webpack Dev Server das Frontend selbstständig neu und aktualisiert die
 Webseite im Browser.

<hr>

![Aufgaben](https://github.com/christopherstock/AntDesignPrimer/raw/master/_ASSET/readme/150px/exam.png)

## Aufgaben

Hier sind nun drei Übungsaufgaben, die es durch Erweiterungen im TypeScript-Code umzusetzen gilt.
Die entsprechenden Stellen im Code sind mit **TODO WORKSHOP** gekennzeichnet.

#### 1. Anzeige eines Progress-Bars 
Eine neue Instanz der Komponente **Progress**
 aus dem Ant Design Framework soll in der Komponente **RandomJoke** anzeigen, wieviele
 Chuck Norris-Witze der maximal täglich ertragbaren Anzahl von 10 bereits angezeigt wurden.

#### 2. Anzeige einer Notification für leere Seiten
Zeigen Sie einen **Notification** Dialog mit einer sprechenden Beschreibung und der Severity INFO aus dem Ant Design
 Framework an, wenn der Benutzer einen Menüpunkt auswählt, für den im **Content**-Bereich noch "To be defined .."
 angezeigt wird.

#### 3. Durchführung eines Refactorings
Extrahieren Sie den Lambda in der Methode `RandomJoke#render()` im Attribut `renderItem` der Komponente `antd.List` in
 eine separate, nicht-statische Methode.

<hr>

![Hand Outs](https://github.com/christopherstock/AntDesignPrimer/raw/master/_ASSET/readme/150px/handout.png)

## Folgeworkshops

Hier sind ein paar weiterführende Workshops zur Vertiefung der einzelnen verwendeten Technologien unseres Tech Stacks:

#### Warum TypeScript?

https://blog.mayflower.de/6135-typescript.html

#### Aufsetzen eines Web-Tech Stacks mit npm, TypeScript und Webpack

https://blog.mayflower.de/6324-typescript-tooling-npm-webpack.html

#### TypeScript im Vergleich zu Java

https://blog.mayflower.de/6344-typeacript-java-entwickler.html

#### TypeScript Workshop für Einsteiger

https://blog.mayflower.de/6229-typescript-workshop.html

<hr>

![npm](https://github.com/christopherstock/AntDesignPrimer/raw/master/_ASSET/readme/150px/logo_npm.png)

## npm targets

Eine ausführliche Übersicht über die Funktionsweise aller npm-Targets unseres npm-Tech Stacks kann in der
 MarkDown-Datei [NPM-TARGETS.md](https://github.com/christopherstock/AntDesignPrimer/blob/master/NPM-TARGETS.md)
 eingesehen werden.

