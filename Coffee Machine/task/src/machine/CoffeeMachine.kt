package machine

class CoffeeMachine(
    private var balance: Int,
    private var mlOfWater: Int,
    private var mlOfMilk: Int,
    private var gramsOfCoffeeBeans: Int,
    private var disposableCups: Int,
) {
    fun take() {
        print("I gave you $${this.balance}\n\n")
        this.balance = this.balance - balance
    }

    fun fill(mlOfWater: Int, mlOfMilk: Int, gramsOfCoffeeBeans: Int, disposableCups: Int) {
        this.mlOfWater = this.mlOfWater + mlOfWater
        this.mlOfMilk = this.mlOfMilk + mlOfMilk
        this.gramsOfCoffeeBeans = this.gramsOfCoffeeBeans + gramsOfCoffeeBeans
        this.disposableCups = this.disposableCups + disposableCups
    }

    fun info() {
        println("\nThe coffee machine has:")
        println("$mlOfWater ml of water")
        println("$mlOfMilk ml of milk")
        println("$gramsOfCoffeeBeans g of coffee beans")
        println("$disposableCups disposable cups")
        println("$$balance of money\n")
    }

    fun makeEspresso() {
        if (mlOfWater - 250 < 0) {
            println("Sorry, not enough water!\n")
            return
        } else mlOfWater -= 250
        if (gramsOfCoffeeBeans - 16 < 0) {
            println("Sorry, not enough coffee beans!\n")
            return
        } else gramsOfCoffeeBeans -= 16
        if (disposableCups - 1 < 0){
            println("Sorry, not enough cups!\n")
            return
        } else disposableCups -= 1
        balance += 4
        println("I have enough resources, making a coffee!\n")
    }

    fun makeLatte() {
        if (mlOfWater - 350 < 0) {
            println("Sorry, not enough water!\n")
            return
        } else mlOfWater -= 350
        if (mlOfMilk - 75 < 0){
            println("Sorry, not enough milk!\n")
            return
        } else mlOfMilk -= 75
        if (gramsOfCoffeeBeans - 20 < 0) {
            println("Sorry, not enough coffee beans!\n")
            return
        } else gramsOfCoffeeBeans -= 20
        if (disposableCups - 1 < 0){
            println("Sorry, not enough cups!\n")
            return
        } else disposableCups -= 1
        balance += 7
        println("I have enough resources, making a coffee!\n")
    }

    fun makeCappuccino() {
        if (mlOfWater - 200 < 0) {
            println("Sorry, not enough water!\n")
            return
        } else mlOfWater -= 200
        if (mlOfMilk - 100 < 0){
            println("Sorry, not enough milk!\n")
            return
        } else mlOfMilk -= 100
        if (gramsOfCoffeeBeans - 12 < 0) {
            println("Sorry, not enough coffee beans!\n")
            return
        } else gramsOfCoffeeBeans -= 12
        if (disposableCups - 1 < 0){
            println("Sorry, not enough cups!\n")
            return
        } else disposableCups -= 1
        balance += 6
        println("I have enough resources, making a coffee!\n")
    }
}