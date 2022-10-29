package chapter08

import  chapter08.notes.NoteChapter08
import  chapter08.exercices.ExerciceChapter08

/**
  * @author Temateu Roslyn
  * @email temateuroslynf32@gmail.com
  */
class MainChapter08 {
  val message = "Hello from Chapter 08, I was compiled with Scala 3! :)"

  def run(): Unit =
    println("==================  Debut de l'execution du chapitre 08  ==========================\n")
    new NoteChapter08().run()
    new ExerciceChapter08().run()
    println("\n==================  Fin de l'execution du chapitre 08  ==========================")
}
