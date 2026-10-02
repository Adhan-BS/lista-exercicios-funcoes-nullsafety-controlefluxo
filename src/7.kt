fun recebeEmail (emails: List<String?>) {
    var invalidas = 0
    for (email in emails) {
        val tamanho = email?.length ?: 0
        if (tamanho == 0){
            invalidas += 1
            println("Conta inválida! Preparando para deleção...")
        } else {
            println("Conta válida: $email")
        }
    }
    println("\nTotal de contas que precisam ser apagadas: $invalidas")
}
fun main(){
    val emails = listOf("akemi@email.com", null, "", "leo@gmail.com")
    recebeEmail(emails)
}