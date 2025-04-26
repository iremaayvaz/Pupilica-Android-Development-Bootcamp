package com.example.pupilica_bootcamp.nesne_tabanli_programlama

fun main(){
    val o = Odev2()

    val fahrenheit = o.celciusToFahrenheit(30)
    println("Fahrenheit : $fahrenheit")

    o.dikdortgenCevresiHesapla(7, 3)

    val fac = o.factorial(5)
    println("Faktöriyel : $fac")

    o.howManyA("Merhaba")

    val n = 5
    val icAci = o.toplamIcAci(n)
    println("$n gen iç açılar toplamı $icAci")

    val gun = 30
    val maas = o.maasHesapla(gun)
    println("$gun gün çalışan biri $maas TL maaş alır.")

    val kota = 60
    val intFatura = o.internetUcreti(kota)
    println("$kota harcamaya $intFatura TL fatura")
}