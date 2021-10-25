package yong.aop.aop.naviview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.LinearLayout
import android.widget.TextView
import androidx.drawerlayout.widget.DrawerLayout

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        findViewById<Button>(R.id.btn_open).setOnClickListener {

            findViewById<DrawerLayout>(R.id.drawer_layout).openDrawer(findViewById(R.id.drawer))
        }

        findViewById<Button>(R.id.btn_close).setOnClickListener {
            findViewById<TextView>(R.id.tv_text).setText(findViewById<EditText>(R.id.et1).text.toString()+findViewById<EditText>(R.id.et2).text.toString())
            findViewById<DrawerLayout>(R.id.drawer_layout).closeDrawers()
        }

    }

}
