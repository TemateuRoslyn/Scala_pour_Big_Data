package chapter04

import  chapter04.notes.NoteChapter04
import  chapter04.exercices.ExerciceChapter04

/**
  * @author Temateu Roslyn
  * @email temateuroslynf32@gmail.com
  */
class MainChapter04 {
  val message = "Hello from Chapter 04, I was compiled with Scala 3! :)"

  def run(): Unit =
    println("==================  Debut de l'execution du chapitre 04  ==========================\n")
    new NoteChapter04().run()
    new ExerciceChapter04().run()
    println("\n==================  Fin de l'execution du chapitre 04  ==========================")
}
