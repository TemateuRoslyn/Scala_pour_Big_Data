package chapter10

import  chapter10.notes.NoteChapter10
import  chapter10.exercices.ExerciceChapter10

/**
  * @author Temateu Roslyn
  * @email temateuroslynf32@gmail.com
  */
class MainChapter10 {
  val message = "Hello from Chapter 10, I was compiled with Scala 3! :)"

  def run(): Unit =
    println("==================  Debut de l'execution du chapitre 10  ==========================\n")
    new NoteChapter10().run()
    new ExerciceChapter10().run()
    println("\n==================  Fin de l'execution du chapitre 10  ==========================")
}
