package com.example.kotlinserverside

import com.example.kotlinserverside.bean.ItemBeans
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class KotlinServerSideApplication

fun main(args: Array<String>) {
	runApplication<KotlinServerSideApplication>(*args) {
		addInitializers(ItemBeans())
	}
}
