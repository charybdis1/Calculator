package com.example.cheatsheet

// 1
// Объявление класса
class Product(name: String, val price: Int) {
// ^ ключевое слово
//    ^ название класса
//            ^ первичный конструктор (primary constructor) -    fun qwerty(a, b)
//             это параметры конструктора при создании класса
//
//            ^ параметр конструктора, доступен только в теле конструктора
//                           ^ объявление поля класса в параметрах

    // Объявление полей
    val nameFormatted: String
    var amount = 0

    init {
        // Тело первичного конструктора (init block)
        this.nameFormatted = name.lowercase()
    }

    // Вторичный конструктор (secondary constructor)
    constructor(name: String) : this(name, 0) {
        println("Product not available, price set to zero")
    }

    // Объявление методов

    /**
     * Ценник
     */
    fun getPriceTag(): String {
        // name // параметр конструктора недоступен
        return "$nameFormatted $price"
    }

}

// 2
// Создание экземпляра класса с конструктором
val product1 = Product("Samsung smart watch", 10000)
val product2 = Product("Apple smart watch")



fun main () {

    println( product1.getPriceTag())
    println( product2.getPriceTag())

}