package com.example.ca1.prog

import android.app.Activity
import android.app.AlertDialog
import com.example.ca1.R


class LoadingDialog(val mActivity:Activity) {
    private lateinit var isdialog:AlertDialog
    fun startLoading(){
        /**set View*/
        val infalter = mActivity.layoutInflater
        val dialogView = infalter.inflate(R.layout.progressbar,null)
        /**set Dialog*/
        val bulider = AlertDialog.Builder(mActivity)
        bulider.setView(dialogView)
        bulider.setCancelable(false)
        isdialog = bulider.create()
        isdialog.show()
    }
    fun isDismiss(){
        isdialog.dismiss()
    }
}