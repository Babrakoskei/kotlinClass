fun main(){
    introduction("Babra","Chelangat")
    robotServe(22)
    arrayOfNames("millicent")
}
fun introduction(name: String,age : Int) {
    println(`my name is {} and I am {} years old`)
}
fun robotServe(age: Int){
    when(age){
        in   1..6 -> println("Serve guests a glass of milk")
        in  6..15 -> println("Serve guests a bottle of fanta orange")
        else -> println("Serve a bottle of coca cola")
    }
    fun arrayOfNames(name:String,name2:String){
        if (name.length > 4 ) {
            println("mark")
        }else
            println("millicent")

    }
    class Human(var name: String, var age:, var: Weight) {
        fun eat(foodWeight) {
            println("I am eating {foodWeight} kgs of food")
            fun speak(speech: Int){
                print("I am a girl")

            }
        }
    }
    fun birthday(age: Int){

    }
}