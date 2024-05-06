package com.example.middleexam

data class Teachers(
    val name:String,
    val id: String,
    val score: String,
    val major: String,
    val gender:String
)
data class Students(
    val name: String,
    val id: String,
    val age: String,
    val major: String,
    val gender:String
)

val teachers = listOf(
    Teachers("张三","1234","64","Math","男"),
    Teachers("李四","111","23","English","女"),
    Teachers("王五","222","37","Chinese","女")
)

val students = listOf(
    Students("小王","333","18","计算机","男"),
    Students("小李","444","18","计算机","女"),
    Students("小林","555","18","计算机","男"),
)
