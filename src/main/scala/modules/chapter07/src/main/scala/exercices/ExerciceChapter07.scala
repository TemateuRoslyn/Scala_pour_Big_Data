package chapter07.exercices

import ressource.Log

import  shared.CustomParent


class ExerciceChapter07 extends CustomParent  {

  def run(): Unit =

    val message:       String = "\t From chapter 07 \n\nMessage: Maestros apprend le language scala"

    println("\n\nB - Exercice du chapitre 07 :")
    println("    -------------------------\n")

    writeLog(message, Log.chapter07_log_path)

    val res = {
      val age = 27
      val name = "Maestros"
      name + " a " + age
    }


    print("\n   1-) Cas d'utilisation des blobks de code: \n\t" + """
    val res = {
      val age = 27
      val name = "MAestros"
      name + " a " + age
    }
    
    val = """ + res)
}