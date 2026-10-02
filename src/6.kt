fun main() {
    val calcularGorjeta: (Double?) -> Double = {
        val valor = it ?: 0.0
        if (valor < 0.0) 0.0 else valor
    }
    println(calcularGorjeta(null))
    println(calcularGorjeta(-5.0))
    println(calcularGorjeta(10.0))
}