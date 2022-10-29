package chapter02

import  chapter02.notes.NoteChapter02
import  chapter02.exercices.ExerciceChapter02

/**
  * @author Temateu Roslyn
  * @email temateuroslynf32@gmail.com
  */
class MainChapter02 {
  val message = "Hello from Chapter 02, I was compiled with Scala 3! :)"

  def run(): Unit =
    println("==================  Debut de l'execution du chapitre 02  ==========================\n")
    new NoteChapter02().run()
    new ExerciceChapter02().run()
    println("\n==================  Fin de l'execution du chapitre 02  ==========================")
}