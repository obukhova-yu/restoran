package restoran

abstract class Person() {
    val fullName:String="any"
    val age:Byte=18
    val id:String="any"
    val gender:Int=0
    val position:String="any"
    val phoneNumber:String="+38065555555"
    val address:String="any"
}
class Administrator():Person(){

}
class Waiter():Person(){
    fun giveMenu(menu: Menu){
        println("I will give you the menu")
    }
    fun giveReceipt(receipt: Receipt){
        println("I will give you the receipt")
    }
    fun takeOrder(order: Order){
        println("I will bring you all the meals")
    }

}
class Hostess():Person(){
fun inviteCustomer(){
    println("I will help you find your table")
}
}
class Chef():Person(){
    fun kitchenDirect(){
        println("$position $fullName says: I am in charge in the kitchen")
    }
}

class SousChef():Person(){
fun dishDecorator(){
    println("$position $fullName says: Your dish is ready")
}
    fun orderKitchenFollow(){
        println("$position $fullName says: I follow to the order")
    }
}
class Cook():Person(){
    fun cookDish(){
        println("$position $fullName says: Your dish is ready for decorating")
    }
}

class Cleaner():Person(){
    fun cleanHall(){
        println("I will clean the hall")
    }
}
class DishWasher():Person(){
    fun dishWash(){
        println("I will wash all the dishes")
    }
}
class Barmen():Person(){
    fun prepareDrink(){
        println("$position $fullName says: Your drink is ready")
    }
}
