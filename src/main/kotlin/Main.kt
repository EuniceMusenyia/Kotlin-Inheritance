fun main() {
    var banker = Banker("Eunice",23)
    banker.eat()
    banker.talk("I enjoy coding")
//    println(banker.countMoney(arrayOf(1000, 500, 200, 100, 50)))
    val total = banker.countMoney(arrayOf(1000, 500, 200, 100, 50))
    println(total)
    banker.sleep()

    var doctor= Doctor("Eunice", 21,"F")
    doctor.eat()
    doctor.talk("Take your medication as prescribed")
    doctor.sleep()
    doctor.treatPatient("Eugine", "Malaria")
    println( doctor.gender)
    doctor.introduction()


    var farmer =Farmer("Ngugi",50)
    farmer.eat()
    farmer.introduction()


5
}

open class Person(var name: String, var age: Int){
    fun talk(words: String){
        println(words)
    }

   open fun eat(){
        println("Yum")
    }

    fun sleep(){
        println("zzzzz")
    }

    open fun introduction(){
        println("Hi my  name is $name")
    }
}

class Banker( name: String, age: Int ):Person(name,age){

    fun countMoney(notes: Array<Int>):Int{
        return notes.sum()
//        val total= notes.sum()
//        return notes.sum()
    }
}

class Doctor( name: String,  age: Int, var gender:String):Person(name, age){


    fun treatPatient(patientName: String, disease: String){
        println("Treating $patientName for $disease")
    }

    override fun introduction() {
//        super.introduction()
        println("My name is dr.$name")
    }
}

open class Farmer( name: String, age: Int) : Person (name, age){

    fun cultivateLand(){
        println("dig dig dig")
    }

    override fun eat() {
        super.eat()
        println("I am eating cassava from my farm")
    }
}