package com.example.kotlinserverside.repository.item

import com.example.kotlinserverside.entity.Item
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
interface ItemRepository : CrudRepository<Item, Int>