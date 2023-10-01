import java.text.DecimalFormat

fun main() {

    val amount = 15023
    val taxRate = 0.075
    val taxMin = 35
    val commissionCalc = amount * taxRate
    val commission = if (commissionCalc > 35) commissionCalc else taxMin
    val numberView = DecimalFormat("#.##").format(commission);
    println("Комиссия за перевод: $amount р. составит: $numberView р.")
}