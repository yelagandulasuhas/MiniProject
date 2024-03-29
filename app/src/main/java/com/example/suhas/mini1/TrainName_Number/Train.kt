package com.example.suhas.mini1.TrainName_Number

import com.google.gson.annotations.SerializedName

data class Train(@SerializedName("number")
                 val number: String = "",
                 @SerializedName("classes")
                 val classes: List<ClassesItem>?,
                 @SerializedName("name")
                 val name: String = "",
                 @SerializedName("days")
                 val days: List<DaysItem>?)