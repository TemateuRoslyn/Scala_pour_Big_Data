package chapter03

import  chapter03.notes.NoteChapter03
import  chapter03.exercices.ExerciceChapter03
object MainChapter03 {
  val message = "Hello from Chapter 03, I was compiled with Scala 3! :)"

  def run: Unit =
    println("==================  Debut de l'execution du chapitre 03  ==========================\n")
    NoteChapter03.run
    ExerciceChapter03.run
    println("\n==================  Fin de l'execution du chapitre 03  ==========================")
}