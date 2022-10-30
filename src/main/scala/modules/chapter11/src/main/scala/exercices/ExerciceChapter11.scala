package chapter11.exercices

import java.time.format.DateTimeFormatter

import ressource.Constant

import  shared.CustomParent


class ExerciceChapter11 extends CustomParent  {

  def run(): Unit =

    val message:       String = "\t From chapter 11 \n\nMessage: Maestros apprend le language scala"

    println("\n\nB - Exercice du chapitre 11 :")
    println("    -------------------------\n")

    writeLog(message, Constant.chapter11_log_path)

    val dateTimeString = "2020-08-20 05:22:45"
    val formatterDateTime = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss")
    val dateString = "2020/08/20"
    val formatterDate = DateTimeFormatter.ofPattern("yyyy/MM/dd")
    val dateString2  = "20 Aug 21"
    val formatterDate2 = DateTimeFormatter.ofPattern("dd MMM yy")



    print("\n   1-) Formatage de date: \n\t 2020-08-20 05:22:45 == " + formatterDateTime + "\n\t\t 2020/08/20 = " +dateString)
    print("\n   2-) Specification linux: \n\t les packages sont bien detailles")
    print("\n   3-) Maven repository: \n\n\tMaven: \n\t" +"""
        Maven est un outil de gestion de build/projet. Elle privilégie « la convention plutôt que la configuration » ; 
        il peut grandement simplifier les constructions pour les projets "standards" et un utilisateur Maven peut généralement 
        comprendre la structure d'un autre projet Maven simplement en regardant son pom.xml (Project Object Model). 
        Maven est une architecture basée sur des plugins, ce qui facilite l'ajout de nouvelles bibliothèques et modules 
        à des projets existants. Par exemple, l'ajout d'une nouvelle dépendance implique généralement seulement 5 lignes 
        supplémentaires dans le pom.xml. Ces « artefacts » sont téléchargés à partir de référentiels tels que le référentiel central.
        """ + "\n\t Utilisation de maven avec scala : \n\t" + """
        Nous utiliserons le plugin Scala Maven (dépôt GitHub, site Web) (anciennement connu sous le nom de maven-scala-plugin ; 
        renommé pour honorer la nouvelle politique de dénomination où seuls les plugins principaux de Maven sont préfixés par "maven"),
        de loin le dominant plugin pour les projets Scala. Remarque : le plugin inclut Scala du référentiel central, il n'est donc 
        pas nécessaire de l'installer vous-même si vous compilez avec Maven.

        """)

        println("\n\n")

}