package restoran

abstract class Meal() {
    val name:String="any"
    val category:String=" "
    val cost:Int=0
    var mealIngridients:MutableList<Any> = mutableListOf()
}
class Sneck():Meal(){}

class Salad():Meal(){}

class MainDish():Meal(){}

class Dessert():Meal(){}

abstract class Drink() {
    val name:String="any"
    val category:String=" "
    val cost:Int=0
    val volumeForOne:Double=0.2
}
class Tea():Drink(){}
class Cappuchino():Drink(){}

class Vino():Drink(){}

class Juice():Drink(){}

class Cocktail():Drink(){}

abstract class AnotherProduct() {
    val name:String="any"
    val category:String=" "
    val cost:Int=0
}

class Sigarrets():AnotherProduct(){}

