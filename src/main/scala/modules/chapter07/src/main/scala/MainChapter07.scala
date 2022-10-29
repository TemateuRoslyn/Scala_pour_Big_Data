package chapter07

import  chapter07.notes.NoteChapter07
import  chapter07.exercices.ExerciceChapter07

/**
  * @author Temateu Roslyn
  * @email temateuroslynf32@gmail.com
  */
class MainChapter07 {
  val message = "Hello from Chapter 07, I was compiled with Scala 3! :)"

  def run(): Unit =
    println("==================  Debut de l'execution du chapitre 07  ==========================\n")
    new NoteChapter07().run()
    new ExerciceChapter07().run()
    println("\n==================  Fin de l'execution du chapitre 07  ==========================")
}
