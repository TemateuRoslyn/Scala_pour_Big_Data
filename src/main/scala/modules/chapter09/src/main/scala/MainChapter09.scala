package chapter09

import  chapter09.notes.NoteChapter09
import  chapter09.exercices.ExerciceChapter09

/**
  * @author Temateu Roslyn
  * @email temateuroslynf32@gmail.com
  */
class MainChapter09 {
  val message = "Hello from Chapter 09, I was compiled with Scala 3! :)"

  def run(): Unit =
    println("==================  Debut de l'execution du chapitre 09  ==========================\n")
    new NoteChapter09().run()
    new ExerciceChapter09().run()
    println("\n==================  Fin de l'execution du chapitre 09  ==========================")
}
