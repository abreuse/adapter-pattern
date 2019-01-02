## Adapter pattern

Simple example of the Adapter pattern.
- NewCalculator interface adapted to the OldCalculator interface

Un exemple que l'on retrouve souvent est un adapteur entre `Enumeration` et `Iterator`. 

À ne pas confondre avec le pattern [Decorator](https://github.com/abreuse/decorator-pattern), qui lui, est un wrapper qui ajoute des comportements à une classe.

**Les plus :**
- Permet de convertir une interface qui semblait incompatible
- Il sert seulement de passerelle
- Découplage entre le client et l'adapté (il ne sait pas qu'il passe par un adapteur)
- Pas de changement de code dans le client
- Si l'adapté change, seul le code de l'adapteur change, le client n'est pas impacté

**Les moins :**
- Ne peut pas adapter des méthodes incompatibles avec le client (logique)

