fun main() {
    val transacao = listOf(50.0, null, 120.5, null, 10.0)

    var total = 0.0

    for (valor in transacao) {
        if (valor != null) {
            total += valor
        } else {
            println("Transação ignoradaa")
        }
    }
    println("Total processado: R$ $total")
}