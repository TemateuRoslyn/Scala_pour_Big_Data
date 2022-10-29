package chapter04.exercices

import ressource.Log

import  shared.CustomParent


class ExerciceChapter04 extends CustomParent  {

  def run(): Unit =

    val message:       String = "\t From chapter 04 \n\nMessage: Maestros apprend le language scala"

    println("\n\nB - Exercice du chapitre 04 :")
    println("    -------------------------\n")

    writeLog(message, Log.chapter04_log_path)

    var d: Double = 12.355353543
    var dd: Double = d
    var i: Int = 122
    var ii: Int = dd.toInt
    d = i
    var a, b, c :Int = 12

    print("\n   1-) Cast Double -> Int : \n\tIci il ya cast implicite du type inferieur (Int) vers un type supperieu (Double)\n\t i= " + i + ", Double(i)=" + d + "\n\tCast Explicite: Double -> Int dd= "+ dd + ", Integer(dd)= "+ii)
    print("\n   2-) Le cast en exercie: \n\tVoir block precedent")
    print("\n   3-) Creer plusieur variable sur une meme instruction \n\tVoir plus haut dans le code. les valeurs sont: a= "+a+",b= "+b+" et c= "+c+"\n\n")

}