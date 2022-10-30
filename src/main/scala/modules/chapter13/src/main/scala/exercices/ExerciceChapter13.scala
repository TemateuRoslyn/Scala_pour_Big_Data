package chapter13.exercices

import ressource.Constant

import  shared.CustomParent


class ExerciceChapter13 extends CustomParent  {

  def run(): Unit =

    val message:       String = "\t From chapter 13 \n\nMessage: Maestros apprend le language scala"

    println("\n\nB - Exercice du chapitre 13 :")
    println("    -------------------------\n")

    writeLog(message, Constant.chapter13_log_path)

    print("\n   1-) Cree un Projet : Fait")
    print("\n   2-) Installer SBT sur une machine linux : Fait")
    print("\n   3-) Changer les configs sbt: \n\tCommande: sbt -J-Xmx4G -J-Xms4G")
    print("\n   3-) Fat JAR: \n\tDefinition: \n\t" + """
                Le fat jar est le jar, qui contient les classes de toutes les bibliothèques, dont dépend votre projet et, 
                bien sûr, les classes du projet en cours.
                Dans différents systèmes de construction, le fat jar est créé différemment, par exemple, dans Gradle, on le créerait
                """)  
  println("\n\n")

}