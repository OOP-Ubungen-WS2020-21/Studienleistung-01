---
title: Template
author: Zuletzt bearbeitet von Alexander Bazo
documentclass: scrartcl
classoption:
  - a4paper
header-includes: |
    \usepackage{german} 
    \usepackage[a4paper,left=2.5cm, right=2.5cm,top=2.5cm, bottom=3cm]{geometry}
    \usepackage{fancyhdr}
    \usepackage{graphicx}
    \pagestyle{fancy}
    \fancyhf{}
    \rhead{OOP WS 2020/21}
    \lhead{U00 | Template}
    \cfoot{\includegraphics[height=2cm]{docs/footer.png}}
    \fancypagestyle{plain}{
      \fancyhf{}
      \rhead{OOP WS 2020/21}
      \lhead{U00 | Template}
      \cfoot[C]{\includegraphics[height=2cm]{docs/footer.png}}}
---


# Template für Übungsaufgaben 

## Allgemeine Hinweise zur Studienleistung
In dieser Studienleistung werden Sie mehrere Programmieraufgaben lösen. Um die Aufgaben zu bearbeiten,
müssen Sie zuerst das Projekt OOP-Studienleistung-WS19-01-Starterpaket.zip in IntelliJ öffnen. **Nutzen Sie zum Lösen der einzelnen Aufgaben die bereitgestellten Klassendateien.** Zum Einreichen Ihrer Aufgaben nutzen Sie die entsprechende Funktion in GRIPS. Falls Sie Problemen mit dem Starterpaket oder dem
Einreichen der Aufgabe haben, können Sie sich in den Handouts auf GRIPS informieren.

**Achtung:** Eine Verlängerung der Abgabefrist ist nicht möglich. Einreichungen die uns (zu spät) per E-Mail
erreichen, werden nicht mehr berücksichtigt. Alle nicht eingereichten Aufgaben werden mit nicht bestanden
bewertet. Testen Sie den Upload am besten schon vor Ablauf der Frist in Ruhe: Sie können bis zum
Abgabetermin beliebig viele neue Lösungen einreichen.

**Bewertungskriterien:** Für die gesamte Studienleistung gilt, dass die eingereichten Lösungen nur die in der
Aufgabenstellung beschriebenen Probleme lösen sollen. Lassen Sie keinen Teil der jeweiligen Aufgabe weg und
interpretieren Sie die Fragestellung nicht selbstständig. Bewertet wird, in wie weit Sie das beschriebene
Problem vollständig lösen. Wenn Sie die Aufgaben erfolgreich bearbeitet haben, können Sie Ihre Lösung gerne
kreativ gestalten und erweitern; achten Sie dabei darauf, dass die eigentlichen Anforderungen weiterhin erfüllt
bleiben.  
Die Qualität Ihres Codes fließt in die Gesamtnote mit ein: Nutzen Sie Dekomposition um Ihre Programme
übersichtlich zu gestalten. Verwenden Sie sinnvolle Bezeichner für Variablen und Methoden und kommentieren
Sie ausreichend. Beachten Sie dazu die Kriterien für guten und schlechten Code, die in der Vorlesung erwähnt
wurden.

## Starterpaket

Ein vorbereitetes Starterpaket zur selbständigen Implementierung der Aufgabe finden Sie [hier](https://github.com/OOP-Ubungen-WS2020-21/Studienleistung-01/archive/Starterpaket.zip).

## Aufgabe 1: Bouncer färbt Blumen
In der ersten Aufgabe soll Bouncer die Blütenblätter von mehreren Blumen grün einfärben, während der
Stempel blau bleiben soll. Es gibt auf der Karte nur vollständige Blumen. Die Aufgabe ist erst erledigt, wenn alle
Blumen auf der Karte grün gefärbte Blütenblätter haben.
Dazu muss Bouncer das gesamte Feld ablaufen und prüfen, ob das Feld, auf dem er steht, einfärben soll. Wenn
Bouncer auf dem grünen Feld rechts unten im Eck ankommt, und alle in Frage kommenden Felder gefärbt hat,
ist er fertig.
Achten Sie darauf, dass Ihre Lösung für beliebige Blumenpositionen ausser dem letzten Feld rechts unten gilt.
Sie können überprüfen, ob Ihre Lösung dieser Vorgabe entspricht, indem Sie die im Starterpaket mitgelieferte
zweite Karte Flowers2.xml laden und mit Ihrem Code testen.  
  
**Hilfsmethoden:** Legen Sie eigenständig Methoden an, die Ihnen dabei helfen, häufig auftretende Bewegungsabläufe von Bouncer auszulagern.  


