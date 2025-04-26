package com.example.pupilica_bootcamp.nesne_tabanli_programlama

class Odev2 {
    // Parametre olarak girilen dereceyi fahrenheit'a dönüştürdükten
    // sonra geri döndüren bir method yazınız.
    fun celciusToFahrenheit(celcius :Double) : Double {
        val fahrenheit = (celcius * 1.8) + 32
        return fahrenheit
    }

    // Kenarları parametre olarak girilen ve dikdörtgenin
    // çevresini hesaplayan bir method yazınız.
    fun dikdortgenCevresiHesapla(uzunKenar : Double, kisaKenar : Double) : Double {
        val cevre = 2 * (uzunKenar + kisaKenar)
        return cevre
    }

    // Parametre olarak girilen sayının faktöriyel değerini
    // hesaplayıp geri döndüren metodu yazınız.
    fun factorial(sayi : Int) : Int {
        var fac = 1
        if(sayi == 0 || sayi == 1){
            return fac
        } else {
            for (i in 2..sayi) {
                fac *= i
            }
        }
        return fac
    }
}