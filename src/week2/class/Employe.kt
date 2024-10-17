package week2.`class`

open class Employe(val name : String) {
    fun sayHelo(name: String){
    println("hello $name my name is ${this.name}")
    }
}


class Manager (name: String) : Employe(name)

class member (name: String) : Employe(name)