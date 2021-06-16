package one.digitalinnovation.teste

import one.digitalinnovation.digionebank.ClienteTipo




fun main(){
    ClienteTipo.values().forEach { elemento -> println("${elemento.name +" - "+ elemento.descricao}") }

    val pf = ClienteTipo.PF;
    println(pf.descricao)

    val pj = ClienteTipo.PJ;
    println(pj.descricao)
}
