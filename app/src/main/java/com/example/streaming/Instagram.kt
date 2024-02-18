package com.example.streaming

import android.annotation.SuppressLint
import java.text.SimpleDateFormat
import java.time.format.DateTimeFormatter
import java.util.Date

interface Instagram {
    val caption: String;
    val uploader: String;
    var timeStamp: String;
    val likes: Int;
    val disLikes: Int;
    fun posted();
    fun typePost();
    fun like();
    fun disLike();
}


abstract class SoMePost(override val caption: String, override val uploader: String, override val likes: Int,
                        override val disLikes: Int): Instagram {

     override var timeStamp: String = ""


    init {
        val sdf = SimpleDateFormat("dd-MM-yyyy HH-MM-SS")
        timeStamp = sdf.format(Date())

    }

    override fun posted() {
        println("New Post:");
        println(mutableListOf(caption, uploader, timeStamp, likes, disLikes))
    }

    override fun like() {
        val newLike = likes + 1
        println("Yay! new like count is: $newLike")
    }

    override fun disLike() {
        val newDisLike = disLikes - 1
        println("Aww! new dislike count is: $newDisLike")
    }
}

class TextPost(
    override val caption: String, override val uploader: String,
    override val likes: Int,
    override val disLikes: Int, textContent: String,): SoMePost(caption, uploader, likes, disLikes) {
   val textContent: String = textContent;

    override fun typePost() {
        println("The text content is: '$textContent' ");
    }
}

class PhotoPost(override val caption: String, override val uploader: String,
                override val likes: Int,
                override val disLikes: Int, photoResolution: Int, filtersApplied: Boolean): SoMePost(caption, uploader, likes, disLikes) {

    val photoResolution: Int = photoResolution;
    val filtersApplied: Boolean = filtersApplied;
    override fun typePost() {
        println("The photo resolution $photoResolution, filter applied: $filtersApplied");
    }
}

class VideoPost(override val caption: String, override val uploader: String,
                override val likes: Int,
                override val disLikes: Int, videoLength: Double, resolution: Int): SoMePost(caption, uploader, likes, disLikes) {

    val videoLength: Double = videoLength;
    val resolution: Int = resolution;
    override fun typePost() {
        println("The video length is: $videoLength, the resolution is: $resolution");
    }
}

fun main() {
    val textPost: Instagram = TextPost("Cool text post", "Birk", 60, 2, "I would like to have a pint!")
    textPost.posted()
    textPost.typePost()
    textPost.like()

    println("")

    val photoPost: Instagram = PhotoPost("Cool photo post", "Birk", 100, 5, 17, true);
    photoPost.posted()
    photoPost.typePost()
    photoPost.disLike()

    println("")

    val videoPost: Instagram = VideoPost("Coolest video post", "Birk", 2, 50, 0.24, 20);
    videoPost.posted()
    videoPost.typePost()
    videoPost.like()
}