package com.example.kotlinserverside.service

import com.example.kotlinserverside.entity.Item
import com.example.kotlinserverside.repository.item.ItemRepository
import com.ninjasquad.springmockk.MockkBean
import io.mockk.every
import io.mockk.verify
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.boot.test.mock.mockito.MockBean

@SpringBootTest
class ItemServiceTests(@Autowired private val itemService: ItemService) {

    @MockkBean private lateinit var mockItemRepository: ItemRepository

    val testItem1 = Item(1,"test1", 100)
    val testItem2 = Item(2,"test2", 200)
    val testItems = listOf(testItem1, testItem2)

    @Test
    fun testGetItemsWithUpperCase() {
        every { mockItemRepository.findAll() } returns testItems
        val expectedItem1 = Item(1,"TEST1", 100)
        val expectedItem2 = Item(2,"TEST2", 200)
        val expectedItems = listOf(expectedItem1, expectedItem2)

        Assertions.assertEquals(expectedItems, itemService.getItemsWithUpperCase())
        verify { mockItemRepository.findAll() }
    }
}