fun auditarEntregas(enderecos: List<String?>) {
    for (item in enderecos) {
        val endereco = item ?: "endereço desconhecido"

        if (endereco == "endereço desconhecido") {
            println("Entrega pendente: Falta de dados")
        } else {
            println("Rota tracada para: $endereco")
        }
    }
}

fun main() {
    val lista = listOf("Rua A, 10", null, "Av. B, 200", null,)
    auditarEntregas(lista)
}