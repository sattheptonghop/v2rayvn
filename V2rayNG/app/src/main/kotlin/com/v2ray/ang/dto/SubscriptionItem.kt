package com.v2ray.ang.dto

data class SubscriptionItem(
        var remarks: String = "C",
        var url: String = "",
        var enabled: Boolean = true,
        val addedTime: Long = System.currentTimeMillis()) {
}
