class exampleLoops {

    fun conditionExamples(){
        val a = 5
        val b = 10
        if (a < b) {
            println("b=$b is Greater than a=$a")
        }
        else{
          println("both are equal")
        }
    }

    fun example() {
        for(number in 1..10){
            println("$number")
            if (number%2==0){
                println("its even")
            }
            else{
                println("its odd")
            }
        }
    }

    fun whenExample() {
        val m : String
        val f : String
    }

}