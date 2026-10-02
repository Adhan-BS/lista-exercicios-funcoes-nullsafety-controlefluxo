fun calcularDesconto(valor: Double, cupom: String?): Double =
    when (cupom) {
        "PROMO10" -> valor - 10
        "PROMO20" -> valor - 20
        else -> valor
    }


fun main(){
    val total = 100.0

    println("Sem cupom: R$ ${calcularDesconto(total, null)}")
    println("Com PROMO10: R$ ${calcularDesconto(total, "PROMO10")}")
    println("Com PROMO20: R$ ${calcularDesconto(total, "PROMO20")}")
    println("Cupom inválido: R$ ${calcularDesconto(total, "XYZ")}")
}