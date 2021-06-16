package one.digitalinnovation.teste

import one.digitalinnovation.digionebank.Funcionario
import one.digitalinnovation.digionebank.Pessoa
import java.math.BigDecimal


fun main(){

    /*val gisele = Pessoa("Gisele","012.356.719-01")
    println(gisele.nome)
    println(gisele.cpf)*/

    val joao = Funcionario(nome="João",cpf = "123.456.789-01", BigDecimal.valueOf(5000))
    println(joao.nome)
    println(joao.cpf)
    println(joao.salario)
}