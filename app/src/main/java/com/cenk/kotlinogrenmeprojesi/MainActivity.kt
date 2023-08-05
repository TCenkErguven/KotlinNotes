package com.cenk.kotlinogrenmeprojesi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        println("Merhaba kotlin")
        println(5 * 10)

        //Değişkenler variable

        var a = 5
        var b = 10

        println(a * b)

        var yas = 50

        println(yas / 5 * 8)

        yas = 60

        println(yas / 5 * 8)

        //Sabitler value

        val x = 5
        val y = 20

        println(x + y)

        println(yas * x)

        val yasSonucu = yas * x
        println(yasSonucu)

        println("---------------Int-32bit----------------")

        //Veri tipini belirleme
        val benimIntegerim : Int
        //Val bir değer ilk değerinden sonra değişmez bu nedenle aşağıda değer alabilir
        benimIntegerim = 5
        //Kotlin'e otomatik veri tipini seçmesini istemezsek böyle kullanılır
        var yeniInteger : Int = 20

        println(benimIntegerim / 2)

        println("---------------Long-64bit----------------")

        //Sonradan veri tipi istenen tipten daha büyük olacaksa
        //Önden int alacak veri tipi Long olarak başlangıçta tanımlanmalı
        var benimLong : Long = 100
        benimLong = 30000000000000000
        println(benimLong)

        println("---------------Double & Float----------------")

        val pi = 3.14
        println(pi * 2)

        val floatPi : Float = 3.14f
        println(floatPi * 2)

        val yeniDouble = 5.0
        println(yeniDouble / 2)

        println("---------------String----------------")

        val benimString = "Benim Yeni Metnim"
        println(benimString.length)

        val isim = "Atıl"
        val soyisim = "Samancıloğlu"

        val tamisim = isim + " " + soyisim
        println(tamisim)

        val yeniBirString : String
        yeniBirString = "10"

        val baskaBirString = "20"

        println(yeniBirString + baskaBirString)

        println("---------------Boolean----------------")
        var benimBoolean = true
        benimBoolean = false

        println("---------------Dönüştürme----------------")

        val benimInt = 10
        val benimLongaCevrilenInt = benimInt.toLong()
        println(benimLongaCevrilenInt)

        var kullaniciGirdisi = "50"
        var kullaniciInt = kullaniciGirdisi.toInt()
        println(kullaniciInt / 2)

        println("---------------Dizi----------------")

        val stringOrnegi = "Cenk"
        val benimDizim = arrayOf(stringOrnegi,"Atıl","Cem","Nazlı")

        //index
        //var veya val tanımlamak içerisindeki elemanları set'le değiştirmemi engellemez
        println(benimDizim[0])
        println(benimDizim.get(1))
        println(benimDizim.get(2))
        benimDizim[2] = "Mahmut"
        println(benimDizim.get(2))
        benimDizim.set(3,"Mehmet")
        println(benimDizim[3])

        val numaraDizisi =  doubleArrayOf(1.0,2.0,3.5)
        println(numaraDizisi.get(2))

        val karisikDizi = arrayOf("Atıl",24,16.5,true,false)
        println(karisikDizi.get(3))

        println("---------------ArrayList----------------")
        val isimListesi = arrayListOf("Cenk","Cem","Atıl")

        println(isimListesi[0])
        println(isimListesi.get(1))
        isimListesi.add("Mehmet")

        //Any veri tipi kotlinde tüm veri tiplerinin atasıdır object gibi
        val karisikArrayList = arrayListOf<Any>()
        karisikArrayList.add(3)
        karisikArrayList.add("Array")
        karisikArrayList.add(true)

        val intArrayList = ArrayList<Int>()
        intArrayList.add(5)
        intArrayList.add(10)
        println(intArrayList[1])

        println("---------------Set----------------")

        val ornekDizi = arrayOf(7,8,9,9,9,8,10)
        println("index 2: ${ornekDizi[2]}")
        println("index 3: ${ornekDizi[3]}")

        println(ornekDizi.size)

        val benimSet = setOf<Int>(7,8,9,10,9,10)
        println(benimSet.size)

        //For each
        benimSet.forEach{ println(it)
        }

        val digerSet = HashSet<String>()
        digerSet.add("Cenk")
        digerSet.add("Cenk")
        digerSet.add("Cenk")
        digerSet.forEach{ println(it)
        }

    }




}