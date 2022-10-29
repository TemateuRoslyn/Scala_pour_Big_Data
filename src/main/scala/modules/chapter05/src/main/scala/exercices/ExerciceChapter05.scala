package chapter05.exercices

import ressource.Log

import  shared.CustomParent


class ExerciceChapter05 extends CustomParent  {

  def run(): Unit =

    val message:       String = "\t From chapter 05 \n\nMessage: Maestros apprend le language scala"

    println("\n\nB - Exercice du chapitre 05 :")
    println("    -------------------------\n")

    writeLog(message, Log.chapter05_log_path)

    print("\n   1-) Limitation des type: \n\tLes paramètres de type sont effacés lors de l'exécution. Vous ne pouvez pas effectuer de vérifications \n\tde type à l'exécution sur les paramètres de type ou les types structurels. Il s'agit d'une zone constante \n\td'erreurs, car la correspondance de modèles encourage en fait les vérifications de type à l'exécution. \n\t(Vous recevez un avertissement, mais j'ai vu ceux-ci ignorés trop souvent).")
    print("\n   2-) Les fonctions disponible pour le type Int: \n\tList: MaxValue, MinValue, box, int2double, int2float, int2long, toString, unbox...")
    print("\n   3-) Priorite sur les operateurs ?: \n\tSoit l'expressions suivantes: e = a + b * c / d; \n\tLe resulta: \n\t\tstep 1: 20 + (10 * 15) /5 \n\t\tstep 2: 20 + (150 /5) \n\t\tstep 3:(20 + 30) \n\te = a + b * c / d = " + (20 + (10 * 15) /5))
    print("\n   4-) Les operateurs en scala: \n\tList: \n\t\t&&	It is called Logical AND operator. If both the operands are non zero then condition becomes true.	(A && B) is false.\n\t\t||	It is called Logical OR Operator. If any of the two operands is non zero then condition becomes true.	(A || B) is true.\n\t\t!	It is called Logical NOT Operator. Use to reverses the logical state of its operand. If a condition is true then Logical NOT operator will make false.	!(A && B) is true.")
    print("\n   5-) Assigner une valeur booleen a un entier: \n\tResultat : \n\t\tFound:    (bool : Boolean) \n\t\tRequired: Int")
    print("\n   6-) Additionner deux booleen: \n\tResultat : \n\t\tvalue + is not a member of Boolean, but could be made available as an extension method.")
    print("\n   7-) String. + tab: \n\tLes commandes disponibles : \n\t\tproduct, seq, self, tails, toShort, toStream... .")
    print("\n   8-) Conversion type numeric ou Boolean vers String: \n\tSolution : \n\t\tChacun des types cites plus haut possede une methode toString() donc la convertion est aise.")
    print("\n   9-) Convertion Double -> Int: \n\tProbleme : \n\t\tPerte de la precision du double (Toute la partie decimale s'en va).")
    print("\n   10-) Convertion String -> Int: \n\tSolution : \n\t\t \"10\".toInt="+"10".toInt)
    print("\n   10-) Utilisation de Some et None:\n")

    val p1:Person = null 
    val optionalPerson:Option[Person] = Option(p1)

    val stringValue2= optionalPerson match {
            case Some(s) => s.toString()
            case None => "La source est null"
    }

    println(stringValue2)

    // une approche pour acceder a un champ d'un element Null
    val person = optionalPerson.getOrElse(Person.DEFAULT_PERSON)
    println(person.toString())

}

case class Person(firstName:String,lastName:String)
object Person{
    val DEFAULT_PERSON= Person("DEFAULT_PERSON_FIRST_NAME","DEFAULT_PERSON_LAST_NAME")
}