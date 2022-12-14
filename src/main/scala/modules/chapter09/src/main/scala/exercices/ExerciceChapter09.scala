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
                La collection List Scala est une structure de donn??es r??cursive immuable qui est une structure si fondamentale dans Scala que vous devriez 
                (probablement) l'utiliser beaucoup plus qu'un tableau (qui est en fait mutable - l'analogue immuable de Array est IndexedSeq).

                Si vous venez d'un arri??re-plan Java, le parall??le ??vident est de savoir quand utiliser LinkedList sur ArrayList. 
                Le premier est g??n??ralement utilis?? pour les listes qui ne sont jamais parcourues (et dont la taille n'est pas connue ?? l'avance) 
                tandis que le second doit ??tre utilis?? pour les listes qui ont une taille connue (ou taille maximale) ou pour lesquelles un acc??s 
                al??atoire rapide est important.
                """ )

                
    print("\n   8-) Vector vs List: \n\t Resultat: \n\t\t" + """
                En r??gle g??n??rale, utilisez par d??faut Vector. C'est plus rapide que List pour presque tout et plus ??conome en 
                m??moire pour les s??quences de taille plus grande que triviale. Voir cette documentation sur les performances 
                relatives de Vector par rapport aux autres collections. Il y a quelques inconv??nients ?? utiliser Vector. Sp??cifiquement:

                Les mises ?? jour en t??te sont plus lentes que la liste (mais pas autant que vous pourriez le penser)
                Un autre inconv??nient avant Scala 2.10 ??tait que la prise en charge de la correspondance de mod??le ??tait meilleure 
                pour List, mais cela a ??t?? corrig?? dans 2.10 avec des extracteurs +: et :+ g??n??ralis??s.

                Il y a aussi une mani??re plus abstraite, alg??brique, d'aborder cette question : quelle sorte de s??quence avez-vous 
                conceptuellement ? Aussi, qu'en faites-vous conceptuellement? Si je vois une fonction qui renvoie une Option[A], 
                je sais que cette fonction a des trous dans son domaine (et est donc partielle). Nous pouvons appliquer cette 
                m??me logique aux collections.

                Si j'ai une s??quence de type List[A], j'affirme effectivement deux choses. Premi??rement, mon algorithme (et mes donn??es)
                est enti??rement structur?? en pile. Deuxi??mement, j'affirme que les seules choses que je vais faire avec cette collection 
                sont des travers??es compl??tes en O(n). Ces deux-l?? vont vraiment de pair. Inversement, si j'ai quelque chose de type 
                Vector[A], la seule chose que j'affirme est que mes donn??es ont un ordre bien d??fini et une longueur finie. Ainsi, 
                les assertions sont plus faibles avec Vector, ce qui conduit ?? sa plus grande flexibilit??.
                """ )
    
    println("\n\n")



  def extractCharacter(item: String): String = "".appended(item.charAt(0)).appended(item.charAt(item.length()-1))
}