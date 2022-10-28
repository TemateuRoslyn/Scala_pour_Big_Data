package chapter01

import  chapter01.notes.NoteChapter01
import  chapter01.exercices.ExerciceChapter01
object MainChapter01 {
  val message = "Hello from Chapter 01, I was compiled with Scala 3! :)"

  def run: Unit =
    println("==================  Debut de l'execution du chapitre 01  ==========================\n")
    NoteChapter01.run
    ExerciceChapter01.run
    println("\n==================  Fin de l'execution du chapitre 01  ==========================")
}