# Compte Rendu du TP 1 : Patrons de Conceptions

Noms des étudiants du binôme : Rémi Brand - Matéo Lange

## Exercices 1
> Ce modèle correspond au pattern Composite. 
>
> Il n'est pas nécessaire de réécrire les méthodes `getVelocity()` et `getMass()` pour la nouvelle classe `TagAlongBike` car tous les composants implémentent déjà l'interface `MobileObject`.

## Exercices 2
> La méthode `getVelocity()` utilise le pattern Iterator pour parcourir les composants d'un véhicule. Ce pattern permet de parcourir une collection d'objets sans exposer la structure interne de la collection. Il permet de parcourir les composants d'un véhicule sans se soucier de la structure de données utilisée pour les stocker.
>
> Il n'est pas nécessaire de modifier la réalisation de la méthode `getVelocity()` car Set et List implémentent tous les deux l'interface Collection qui est utilisée par l'itérateur.

## Exercices 3
> Le constructeur de la classe `Clock` est privé pour empêcher l'instanciation de la classe en dehors de la classe elle-même. La méthode `getInstance()` permet de récupérer l'instance unique de la classe `Clock`. Si l'instance n'existe pas, elle est créée. Sinon, l'instance existante est retournée. Ainsi, il n'y a qu'une seule instance de la classe `Clock` dans l'application.

## Exercices 4
> Les classes `Bike` et `Wheel` n'appartiennent pas au même paquetage. C'est une dépendance cyclique entre les deux classes. Cette dépendance n'adhère pas aux bonnes pratiques de conception.
>
> La classe `Wheel` utilise la méthode `getPush` de la classe `Bike`. La classe `Vehicle` est une abstraction de la classe `Bike` qui isole cette fonctionnalité, présente dans le paquetage transport.
>
> Pour casser la dépendance cyclique entre les classes `Bike` et `Wheel`, on peut utiliser la classe abstraite `Vehicle` qui isole la fonctionnalité de la classe `Bike` utilisée par la classe `Wheel`. La classe `Wheel` n'aura plus besoin de référence à la classe `Bike` pour obtenir l'effort appliqué. Ainsi, la dépendance cyclique entre les deux classes est cassée.

## Exercices 5
>

## Exercices 6

## Exercices 7

## Exercices 8


