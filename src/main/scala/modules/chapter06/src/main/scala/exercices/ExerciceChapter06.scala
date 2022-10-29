package chapter06.exercices

import ressource.Log

import  shared.CustomParent


class ExerciceChapter06 extends CustomParent  {

  def run(): Unit =

    val message:       String = "\t From chapter 06 \n\nMessage: Maestros apprend le language scala"

    println("\n\nB - Exercice du chapitre 06 :")
    println("    -------------------------\n")

    writeLog(message, Log.chapter06_log_path)

    print("\n   1-) Utilisation de la tabulation: \n\tDans le cas des entiers ou des chaine, la tabulation permet d'avoir toute les information sur le type d'une variale.")
    print("\n   2-) Exemple de commade: \n\t:sh  Ex: :sh ls -al \n\t:load Ex: :load /path/to/file")
    print("\n   3-) spark-shell ?: \n\tLes commandes son disponibles sur spark-shell egalement.")
    print("\n   4-) Augmenter la mémoire de scala ?: \n\tIl faut utiliser la variable JAVA_OPTS qui speciafie la taille de JVM utilise a la compilation\n\n")    

}