package com.example.storageex

/**
 * Created by #kannanpvm007 on  03/02/23.
 */
fun main(){

    var arrayList= intArrayOf(106,107,108)
    println("max number is:"+getMaxNumber(105,1,2,3,4,5,6,7,8,9,10,15,25,*arrayList))
    println("max number is:"+getMaxNumber(*arrayList))
}

private fun getMaxNumber(vararg number: Int):Int{

    var max= number[0]
    for (i in number){
        if (i >max){

            max=i
        }
    }

    return max;
}