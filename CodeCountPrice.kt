import java.text.NumberFormat
import java.util.*

fun main() {
    var x = 500000
    var diskon=0
    val myCurrency = NumberFormat
        .getCurrencyInstance(Locale("in", "ID"))

    if(x < 500000){
        diskon = 5
    } else if(x >= 500000 && x <=749999){
        diskon = 5
    } else if(x >= 750000 && x <= 999999){
       diskon = 5
    }else if(x >= 1000000) {
        diskon = 5
    }
    println("harga setelah diskon : ${myCurrency
        .format(x-(x*diskon/100))}")
}
