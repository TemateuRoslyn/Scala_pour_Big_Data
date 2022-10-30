package chapter12.exercices

import ressource.Constant

import  shared.CustomParent


class ExerciceChapter12 extends CustomParent  {

  def run(): Unit =

    val message:       String = "\t From chapter 12 \n\nMessage: Maestros apprend le language scala"

    println("\n\nB - Exercice du chapitre 12 :")
    println("    -------------------------\n")

    writeLog(message, Constant.chapter12_log_path)

    print("\n   1-) Capture d'execption: \n\tDans tout le projet une telle implementation a deja ete faite il sufit de se rendre dans le fichier: src/main/scala/modules/App.scala pour le voir en action")
    print("\n   2-) scala.util: \n\tEst un package qui fournit un eemble de classe utilitaire comme: Try, Success, Left, NotGiven")
    println("\n\n")

}