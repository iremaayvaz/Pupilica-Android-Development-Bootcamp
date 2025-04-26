package com.example.pupilica_bootcamp.nesne_tabanli_programlama

class Odev2 {
    // Parametre olarak girilen dereceyi fahrenheit'a dönüştürdükten
    // sonra geri döndüren bir method yazınız.
    fun celciusToFahrenheit(celcius :Int) : Double {
        val fahrenheit = (celcius * 1.8) + 32
        return fahrenheit
    }

    // Kenarları parametre olarak girilen ve dikdörtgenin
    // çevresini hesaplayan bir method yazınız.
    fun dikdortgenCevresiHesapla(uzunKenar : Int, kisaKenar : Int){
        val cevre = 2 * (uzunKenar + kisaKenar)
        println("Bir kenar uzunluğu $uzunKenar, bir kenar uzunluğu $kisaKenar olan dikdörtgenin çevresinin uzunluğu $cevre.")
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

    // Parametre olarak girilen kelime içinde kaç adet
    // a harfi olduğunu gösteren bir metot yazınız.
    fun howManyA(kelime : String) {
        var counter = 0
        for(element in kelime){
            if(element == 'a'){
                counter++;
            }
        }
        println("$kelime kelimesi içinde $counter tane a harfi var.")
    }

    // Parametre olarak girilen kenar sayısına göre
    // iç açılar toplamını hesaplayıp sonucu geri gönderen bir metot yazınız.
    fun toplamIcAci(kenarSayisi : Int) : Int {
        var icAcilarToplami = (kenarSayisi - 2) * 180
        return icAcilarToplami
    }

    // Parametre olarak girilen gün sayısına göre
    // maaş hesabı yapan ve elde edilen değeri döndüren bir metot yazınız.
    fun maasHesapla(gunSayisi : Int) : Int {
        var calisilanSaat = gunSayisi * 8 // gün sayısına göre toplam çalışma saati
        var maas = 0 // maaş hesabı için
        if(calisilanSaat > 160){ // mesai yapıldı
            var mesai = calisilanSaat - 160 // mesai saati
            maas = 160 * 10 + mesai * 20 // çalışma + mesai
        } else{ // mesai yapılmadı
            maas = calisilanSaat *  10 // çalışma
        }
        return maas // toplam maaş
    }

    // Parametre olarak girilen kota miktarına göre
    // ücreti hesaplayarak geri dödnüren metodu yazınız.
    fun internetUcreti(kotaMiktari : Int) : Int {
        var odenecek = 0;
        if(kotaMiktari > 50){ // kota aşımı yapıldı
            val asimMiktari = kotaMiktari - 50
            odenecek = 100 + asimMiktari * 4
        } else { // kota aşımı yapılmadı
            odenecek = 100
        }
        return odenecek
    }
}