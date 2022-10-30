package scripts

class Something {
    def run(): Unit =
        println("Chargement du fichier CustomCalc... Okay")
}

def instanciat() : Unit =
    val some: Something = new Something()
    some.run()
