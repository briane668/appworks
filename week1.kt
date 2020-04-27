package practice

open class HUMAN (var name:String ,var mana:Int){
    open fun attack(){
        println("$name use Fist Attack!")
    }
    fun checkmana() {
        if (mana >3){
            println("I ave enough mana to fight")
        }else{
            println("I must retreat for now!")
        }
    }

}

class mage(name: String,mana: Int): HUMAN(name,mana ) {
    override fun attack () {
        println("$name use use Fireball!")
    }

}

fun main() {
    val brian=HUMAN("brian,",3)
    brian.attack()


    val WADE=mage("wade",4)
    WADE.attack()
    WADE.checkmana()
}