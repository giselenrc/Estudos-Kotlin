package one.digitalinnovation.digionebank

import java.math.BigDecimal

class Conta {
    val agencia: String=""
    val numero: String=""
    val saldo: BigDecimal= BigDecimal("2.40")

    fun deposito(valor:BigDecimal) {}

    fun saque(valor:BigDecimal){}


}