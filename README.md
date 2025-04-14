##inside the setting.gradle.kts inside the repository

```
 maven {
            url = uri("https://jitpack.io")
        }
 ```

## dependency 
implementation ("com.github.Spikeysanju:MotionToast:1.4")


## Inside the MainActivity.kt
```
  binding.SUCCES.setOnClickListener {
            MotionToast.createToast(this, // createToast  or createColorToast or darkToast or darkColorToast  .. total = 4 possiblity
                "Hurray success 😍",
                "Upload Completed successfully!",
                MotionToastStyle.SUCCESS,     // success, error,warning , delete, info , no_internet, ... total = 5 possiblity
                MotionToast.GRAVITY_BOTTOM,
                MotionToast.LONG_DURATION,
                ResourcesCompat.getFont(this, www.sanju.motiontoast.R.font.helveticabold))

        }
```

total 4*5= 20 toast possible
