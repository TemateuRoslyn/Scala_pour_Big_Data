package chapter08.exercices

import ressource.Constant

import  shared.CustomParent


class ExerciceChapter08 extends CustomParent  {

  def run(): Unit =

    val message:       String = "\t From chapter 08 \n\nMessage: Maestros apprend le language scala"

    println("\n\nB - Exercice du chapitre 08 :")
    println("    -------------------------\n")

    writeLog(message, Constant.chapter08_log_path)

    print("\n   2-) Fonctoin/Method en scala : \n\t une fonction ecrite dans dans le cadre d'une classe et accesible a toute les instances\n\t de la classe est une methode")
    print("\n   3-) Exemple d'une fonction recurssive: \n\t Factoriel 7 = "+ factoriel(7))
    print("\n   4-) Exemple d'une fonction local: \n\t Factoriel 7 = "+ factorielWrapper(7))
    print("\n   5-) Parametre par Reference/Valeur en scala: \n\t " + """
                > Java et Scala utilisent exclusivement l'appel par valeur, sauf que la valeur est soit une primitive, soit un 
                pointeur vers un objet. Si votre objet contient des champs modifiables, il y a alors très peu de différence 
                substantielle entre ceci et l'appel par référence.
                
                > Puisque vous passez toujours des pointeurs vers des objets et non vers les objets eux-mêmes, vous n'avez pas 
                le problème d'avoir à copier à plusieurs reprises un objet géant.
                
                > Incidemment, l'appel par nom de Scala est implémenté en utilisant l'appel par valeur, la valeur étant un 
                (pointeur vers un) objet fonction qui renvoie le résultat de l'expression.""")
  print("\n  6-) Meilleur pratique d'ecriture de fonction: \n\t Les fonction doivent executer une seule tache")

  def factoriel(n: Int = 2): Int =
    if(n == 0 || n == 1) n
    else n * factoriel(n-1)
  
  def factorielWrapper(i: Int): Int =
      def fact(i: Int, accumulator: Int): Int = {
         if (i <= 1)
            accumulator
         else
            fact(i - 1, i * accumulator)
      }
      fact(i, 1)

}