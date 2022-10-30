## Scala pour le BigData

Ce projet est la compilation des notes de cours et exercices sur l'apprentissage 
du language `Scala` pour le Bigdata en utilisant l'ouvrage intitulé `Scala Programming for Big Data Analytics`
d' `Irfan Elahi`.

## Démarrer le projet

Veuillez suivre les étapes suivantes pour démarrer ce projet en local

[1] Commencez par récupérer le projet, déplacez-vous dans votre espace de travail puis taper la commande:
`git clone https://github.com/TemateuRoslyn/Scala_pour_Big_Data.git`.

[2] Ensuite déplacez-vous dans le projet: cd  `Scala_pour_Big_Data`.

[3] Pour compile ce projet, il faut se déplacer à la racine du projet et executer: `sbt clean compile`.

[4] Une fois le projet compilé, vous pourrer l' executer a chaque fois avec la commande: `sbt run`.

## Structuration du projet

Ce projet adopte une structure en module et tout se retrouve centralisé dans le fichier principal Main à
la racine du projet.

Il ya à disposition des classes de capture d'exceptions dans le dossier principale de gestion des exception.


## Les package du projet

Vous avez ici une  sorte de MVC avec des package à la place, voilà la liste de tous les packages:

`src/main/scala/exection`
`src/main/scala/logs`
`src/main/scala/modules`
`src/main/scala/ressources`
`src/main/scala/shared`

## Le package des modules

Ce projet contient un ensemble de module qui representent chaque chapitre du PDF de cette formation, la liste:

`src/main/scala/modules`

`src/main/scala/modules/chapter01`
`src/main/scala/modules/chapter02`
`src/main/scala/modules/chapter03`
`src/main/scala/modules/chapter04`
`src/main/scala/modules/chapter05`
`src/main/scala/modules/chapter06`
`src/main/scala/modules/chapter07`
`src/main/scala/modules/chapter08`
`src/main/scala/modules/chapter09`
`src/main/scala/modules/chapter10`
`src/main/scala/modules/chapter11`
`src/main/scala/modules/chapter12`
`src/main/scala/modules/chapter13`
`src/main/scala/modules/chapter14`

## Le package des Logs

Dans ce projet il est possible d'obtenir les logs chacun de module de ce projet.
les logs se trouve ici: 

`src/main/scala/logs`

`src/main/scala/logs/main_log.txt`
`src/main/scala/logs/chapter01_log.txt`
`src/main/scala/logs/chapter02_log.txt`
`src/main/scala/logs/chapter03_log.txt`
`src/main/scala/logs/chapter04_log.txt`
`src/main/scala/logs/chapter05_log.txt`
`src/main/scala/logs/chapter06_log.txt`
`src/main/scala/logs/chapter07_log.txt`
`src/main/scala/logs/chapter08_log.txt`
`src/main/scala/logs/chapter09_log.txt`
`src/main/scala/logs/chapter10_log.txt`
`src/main/scala/logs/chapter11_log.txt`
`src/main/scala/logs/chapter12_log.txt`
`src/main/scala/logs/chapter13_log.txt`
`src/main/scala/logs/chapter14_log.txt`

A chaque fois que vous lancerait la command: `sbt run`
Tous les fichiers de logs seront supprimés et il seront créees de nouveau à chaque fois que vous exécutérez le chapitre concerné

## Le package partagé

C'est un package qui contient des classes partagés a toute l'application

`src/main/scala/shared`

`src/main/scala/shared/CustomParent.scala`

## Le package des ressources

Ce package contient les constantes globales utilisables a l'échelle de l'application comme les noms des fichier de logs et les chemins d'access

`src/main/scala/ressources`

`src/main/scala/ressources/Constant.scala`

## Le package des execptions

Ce package contient toutes des classes d'exceptions personnalisées et utilisable à l'échelle de l'application:

`src/main/scala/exection`

`src/main/scala/exection/OutOfChoiceException.scala`

## Le package des  fichiers de scripts personnalisés

se sont des fichier scala qui seront chargés dans la console et dont le code sera 
exécuté qpres avoir été chargé:

`src/main/scala/scripts`

`src/main/scala/scripts/CustomCalc.scala`


