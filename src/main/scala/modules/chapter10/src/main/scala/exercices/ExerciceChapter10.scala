package chapter10.exercices

import scala.io.Source

import scala.collection.immutable.Range.Inclusive

import ressource.Constant

import  shared.CustomParent



class ExerciceChapter10 extends CustomParent  {

  def run(): Unit = {

    val message:       String = "\t From chapter 10 \n\nMessage: Maestros apprend le language scala"
  
    println("\n\nB - Exercice du chapitre 10 :")
    println("    -------------------------\n")
  
    writeLog(message, Constant.chapter10_log_path)
  
    println("\n  Chargement...\n")
    val chunkSize = 128 * 1024
    var life_occ: Int = 0
    val iterator = Source.fromFile(Constant.description_txt).getLines.grouped(chunkSize)
    iterator.foreach { lines => lines.map((line: String) => {
      life_occ += coundWordOccWileLoop(line, "vie")
      print(" \n\t\t" + line)
    }) }
  
    print("\n\n   1-) Fouille du fichier : "+Constant.description_txt+" Et Recherche du nombre d'occurence du mot `vie` \n\tOccurence (vie) = " +life_occ)
    
    print("\n   2-) Array odd items: \n\tResultat = \n\t")
    arrayOddItems()
  
  
    
    var a = 0
    var loop = (for(a <- 1 to 50) print(""+a+", "))

    print("\n   3-) Store for loop in variable: \n\tLe resultat : \n\t\tloop = (for(a <- 1 to 5) print(\"\"+a+\", \")) = " ) 
    loop
  
    // print("\n   4-) Augmenter la mémoire de scala ?: \n\tIl faut utiliser la variable JAVA_OPTS qui speciafie la taille de JVM utilise a la compilation\n\n")    
    println("\n\n")
  }


    /**
     * Cette fontion chercher une chaine dans une autres et compte le nombre d'occurence
     *
     * @param text
     * @param pattern
     * @return
     */
    def coundWordOccForLoop(text: String, pattern: String): Int = {
      var count: Int = 0
      for (rawWord <- text.split(" ")) {
              val word = rawWord.toLowerCase()
              if(word.equals(pattern.toLowerCase())) { count =count+1}
      }
      count
    }

  /**
   * Cette fontion chercher une chaine dans une autres et compte le nombre d'occurence
   *
   * @param text
   * @param pattern
   * @return
   */
  def coundWordOccWileLoop(text: String, pattern: String): Int = {

    var count: Int = 0
    val rawWord: Array[String] =  text.split(" ")
    var it = rawWord.size -1
    while (it>0) {
            val word = rawWord(it).toLowerCase()
            if(word.equals(pattern.toLowerCase())) { count =count+1}
            it-=1
    }
    count
  }

  def arrayOddItems(): Unit = {
    var it =0
    for(it <- 0 to 200) print("isOdd("+it+")="+isOdd(it)+", ")
  }

}