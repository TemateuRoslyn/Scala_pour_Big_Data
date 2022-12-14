package chapter02.exercices

import ressource.Constant

import  shared.CustomParent
class ExerciceChapter02 extends CustomParent {

  def run(): Unit =
    val message:       String = "\t From chapter 03 \n\nMessage: Maestros apprend le language scala"


    println("\n\nB - Exercice du chapitre 02 :")
    println("    -------------------------\n")

    writeLog(message, Constant.chapter02_log_path)

    print("\n   1-) Installer Scala sur Linux sans Connexion: \n\t- Pour ce faire il suffit d'avoir l'archive de sbt a disposition puis de la \n\tdécompresser dans votre répertoire de travail")
    print("\n   2-) scala -help: \n\tAffiche dans la console toute les commandes accessible via le REPL.")
    print("\n   3-) Plusieur version de scala ?: \n\t- Oui c'est possible, Exemple d'installation: cs install scala:2.11.12.")
    print("\n   4-) Changement apportes dans la dernière version de Scala ?: \n\t- La Syntaxe: \n\t\t> Nouveau mot clé: `optional` \n\t\t> Nouvelle syntaxe pour les structure de control \n\t- Programmation Orientéé Object: \n\t\t> Plan pour l'heritage \n\t\t> Compostion sur l'Héritage \n\t\t> Cacher les details de l'implementation\n\n")
}