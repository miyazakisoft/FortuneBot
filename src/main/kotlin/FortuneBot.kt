val random = java.util.Random()


open class RandomSelector<Element>(val rerultList : List<Element>){
    private fun getRandomNumber() : Int{
        return random.nextInt(this.rerultList.size)
    }

    fun getResult() : Element{
        return this.rerultList[this.getRandomNumber()]
    }
}


fun main(args: Array<String>){
    val randomSelector = RandomSelector(listOf<String>("大吉", "中吉", "吉", "小吉", "末吉", "凶", "大凶"))
    (0..9)
            .map { i -> String.format("%d : %s", i, randomSelector.getResult()) }
            .forEach{ item -> println(item) }

    return
}
