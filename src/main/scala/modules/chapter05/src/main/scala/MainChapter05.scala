package chapter05

import  chapter05.notes.NoteChapter05
import  chapter05.exercices.ExerciceChapter05

/**
  * @author Temateu Roslyn
  * @email temateuroslynf32@gmail.com
  */
class MainChapter05 {
  val message = "Hello from Chapter 05, I was compiled with Scala 3! :)"

  def run(): Unit =
    println("==================  Debut de l'execution du chapitre 05  ==========================\n")
    new NoteChapter05().run()
    new ExerciceChapter05().run()
    println("\n==================  Fin de l'execution du chapitre 05  ==========================")
}
