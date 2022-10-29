package chapter13

import  chapter13.notes.NoteChapter13
import  chapter13.exercices.ExerciceChapter13

/**
  * @author Temateu Roslyn
  * @email temateuroslynf32@gmail.com
  */
class MainChapter13 {
  val message = "Hello from Chapter 13, I was compiled with Scala 3! :)"

  def run(): Unit =
    println("==================  Debut de l'execution du chapitre 13  ==========================\n")
    new NoteChapter13().run()
    new ExerciceChapter13().run()
    println("\n==================  Fin de l'execution du chapitre 13  ==========================")
}
