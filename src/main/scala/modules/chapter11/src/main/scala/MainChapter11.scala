package chapter11

import  chapter11.notes.NoteChapter11
import  chapter11.exercices.ExerciceChapter11

/**
  * @author Temateu Roslyn
  * @email temateuroslynf32@gmail.com
  */
class MainChapter11 {
  val message = "Hello from Chapter 11, I was compiled with Scala 3! :)"

  def run(): Unit =
    println("==================  Debut de l'execution du chapitre 11  ==========================\n")
    new NoteChapter11().run()
    new ExerciceChapter11().run()
    println("\n==================  Fin de l'execution du chapitre 11  ==========================")
}
