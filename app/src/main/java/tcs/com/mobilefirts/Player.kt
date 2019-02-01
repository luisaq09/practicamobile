package tcs.com.mobilefirts

enum class SexType {
    MALE,FEMALE
}


class Player(sexo:SexType) {

    var name:String? = null
    val sexo:SexType = sexo

    public var life:Int = 10
    private set

    fun pluslife(){
        this.life += 1
    }

    fun minuslife(contrict:Boolean){
        if (contrict) {
            this.life -= 1
        }
    }

    fun isAlive():Boolean{
        if (this.life > 0){
            return true
        }
        return false
    }

    fun addLife(point:Int){
        this.life += point
    }

}