package shared

import java.io.{ File, FileOutputStream }

import ressource.Log

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
        val fos = new FileOutputStream(new File(Log.main_log_path))
        Console.withOut(fos) { println(consoleMessage) }
}