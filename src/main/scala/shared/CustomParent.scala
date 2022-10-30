package shared

import java.io.{ File, FileOutputStream }

import ressource.Constant

/**
  * @author Temateu Roslyn
  * @email temateuroslynf32@gmail.com
  */
class CustomParent {

    var log: String = ""

    /**
     * Cette fonction capture tout les ligne ecrites sur une seule avec retour a la ligne, les sauvegarde dans les logs 
     * avant de les afficher dans la console
     *
     * @param message
     */
    def customPrintln(message: String = "") : Unit =
        log+=message+"\n"
        println(message)

    /**
     * Cette fonction capture tout les ligne ecrites sur une seule ligne les sauvegarde dans les logs 
     * avant de les afficher dans la console
     *
     * @param message
     */
    def customPrint(message: String = "") : Unit =
        log+=message+"\n"
        print(message)

    /**
     * Cette fonction permet d'ecrire toutes les logs de l'application dans le fichier se trouvant au chemin:
     *          ==============   src/main/scala/logs/main_log.txt  ================
     *
     * @param consoleMessage
     */
    def writeMainLog(consoleMessage: String = ""): Unit =
        val fos = new FileOutputStream(new File(Constant.main_log_path))
        Console.withOut(fos) { println(consoleMessage) }



    /**
     * Cette fonction permet d'ecrire toutes les logs de l'application dans le fichier specifie:
     *          ==============   src/main/scala/logs/filename.txt  ================
     *
     * @param consoleMessage
     */
    def writeLog(consoleMessage: String = "", filename: String = ""): Unit =
        val fos = new FileOutputStream(new File(filename))
        Console.withOut(fos) { println(consoleMessage) }
    


    /**
     * Cette fontion chercher une chaine dans une autres et compte le nombre d'occurence
     *
     * @param text
     * @param pattern
     * @return
     */
    def coundWordOcc(text: String, pattern: String): Int = 
        var count: Int = 0
        for (rawWord <- text.split(" ")) {
                val word = rawWord.toLowerCase()
                if(word.equals(pattern.toLowerCase())) { count =count+1}
        }
        count

    /**
      * Evalue si un nombre est pair
      *
      * @param number
      * @return
      */
    def isEven(number: Int) = number % 2 == 0

    /**
      * Evalue si un nombre est impair
      *
      * @param number
      * @return
      */
    def isOdd(number: Int) = !isEven(number)
}