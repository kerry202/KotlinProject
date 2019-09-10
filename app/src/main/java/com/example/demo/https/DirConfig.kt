package com.example.demo.https

import android.os.Environment

object DirConfig {

    val HttpCache:String =Environment.getExternalStorageDirectory().absolutePath+"/httpCache"
}