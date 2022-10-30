package chapter09.exercices

import scala.io.Source

import scala.collection.mutable.ArrayBuffer

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
    iterator.foreach { lines => lines.map((line: String) => print(" \n\t\t" + line)) }
  
    print("\n   4-) Apprend two list: \n\t List(1,2,3) +  List(4,5,6) = "+(List(1,2,3) ++ List(4,5,6)))

    print("\n   5-) .mkString en action: \n\t List(\"Maestros\", \"Roslyn\", \"Temateu\", \"Merveilles\", \"Marvel\", \"Nelz\").mkString(\" \") = "+names.mkString(" "))
    
    var name = ArrayBuffer[String]() 
    name += "Genius Classrooms"
    name += "Maestros"
    name += "Roslyn"

    print("\n   6-) Utilisation d'un araayBuffer comme collection mutable: \n\t name = " + name )
    print("\n   7-) Array vs List: \n\t Resultat: \n\t\t" + """
                La collection List Scala est une structure de données récursive immuable qui est une structure si fondamentale dans Scala que vous devriez 
                (probablement) l'utiliser beaucoup plus qu'un tableau (qui est en fait mutable - l'analogue immuable de Array est IndexedSeq).

                Si vous venez d'un arrière-plan Java, le parallèle évident est de savoir quand utiliser LinkedList sur ArrayList. 
                Le premier est généralement utilisé pour les listes qui ne sont jamais parcourues (et dont la taille n'est pas connue à l'avance) 
                tandis que le second doit être utilisé pour les listes qui ont une taille connue (ou taille maximale) ou pour lesquelles un accès 
                aléatoire rapide est important.
                """ )

                
    print("\n   8-) Vector vs List: \n\t Resultat: \n\t\t" + """
                En règle générale, utilisez par défaut Vector. C'est plus rapide que List pour presque tout et plus économe en 
                mémoire pour les séquences de taille plus grande que triviale. Voir cette documentation sur les performances 
                relatives de Vector par rapport aux autres collections. Il y a quelques inconvénients à utiliser Vector. Spécifiquement:

                Les mises à jour en tête sont plus lentes que la liste (mais pas autant que vous pourriez le penser)
                Un autre inconvénient avant Scala 2.10 était que la prise en charge de la correspondance de modèle était meilleure 
                pour List, mais cela a été corrigé dans 2.10 avec des extracteurs +: et :+ généralisés.

                Il y a aussi une manière plus abstraite, algébrique, d'aborder cette question : quelle sorte de séquence avez-vous 
                conceptuellement ? Aussi, qu'en faites-vous conceptuellement? Si je vois une fonction qui renvoie une Option[A], 
                je sais que cette fonction a des trous dans son domaine (et est donc partielle). Nous pouvons appliquer cette 
                même logique aux collections.

                Si j'ai une séquence de type List[A], j'affirme effectivement deux choses. Premièrement, mon algorithme (et mes données)
                est entièrement structuré en pile. Deuxièmement, j'affirme que les seules choses que je vais faire avec cette collection 
                sont des traversées complètes en O(n). Ces deux-là vont vraiment de pair. Inversement, si j'ai quelque chose de type 
                Vector[A], la seule chose que j'affirme est que mes données ont un ordre bien défini et une longueur finie. Ainsi, 
                les assertions sont plus faibles avec Vector, ce qui conduit à sa plus grande flexibilité.
                """ )
    
    println("\n\n")



  def extractCharacter(item: String): String = "".appended(item.charAt(0)).appended(item.charAt(item.length()-1))
}