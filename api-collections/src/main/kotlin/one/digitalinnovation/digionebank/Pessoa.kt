package one.digitalinnovation.digionebank

import kotlin.io.println as println

abstract class Pessoa() {
    //open lateinit var nome: String
    //open lateinit var cpf: String

    abstract var nome: String
    abstract var cpf: String

    //private set
    /* Deixa privada propriedade set do cpf para que não
                   seja permitida alteração durante o programa. */

    // Construtor secundário
    //constructor()

    // Interpolação
    //fun pessoaInf() = "$nome + $cpf"

    /* classe interna, usada neste ódigo para fins de estudo, mas seu uso deve ser bem avaliado
    pois pode causar "aoplamento" */
    /* inner class Endereco{
        var rua: String = "Rua"
    }*/


}