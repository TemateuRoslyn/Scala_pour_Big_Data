package chapter06.exercices

import ressource.Constant

import  shared.CustomParent


class ExerciceChapter06 extends CustomParent  {

  def run(): Unit =

    val message:       String = "\t From chapter 06 \n\nMessage: Maestros apprend le language scala"

    println("\n\nB - Exercice du chapitre 06 :")
    println("    -------------------------\n")

    writeLog(message, Constant.chapter06_log_path)

    val carBudget = 70
    if (carBudget < 30) {
        print("\n   1-) Buget < 30: \n\tDecision: Buy Toyota.")
    } else if (carBudget > 30 & carBudget < 50) {
      print("\n   1-) Buget > 30: \n\tDecision: Buy Mazda.")
    } else if (carBudget > 50) {
      print("\n   1-) Buget > 30: \n\tDecision: Buy BMW.")
    }

    print("\n   2-) Assignation d'un block if/else a une variable: \n\tResultat :\n ")

    val (x,y) = if (false) (Some(42), None) else (None, Some(17))
    println(x.map(_ + 1).orElse(y.map(_ * 2)))

    print("\n   3-) Patter MAtching dans les expressions regulieres: \n\tLe pattern: ([a-cA-C]), le mot: Christian ")

    val word: String = "Christian"

    val Pattern = "([a-cA-C])".r
    word.charAt(0) match {
      case Pattern(c) => println("\n\t   L'expression match bien")
      case _ => println("\n\t   Pas de correspondance")
    }

    println("\n\n")


}