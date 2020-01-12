# Fragen und Antworten

## Service Registration and Discovery

Unter welchen Namen wird das Service registriert und wo wird das konfiguriert?

Im File bootstrap.properties:

spring.application.name=a-bootiful-client

## Hysterix Circuit Breaker

Wo genau ist die Anwendung von Hysterix zu sehen?
Durch welche Methode wird Fallback bereitgestellt?

@HystrixCommand(fallbackMethod = "reliable")

...

public String reliable() {
    return "Hysterix Absicherung funktioniert";
}

## Routing and Filtering

Wenn das Ervice Discovery mit Ribbon eingeschalten wäre, was könnte man in der Property Datei dann weglassen?

zuul.routes.books.url=http://localhost:8090
