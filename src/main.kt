fun main(){
    var details=human("nancy",36,50)
    println(details.name)
    println(details.age)
    println(details.weight)
    details.eat(31)
    println(details.weight)

    details.speak("don't give up")
    println(details.age)
    println(details.age+1)

    var jane =username("misky","linda","mary","0789765677",'k')
    println(nancy.email)
    println(nancy.phoneNumber)

}



class human(var name: String, var age: Int, var weight: Int){

 fun eat(foodWeight:Int){
     println("I am eating $foodWeight kgs of food")
     weight+=foodWeight
 }
fun  speak(speech:String){
    println(speech)
}
    fun birthday(){

    }

}
data class username(var firstname:String,var lastName:String,var email:String,var phoneNumber:String,var password:Char)



{

}
