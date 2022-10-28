package modules

import chapter01.MainChapter01

import exceptions.OutOfChoiceException


class Main {

  /**
    * Cette methode est la principale de cette classe et permet de 
    * tester toutes les autres.
    */
  def run : Unit = 
    
    try {
        begin
    } catch {
        case ex : Throwable => println("Erreur: Une erreur inconue: Fin du programme... \n" + ex.getMessage())
    }



    /**
      * C'est cette fonction qui assure le scheduling entre les differents chapitres
      */
  def begin : Unit =
    var continue, chapter : Int =  1 
    while(continue == 1)
        print("\u001b[2J")
        showMenu
        try {
          println("\n Veuillez entrez le numero du chapitre que vous souhaitez interroger, Ex: 3")
          chapter = scala.io.StdIn.readInt()
          caseChapter(chapter)
          continue = continueEvaluation
        } catch {
            case ex : NumberFormatException => {
              begin
            }
        }



  /**
    * Cette fonction selectionne le numero du chapitre saisie et 
    *
    * @param chapter
    */      
  def caseChapter(chapter: Int = 1) : Unit =
    try {
      chapter match {
          case 1 => println(MainChapter01.run)
          case _ => throw new OutOfChoiceException("Ce chapitre n'est pas disponible")
      }
      println("Fin d'execution du chapitre  " + chapter)
    } catch {
      case ex : OutOfChoiceException => {
        println("Erreur : " + ex.getMessage())
      }
    }


   /**
     * Cette fonctiona un role atomique: Celui de demander a l'utilisateur s'il veut continuer l'evaluation
     * Et capture une exception si jamais on lui passe un nombre mal formate.
     *
     * @return
     */
  def continueEvaluation: Int = 
    try {
      var continue: Int = 1
      println("""Souhaitez-vous continuer les test : 
          -1- pour rentrez au menu principal
          -0- Pour arreter l'utilitaire de test""")
      continue = scala.io.StdIn.readInt()
      continue match {
        case 0  => return continue
        case 1  => return continue
        case _: Int => throw new OutOfChoiceException("Ce choix n'est pas disponible")
      }
      return continue
    } catch {
        case ex : NumberFormatException => continueEvaluation
        case ex : OutOfChoiceException => {
          println("Erreur : " + ex.getMessage())
          continueEvaluation
        }
    }



  /**
    * Cette methode affiche unmenu permettant de choisir le chapitre que
    * vous souhaitez utiliser orsque vous lancer le projet.
    */      
  def showMenu: Unit = 
    println("")
    printFillLine()
    printTabLine(2, 2,  "                                                                                                                   ")
    printTabLine(8, 8,  "Scala pour le Big Data")
    printTabLine(2, 2,  "Veuillez choisir le chapitre que vous souhaitez executer et n'oubliez pas : Arreter les tests : -0- continuer : -1-")
    printTabLine(2, 2,  "                                                                                                                   ")
    printFillLine()
    printTabLine(2, 2, "                                                                                                                   ")
    printTabLine(2, 13,  "Liste des chapitre dispo...")
    printTabLine(2, 13,  "===========================")
    printTabLine(2, 2, "                                                                                                                   ")
    printTabLine(2, 2, "                                                                                                                   ")
    printTabLine(3, 12,  "Chapitre 01: Scala Language")
    printTabLine(3, 12,  "Chapitre 02: Installation  ")
    printTabLine(3, 12,  "Chapitre 03: Scala Shell   ")
    printTabLine(3, 12,  "Chapitre 04: Variables     ")
    printTabLine(3, 12,  "Chapitre 05: Data Types    ")
    printTabLine(3, 11,  "Chapitre 06: Conditional Statements")
    printTabLine(3, 12,  "Chapitre 07: Code Blocks   ")
    printTabLine(3, 12,  "Chapitre 08: Functions     ")
    printTabLine(3, 12,  "Chapitre 09: Collections   ")
    printTabLine(3, 12,  "Chapitre 10: Loops         ")
    printTabLine(3, 11,  "Chapitre 11: Classes and Packages  ")
    printTabLine(3, 11,  "Chapitre 11: Exception Handling    ")
    printTabLine(3, 11,  "Chapitre 13: Building and Packaging")
    printTabLine(3, 11,  "Chapitre 14: Hello Apache Spark    ")
    printTabLine(2, 2, "                                                                                                                   ")
    printFillLine()
    println("")

    /**
      * Affiche une ligne remplie d'etoile suivant une longueur passee en paramtere
      *
      * @param lineSize
      */
  def printFillLine(lineSize : Int = 130) : Unit = 
    var i : Int = 1
    println()
    while(i < lineSize) 
        print("*")
        i+=1

        
  def printTabLine(leftSpace : Int = 10, rightSpace : Int = 10, someText: String = "") : Unit =  
    var i : Int = 1
    print("\n*")
    while(i < leftSpace)
        print("\t") 
        i+=1
    print(someText)
    i = 1
    while(i < rightSpace)
        print("\t") 
        i+=1
    print("*")


}