package chapter09.exercices

import scala.io.Source

import ressource.Constant

import  shared.CustomParent


class ExerciceChapter09 extends CustomParent  {

  def run(): Unit =

    val message:       String = "\t From chapter 09 \n\nMessage: Maestros apprend le language scala"

    println("\n\nB - Exercice du chapitre 09 :")
    println("    -------------------------\n")

    writeLog(message, Constant.chapter09_log_path)

    val numbers = List(32, 95, 24, 21, 17)
    val mapedNumbers: List[Boolean] = numbers.map((number: Int) => isEven(number))
    print("\n   1-) Creation d'une liste d'entiers: \n\tEvenFuntioin (List =  List(32, 95, 24, 21, 17)) = " + mapedNumbers + "\n")


    val names: List[String] = List("Maestros", "Roslyn", "Temateu", "Merveilles", "Marvel", "Nelz")
    val extrectedNames: List[String] = names.map((name: String) => extractCharacter(name))
    print("\n   2-) Extraction du premier et du dernier caractere de chaque elm: \n\tExtract(List(\"Maestros\", \"Roslyn\", \"Temateu\", \"Merveilles\", \"Marvel\", \"Nelz\")) = " + extrectedNames)
    
    
    print("\n   3-) Charger un fichier scala: \n\tChargement du fichier: "+Constant.custom_calc_path+" \n\tResultat =\n")
    
    val chunkSize = 128 * 1024
    val file_lines = ""
    val iterator = Source.fromFile(Constant.custom_calc_path).getLines.grouped(chunkSize)
        iterator.foreach { lines => lines.map((line: String) => print(" \n\t\t" + line))
    }

    println("\n\n")

    


  def isEven(number: Int) = number % 2 == 0

  def isOdd(number: Int) = !isEven(number)

  def extractCharacter(item: String): String = "".appended(item.charAt(0)).appended(item.charAt(item.length()-1))
}