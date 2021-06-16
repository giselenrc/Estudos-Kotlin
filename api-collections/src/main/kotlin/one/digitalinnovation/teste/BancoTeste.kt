package one.digitalinnovation.teste

import one.digitalinnovation.digionebank.Banco

fun main(){
    val digiOneBank = Banco(nome="DigiOne",numero=12)
    println(digiOneBank.nome)
    println(digiOneBank.numero)

    val copiaBanco = digiOneBank.copy(nome="banco 2")
    println(copiaBanco.nome)
    println(copiaBanco.numero)
}