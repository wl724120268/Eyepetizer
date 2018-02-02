package com.moment.eyepetizer.utils

import android.net.Uri

/**
 * Created by moment on 2018/2/2.
 */

class UriUtils {

    class FeedParse {
        var data: Long = 0
        var num: Int = 0
    }

    class CategoryParse {
        var start: Int = 0
        var num: Int = 0
    }

    class FollowParse {
        var start: Int = 0
        var num: Int = 0
        var follow: Boolean = false
        var startId: Int = 0
    }

    fun parseFeedUri(url: String): FeedParse {
        var uri: Uri? = Uri.parse(url)
        var date: Long = uri!!.getQueryParameter("date").toLong()
        var num: Int = uri!!.getQueryParameter("num").toInt()
        var feedParse = FeedParse()
        feedParse.data = date
        feedParse.num = num
        return feedParse
    }

    fun parseCategoryUri(url: String): CategoryParse {
        var uri: Uri? = Uri.parse(url)
        var start: Int = uri!!.getQueryParameter("start").toInt()
        var num: Int = uri!!.getQueryParameter("num").toInt()
        var category = CategoryParse()
        category.start = start
        category.num = num
        return category
    }

    fun parseFollowUri(url: String): FollowParse {
        var uri: Uri? = Uri.parse(url)
        var start: Int = uri!!.getQueryParameter("start").toInt()
        var num: Int = uri!!.getQueryParameter("num").toInt()
        var follow: Boolean = uri!!.getQueryParameter("follow").toBoolean()
        var startId: Int = uri!!.getQueryParameter("startId").toInt()

        var followparse = FollowParse()
        followparse.start = start
        followparse.num = num
        followparse.follow = follow
        followparse.startId = startId
        return followparse
    }
}