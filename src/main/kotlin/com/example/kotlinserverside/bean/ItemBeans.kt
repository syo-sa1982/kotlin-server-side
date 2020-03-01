package com.example.kotlinserverside.bean

import com.example.kotlinserverside.handler.ItemHandler
import com.example.kotlinserverside.router.ApiRouter
import org.springframework.context.support.beans

fun ItemBeans() = beans {
    bean<ApiRouter>()
    bean { ref<ApiRouter>().itemRouter() }
    bean<ItemHandler>()
}