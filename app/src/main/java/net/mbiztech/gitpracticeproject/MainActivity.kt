package net.mbiztech.gitpracticeproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        
         // simple method to test pull down
        add(2,3);
    }
    
    private fun add(a : Int, b : Int){

        var c : Int  = a+b;

    }
}
