package restoran

fun main(){
    //stuff
    val ivanow=Administrator()
    val krasko=Hostess()
    val bravo=Chef()
    val shevchenko=SousChef()
    val bezushko=Barmen()
    val groza=Cook()
    val petrov=Waiter()

    //products
    val soup=MainDish()
    val chicken=MainDish()
    val cheeseAndNuts=Sneck()
    val cezar=Salad()
    val napoleon=Dessert()

    val chardone=Vino()
    val cappuchino=Cappuchino()
    val cherryJuice=Juice()
    val greenTea=Tea()

    val malboro=Sigarrets()

    val order123=Order(petrov)

    order123.orderList = mutableListOf(soup,malboro,greenTea,napoleon)

    val receipt123=Receipt(petrov)
    receipt123.orderList=order123.orderList

}

class Customer() {
    var hasDiscount: Boolean = true

    fun returnDiscountRate() {
        var discountRate: Double = 0.0
        var discountNumber: Int = 0
        if (hasDiscount == true) {
            discountRate = 0.05
            discountNumber = 123456789
        }
    }

    fun makeOrder() {
        println("I would like some food")
    }

    fun payOrder() {
        val isCard: Boolean = true
        if (isCard == true) {
            println("Here is my card")
        } else {
            println("Here is my cash")
        }
    }
    fun payTips() {
        val wantPayTips: Boolean = true
        if (wantPayTips == true) {
            println("This tips is for you")
        } else {
            println("Good bye")
        }
    }
}

class Menu(){
    var menu:MutableList<Any> = mutableListOf()
}

class Order(val waiter:Waiter){
    val id:String="1235466"
    val orderNumber:Int=123
    val tableNumber:Int=1
    var guestsNumber:Int=1
    var orderList:MutableList<Any> = mutableListOf()
}

class Receipt(val waiter:Waiter){
    val id:String="1235466"
    val orderNumber:Int=123
    val tableNumber:Int=1
    var guestsNumber:Int=1
    var orderList:MutableList<Any> = mutableListOf()
    val kindOfPay:String="card"
    val customerDiscount:Double=0.0
    }