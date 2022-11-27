package fastcampus.aop.part5.chapter06_mine.presentation

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import fastcampus.aop.part5.chapter06_mine.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private val binding: ActivityMainBinding by lazy { ActivityMainBinding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        // test ddddddddd

    }
}