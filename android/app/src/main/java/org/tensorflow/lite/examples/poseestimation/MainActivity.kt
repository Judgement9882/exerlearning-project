/* Copyright 2021 The TensorFlow Authors. All Rights Reserved.

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
==============================================================================
*/

package org.tensorflow.lite.examples.poseestimation

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle


import android.widget.*
import androidx.appcompat.app.AppCompatActivity
import org.tensorflow.lite.examples.poseestimation.ml.*

class MainActivity : AppCompatActivity() {
    @SuppressLint("WrongViewCast")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // var : 변수
        // val : 변수 --> 자바에서의 'final' (값 변경 못하는 변수)

        var btn_side_kick_image = findViewById<ImageButton>(R.id.btn_side_kick_image)
        btn_side_kick_image.setOnClickListener{
            val intent = Intent(this, SubActivity2::class.java) // 다음 화면으로 넘어갈 intent 객체
            startActivity(intent)
        }

//        var btn_side_kick = findViewById<Button>(R.id.btn_side_kick)
//        btn_side_kick.setOnClickListener{
//            val intent = Intent(this, SubActivity2::class.java) // 다음 화면으로 넘어갈 intent 객체
//            startActivity(intent)
//        }



    }

}
