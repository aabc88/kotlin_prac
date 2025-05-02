package org.example.ch5.section2_generic

open class Super {
    open fun sayHello() {
        println("Super Hello")
    }
}

class Sub: Super() {
    override fun sayHello() {
        println("Sub Hello")
    }
}


class MyClass<T: Super>() {
    fun a(arg:T) : T? = null
}

class MyClass2<out T>() {
    //fun a(arg: T): T? = null // error 매개변수에 사용 불가
    fun a(arg: Int): T? = null
}

class MyClass3<in T>{
    fun a(arg: T): Int? = null //error
}

fun main() {
    //클래스의 상하위이며 제네릭 타입이 아니다. 가능
    val obj: Super = Sub()
    val obj2: Sub = obj as Sub

    //in, out이 추가되지 않은 제네릭 타입은 불공변
    //val obj3 = MyClass<Sub>()

    //val obj4: MyClass<Super> = obj3 //error
    //val obj4: MyClass<Sub> = MyClass<Super>() //error
    val obj5: MyClass2<Super> = MyClass2<Sub>()//ok
    //val obj6: MyClass2<Sub> = MyClass2<Super>()//error
    //val obj7: MyClass3<Super> = MyClass3<Sub>()//error
    val obj8: MyClass3<Sub> = MyClass3<Super>()//ok
}
