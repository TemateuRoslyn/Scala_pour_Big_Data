package chapter12

import  chapter12.notes.NoteChapter12
import  chapter12.exercices.ExerciceChapter12

/**
  * @author Temateu Roslyn
  * @email temateuroslynf32@gmail.com
  */
class MainChapter12 {
  val message = "Hello from Chapter 12, I was compiled with Scala 3! :)"

  def run(): Unit =
    println("==================  Debut de l'execution du chapitre 12  ==========================\n")
    new NoteChapter12().run()
    new ExerciceChapter12().run()
    println("\n==================  Fin de l'execution du chapitre 12  ==========================")
}
