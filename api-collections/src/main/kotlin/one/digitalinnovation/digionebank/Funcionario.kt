package one.digitalinnovation.digionebank

import java.math.BigDecimal

abstract class Funcionario( override var nome: String,
                            override var cpf: String,
                            val salario: BigDecimal): Pessoa()
{
    abstract fun calculoAuxilio()
}