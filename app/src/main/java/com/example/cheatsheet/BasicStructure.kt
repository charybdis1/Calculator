package com.example.cheatsheet

// Конструкции языка в порядке усложнения

// 1
// Переменные примитивных (простых) типов.
// Передаются по значению - значение каждый раз копируется.

// Финальные, в java - final
val intValue = 1
val doubleValue = 2.3
val booleanValue = true

// Изменямые переменные, mutable
var intVariable = 4


// 2
// Функции

// Без параметров, без возврата значения
fun printString() {
    println("doSomething")
}

// Без параметров, с возвратом значения
fun calculate(): Int {
    println("start calculating")
    val c = intValue + intValue // тело функции
    return c // возврат значения
}

// C параметром, с возвратом значения
fun add(n: Int, m: Int): Int {
    return n + m
}

// 3
// Использование переменных и функций в различных сочетаниях

// Возврат значения функции
// Присвоение переменной результата работы функции,
// в переменной будет возвращаемое значение функции - return
fun testReturns() {
    println("before calculate fun call")
    val a = calculate()
    println("after calculate fun call, returned value is $a")
}

// Передача переменных в параметры функций
val addResult = add(intValue, 1)

// Использование переменных и функций в вычислениях
val sumFunVal = calculate() + 1


// 4
// Использование переменных и фунций в условиях и операторах.
// Вместо переменной всегда можно подставить функцию и наоборот.
fun conditionExample() {
    if (calculate() > 6 && booleanValue) {
        println("Calculate correct")
    }
}

fun whenExample() {
    when (intValue) {
        1 -> println("Equals one")
        2 -> println("Equals two")
        else -> {
            println("Nothing matches")
            println("Exiting")
        }
    }
}


// 5
// Классы - структуры языка программирования
// для описания сущностей реального мира
// или сущностей в программировании (listener, view)
// путем объединения полей и методов под одним именем.
// Классы могут содержать поля (переменные) и методы (функции).

class User {
    var name = "Ivan"
    var surname = "Ivanov"
    var inn = 1234567890

    fun getShortName(): String {
        return name.first() + ". " + surname
    }
}

// Класс это описание в коде, экземпляр класса это информация в памяти устройства.
// Чтобы создать экемпляр класса нужно вызвать конструктор,
// сейчас он пустой - не содержит параметров.

val user = User()

//  ^ переменная - хранит ссылку на экемпляр класса User
//         ^ создание экземпляра класса

// Можно обращаться к свойствам (полям (переменным)) и методам класса через переменную
fun printUserName() {
    println(user.name)
}

fun printUserShortName() {
    println(user.getShortName())
}

// Тестировать код можно здесь
fun main() {
    println("start main fun")
    printUserShortName()
    //testReturns()

    println(user)
}