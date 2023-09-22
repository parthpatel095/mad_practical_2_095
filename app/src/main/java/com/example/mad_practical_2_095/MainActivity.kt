package com.example.mad_practical_2_095

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.constraintlayout.widget.ConstraintSet.Constraint
import com.google.android.material.snackbar.Snackbar


class MainActivity : AppCompatActivity() {
     val TAG ="mainActivity"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        showmsg("onCreate Method is called")
    }

    override fun onStart() {
        super.onStart()
        showmsg("onStart method is called")
    }

    override fun onResume() {
        super.onResume()
        showmsg("onResume method is called")
    }

    override fun onPause() {
        super.onPause()
        showmsg("onPause method is called ")
    }

    override fun onStop() {
        super.onStop()
        showmsg("onStop method is called")
    }

    override fun onDestroy() {
        super.onDestroy()
        showmsg("onDestroy method is called")
    }

    override fun onRestart() {
        super.onRestart()
        showmsg("onRestart method is called")
    }

  fun showmsg(message: String){
      Log.i(TAG,message)
      Toast.makeText(this,message,Toast.LENGTH_SHORT).show()
      val  constraint : ConstraintLayout?= findViewById(R.id.mainConstrain)
      if (constraint != null){
          Snackbar.make(constraint,message,Snackbar.LENGTH_SHORT).show()
      }
  }

}