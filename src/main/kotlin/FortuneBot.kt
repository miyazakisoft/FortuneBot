import com.github.kittinunf.fuel.httpGet
import com.github.kittinunf.result.Result

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

    /*
    (0..9)
            .map { i -> String.format("%d : %s", i, randomSelector.getResult()) }
            .forEach{ item -> println(item) }
    */

    val result = randomSelector.getResult()
    val url = "https://slack.com/api/chat.postMessage?token=xoxp-367071642352-367245642241-376524142790-7080e417ddde55cac51d2377dc3cad42&channel=random&text=$result"

    url.httpGet().response()

    return
}
