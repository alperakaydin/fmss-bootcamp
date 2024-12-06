package com.example.firstapp

fun main() {
    //Soru 1 : iç açı bulma
    fun icAciBul(kenarSayisi: Int): Int {
        require(kenarSayisi > 2) { "Kenar sayısı 3 den küçük olamaz" }

        return ((kenarSayisi - 2) * 180) / kenarSayisi
    }

    //Soru 2 : maaş hesaplama
    fun maasHesapla(gunSayisi: Int): Int {
        require(gunSayisi >= 0) { "Gün sayısı 0 dan kğçük olamaz" }

        var maas = 0
        val normalSaatUcreti = 40
        val fazlaMesaiSaatUcreti = 80
        var toplamCalismaSaati = gunSayisi * 8

        if (toplamCalismaSaati < 151) {
            maas = toplamCalismaSaati * normalSaatUcreti
        } else {
            maas = (150 * normalSaatUcreti) + (toplamCalismaSaati - 150) * fazlaMesaiSaatUcreti
        }
        return maas
    }

    //Soru : 3 otopark ücreti hesaplama
    fun otoparkUcretHesapla(sure: Int): Int {
        require(sure > 0) { "Süre 0 dan küçük olamaz" }

        if (sure == 1) {
            return sure * 50
        } else {
            return 50 + (sure - 1) * 10
        }
    }

    //Soru : 4 kilometreden mile dönüştürme
    fun kilometreMileDonustur(km: Double): Double {
        require(km >= 0) { "Kilometre 0 dan küçük olamaz" }
        return 0.621 * km
    }

    //Soru : 5 dikdörtgen alan hesaplama
    fun alanHesapla(kenar1: Int, kenar2: Int): Int {
        require(kenar1 > 0 && kenar2 > 0) { "Kenar uzunlukları pozitif olmalıdır." }
        return kenar1 * kenar2
    }

    //Soru : 6 Faktoriyel hesaplama
    fun faktoriyelHesapla(sayi: Int): Int {
        require(sayi >= 0) { "Negatif sayılar için sonuç tanımsızdır." }
        if (sayi == 0) {
            return 1
        } else {
            return faktoriyelHesapla(sayi - 1) * sayi
        }
    }

    //Soru : 7 "kaç tane e" harfi olduğunu bulma
    fun eHarfiSayisiBulma(kelime: String): Int {
        var eSayisi = 0
        for (harf in kelime) {
            if (harf == 'e') {
                eSayisi++
            }
        }
        return eSayisi
    }

    // Sonuçlar
    println("----- İç açı bulma -----")
    println("3 kenarlı bir çokgenin iç açısı: ${icAciBul(3)} derece") // 60
    println("4 kenarlı bir çokgenin iç açısı: ${icAciBul(4)} derece") // 90
    println("5 kenarlı bir çokgenin iç açısı: ${icAciBul(5)} derece") // 108

    println("\n----- Maaş hesaplama -----")
    println("10 gün çalışan bir işçinin maaşı: ${maasHesapla(10)} TL") // 3200
    println("20 gün çalışan bir işçinin maaşı: ${maasHesapla(20)} TL") // 6400
    println("0 gün çalışan bir işçinin maaşı: ${maasHesapla(0)} TL")   // 0

    println("\n----- Otopark ücreti hesaplama -----")
    println("1 saatlik otopark ücreti: ${otoparkUcretHesapla(1)} TL")  // 50
    println("2 saatlik otopark ücreti: ${otoparkUcretHesapla(2)} TL")  // 60
    println("5 saatlik otopark ücreti: ${otoparkUcretHesapla(5)} TL")  // 90

    println("\n----- Kilometreden mile dönüştürme -----")
    println("1 kilometre: ${kilometreMileDonustur(1.0)} mil")  // 0.621
    println("5 kilometre: ${kilometreMileDonustur(5.0)} mil")  // 3.105
    println("0 kilometre: ${kilometreMileDonustur(0.0)} mil")  // 0.0

    println("\n----- Dikdörtgen alan hesaplama -----")
    println("5x10 boyutlarındaki bir dikdörtgenin alanı: ${alanHesapla(5, 10)} birim kare") // 50
    println("7x3 boyutlarındaki bir dikdörtgenin alanı: ${alanHesapla(7, 3)} birim kare")  // 21
    println("0x10 boyutlarındaki bir dikdörtgenin alanı: ${alanHesapla(55, 10)} birim kare") // 550

    println("\n----- Faktöriyel hesaplama -----")
    println("0'ın faktöriyeli: ${faktoriyelHesapla(0)}")  // 1
    println("5'in faktöriyeli: ${faktoriyelHesapla(5)}")  // 120
    println("6'nın faktöriyeli: ${faktoriyelHesapla(6)}") // 720

    println("\n----- 'e' harfi sayısını bulma -----")
    println("Kelime: 'edebilemeyeceklerimizden' -> 'e' harfi sayısı: ${eHarfiSayisiBulma("edebilemeyeceklerimizden")}") // 8
    println("Kelime: 'merhaba' -> 'e' harfi sayısı: ${eHarfiSayisiBulma("merhaba")}")       // 1
    println("Kelime: 'kotlin' -> 'e' harfi sayısı: ${eHarfiSayisiBulma("kotlin")}")         // 0

}