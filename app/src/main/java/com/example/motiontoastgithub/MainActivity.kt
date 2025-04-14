package com.example.motiontoastgithub

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.res.ResourcesCompat
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.motiontoastgithub.databinding.ActivityMainBinding
import www.sanju.motiontoast.MotionToast
import www.sanju.motiontoast.MotionToastStyle

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        binding.SUCCES.setOnClickListener {
            MotionToast.createToast(this,
                "Hurray success 😍",
                "Upload Completed successfully!",
                MotionToastStyle.SUCCESS,
                MotionToast.GRAVITY_BOTTOM,
                MotionToast.LONG_DURATION,
                ResourcesCompat.getFont(this, www.sanju.motiontoast.R.font.helveticabold))

        }
        binding.ERROR.setOnClickListener {
            MotionToast.createToast(this,
                "Hurray success 😍",
                "Upload Completed successfully!",
                MotionToastStyle.ERROR,
                MotionToast.GRAVITY_BOTTOM,
                MotionToast.LONG_DURATION,
                ResourcesCompat.getFont(this, www.sanju.motiontoast.R.font.helveticabold))
        }
        binding.warning.setOnClickListener {
            MotionToast.createToast(this,
                "Hurray success 😍",
                "Upload Completed successfully!",
                MotionToastStyle.WARNING,
                MotionToast.GRAVITY_BOTTOM,
                MotionToast.LONG_DURATION,
                ResourcesCompat.getFont(this, www.sanju.motiontoast.R.font.helveticabold))

        }
       binding.info.setOnClickListener {
           MotionToast.createToast(this,
               "Hurray success 😍",
               "Upload Completed successfully!",
               MotionToastStyle.INFO,
               MotionToast.GRAVITY_BOTTOM,
               MotionToast.LONG_DURATION,
               ResourcesCompat.getFont(this, www.sanju.motiontoast.R.font.helveticabold))

       }
        binding.delete.setOnClickListener {
            MotionToast.createToast(this,
                "Hurray success 😍",
                "Upload Completed successfully!",
                MotionToastStyle.DELETE,
                MotionToast.GRAVITY_BOTTOM,
                MotionToast.LONG_DURATION,
                ResourcesCompat.getFont(this, www.sanju.motiontoast.R.font.helveticabold))

        }
        binding.noInternet.setOnClickListener {
            MotionToast.createToast(
                this,
                "Hurray success 😍",
                "Upload Completed successfully!",
                MotionToastStyle.NO_INTERNET,
                MotionToast.GRAVITY_BOTTOM,
                MotionToast.LONG_DURATION,
                ResourcesCompat.getFont(this, www.sanju.motiontoast.R.font.helveticabold)
            )
        }


        }
}