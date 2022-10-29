package chapter14

import  chapter14.notes.NoteChapter14
import  chapter14.exercices.ExerciceChapter14

/**
  * @author Temateu Roslyn
  * @email temateuroslynf32@gmail.com
  */
class MainChapter14 {
  val message = "Hello from Chapter 14, I was compiled with Scala 3! :)"

  def run(): Unit =
    println("==================  Debut de l'execution du chapitre 14  ==========================\n")
    new NoteChapter14().run()
    new ExerciceChapter14().run()
    println("\n==================  Fin de l'execution du chapitre 14  ==========================")
}
