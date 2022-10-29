package chapter06

import  chapter06.notes.NoteChapter06
import  chapter06.exercices.ExerciceChapter06

/**
  * @author Temateu Roslyn
  * @email temateuroslynf32@gmail.com
  */
class MainChapter06 {
  val message = "Hello from Chapter 06, I was compiled with Scala 3! :)"

  def run(): Unit =
    println("==================  Debut de l'execution du chapitre 06  ==========================\n")
    new NoteChapter06().run()
    new ExerciceChapter06().run()
    println("\n==================  Fin de l'execution du chapitre 06  ==========================")
}
