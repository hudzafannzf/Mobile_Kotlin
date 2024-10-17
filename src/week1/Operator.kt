package week1

fun main() {
    // Operator Aritmatika
    val plus = 5 + 5
    val minus = 5-5
    val kali = 5 * 5
    val bagi = 5 / 5
    val modulus = 5 % 5

    println(plus)
    println(minus)
    println(kali)
    println(bagi)
    println(modulus)

    //Operator perbandingan
    var a = 10
    val b = 5

    val lebihdari = a > b
    val kurangdari = a < b
    val lebihdarisamadengan = a >= b
    val kurangdarisamadengan = a <= b
    val samadengan = a == b
    val tidaksamadengan = a != b

    println(lebihdari)

    //Operator Logika
    val and = 10 >= 10 && 12 > 11
    println(and)

    // or = salah satu dari 2 statemen harus true
    val or = 10 > 10 || 12 > 11
    println(or)

    // Negasi / kebalikan(kalo true pasti false dan kebalikanyaa seperti halnya namanya)
    val negasi = !true
    println(negasi)



}