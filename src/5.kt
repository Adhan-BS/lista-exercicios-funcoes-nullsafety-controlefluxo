fun avaliarMotora(nota: Int?){
    val notaMotora = nota?: 0

    when (notaMotora){
        5 -> println("Excelente corrida!")
        4 -> println("Boa corrida")
        1, 2, 3  -> println("precisamos melhorar")
        0 -> println("Nenhuma avaliação fornecida")
        else -> println("Nota invalida")
    }
}

fun main(){
    avaliarMotora(null)
    avaliarMotora(1)
    avaliarMotora(2)
    avaliarMotora(3)
    avaliarMotora(4)
    avaliarMotora(5)
}