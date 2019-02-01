package tcs.com.mobilefirts

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var game:Player = Player(SexType.FEMALE)
        game.name = "Luisa"
        //sumo vida
        game.pluslife()
        game.minuslife(true)
        game.minuslife(true)

        var meet:Eating = Eating("fruit", 2)
        var listMeet = mutableListOf<Eating>()
        listMeet.add(meet)
        listMeet.add(Eating("coins",10))
        listMeet.add(Eating("fungus",-1))
        listMeet.forEach{
                this.validMeet(it, game)
        }

        //asigno a la variable
        var newlife = game.life
        this.txtLife.text = "Life: ${newlife.toString()}"

    }

    fun validMeet(comida:Eating, game:Player){
       if (comida.meName == "fruit"){
           game.addLife(comida.mePoint)
       }
        else if(comida.meName == "coins"){
           game.addLife(comida.mePoint)
       }
        else if(comida.meName == "fungus"){
           game.addLife(comida.mePoint)
       }
    }
}
