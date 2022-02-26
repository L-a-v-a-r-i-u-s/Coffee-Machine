package machine

import kotlin.system.exitProcess

fun main() {
    val coffeeMachine = CoffeeMachine(550, 400, 540, 120, 9)
    while (true) {
        print("Write action (buy, fill, take, remaining, exit): > ")
        when (readln()) {
            "buy" -> {
                print("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu: > ")
                when (readln()) {
                    "1" -> {
                        coffeeMachine.makeEspresso()
                        continue
                    }
                    "2" -> {
                        coffeeMachine.makeLatte()
                        continue
                    }
                    "3" -> {
                        coffeeMachine.makeCappuccino()
                        continue
                    }
                    "back" -> continue
                }
            }
            "fill" -> {
                print("Write how many ml of water do you want to add: > ")
                val mlOfWater = readln().toInt()
                print("Write how many ml of milk do you want to add: > ")
                val mlOfMilk = readln().toInt()
                print("Write how many grams of coffee beans do you want to add: > ")
                val gramsOfCoffeeBeans = readln().toInt()
                print("Write how many disposable cups of coffee do you want to add: > ")
                val disposableCups = readln().toInt()
                coffeeMachine.fill(mlOfWater, mlOfMilk, gramsOfCoffeeBeans, disposableCups)
                continue
            }
            "take" -> {
                coffeeMachine.take()
                continue
            }
            "remaining" -> coffeeMachine.info()
            "exit" -> exitProcess(0)
        }
    }
//    print("Write how many ml of water the coffee machine has: > ")
//    val mlOfWater = readln().toInt()
//    print("Write how many ml of milk the coffee machine has: > ")
//    val mlOfMilk = readln().toInt()
//    print("Write how many grams of coffee beans the coffee machine has: > ")
//    val gramsOfCoffeeBeans = readln().toInt()
//    print("Wrote how many cups of coffee you will need: > ")
//    val cupsOfCoffee = readln().toInt()
//    val waterCups = mlOfWater / 200
//    val milkCups = mlOfMilk / 50
//    val coffeeBeansCups = gramsOfCoffeeBeans / 15
//    val limit = minOf(waterCups, milkCups, coffeeBeansCups)
//    when {
//        cupsOfCoffee > limit -> println("No, I can make only $limit cups of coffee")
//        cupsOfCoffee == limit -> println("Yes, I can make that amount of coffee")
//        else -> println("Yes, I can make that amount of coffee (and even ${limit - cupsOfCoffee} more than that")
//    }
}
