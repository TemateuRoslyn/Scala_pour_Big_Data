package chapter03.exercices

import java.io.{File, FileOutputStream}
import ressource.Log

object ExerciceChapter03 {

  def run: Unit =

    val message:       String = "\t From chapter 03 \n\nMessage: Maestros apprend le language scala"

    println("\n\nB - Exercice du chapitre 03 :")
    println("    -------------------------\n")
    
    writeLog(Log.chapter03_log_path, message)

    // print("\n   1-) Définition de mot clés: \n\tJVM: JAVA VIRTUAL MACHINE \n\tJRE: JAVA RUNTIME ENVIRONNMENT \n\tJDK: JAVA DEVELOPMENT KIT \n\tBytecode: Code executable par une JVM")
    // print("\n   2-) Pourquoi Scala a été dévéloppé: \n\tA la base Scala a été dévéloppé pour concurrencer Java qui était très lent.")
    // print("\n   3-) Apache Spark ?: \n\tC'est un framework open source de calcul distribué. et aujourd'hui partie intégrante de la fondation Apache.")
    // print("\n   4-) Les cas d'usage du Big Data ?: \n\t- Les grosses bases de données.\n\t- Les dispositifs informatiques et plus largement les technologies utilisées pour gérer les gros volumes de données.\n\t- L'historique du Big Data\n\t- Développer le chiffre d'affaire: mieux annalyser les incidents causés pour anticiper l'avenir")
    // print("\n   5-) Les cas d'application de Scala ?: \n\t- Traitement de l'infomation.\n\t- Informatique distribué.\n\t- Développement Web")
    // print("\n   6-) Les produits développés en Scala ?: \n\t- Le backend de la plateforme Coursera")
    // print("\n   7-) Les performances de Python ?: \n\t- Il faut savoir que Python est un langage dit « interprété ». Cela veut dire que votre \n\tcode est transmis d’abord à une machine virtuelle connue sous le nom d’interpréteur de bytecode, avant d’être compilé.\n\t- De plus, Python stocke ses attributs dans un dictionnaire. \n\t- Enfin, il faut savoir que Python est peu favorable au multithreading\n\n")
    
  def writeLog(path: String = "", consoleMessage: String = "Default console message from chapter 03") =
    val fos = new FileOutputStream(new File(path))
    Console.withOut(fos) { println(consoleMessage) }
}