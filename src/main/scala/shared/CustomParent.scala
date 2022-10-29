package shared

class CustomParent {

    var log: String = ""

    def customPrintln(message: String = "") : Unit =
        log+=message+"\n"
        println(message)

    def customPrint(message: String = "") : Unit =
        log+=message+"\n"
        print(message)
}