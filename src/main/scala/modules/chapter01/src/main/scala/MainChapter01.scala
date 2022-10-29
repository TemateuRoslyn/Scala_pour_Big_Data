package chapter01

import  chapter01.notes.NoteChapter01
import  chapter01.exercices.ExerciceChapter01



/**
  * @author Temateu Roslyn
  * @email temateuroslynf32@gmail.com
  */
class MainChapter01 {
  val message = "Hello from Chapter 01, I was compiled with Scala 3! :)"

  def run(): Unit =
    println("==================  Debut de l'execution du chapitre 01  ==========================\n")
    new NoteChapter01().run()
    new ExerciceChapter01().run()
    println("\n==================  Fin de l'execution du chapitre 01  ==========================")
}