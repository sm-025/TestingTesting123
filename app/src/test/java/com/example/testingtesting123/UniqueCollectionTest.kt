package com.example.testingtesting123

import org.junit.Before
import org.junit.Test

class UniqueCollectionTest {

    lateinit var collection: UniqueCollection

    @Before
    fun setUp() {
        collection = UniqueCollection()
    }


    // TODO 1: Write a test to ensure items can be added to the collection
    @Test
    fun addAnItem() {
        val item1 = Item("one")
        val item2 = Item("two")
        collection.addItem(item1)
        assert(collection.get(0) == item1)

        collection.addItem(item2)
        assert(collection.size() == 2)
    }

    // TODO 2: Write a test to ensure that only unique items can be added to the collection
    // Uniqueness is determined by the Item.name property, which is set via the constructor
    @Test
    fun addUniqueItem() {
        val originalSize = collection.size()
        val item3 = Item("three")
        val item3Duplicate = Item("three")
        val item4 = Item("four")

        collection.addItem(item3)
        collection.addItem(item3Duplicate)
        collection.addItem(item4)
        assert(originalSize == 0 && collection.size() == 2)
    }

    // Test Driven Development (TDD) test - complete specified function so that this test passes
    @Test
    fun clearAllItems() {
        collection.addItem(Item("item1"))
        collection.addItem(Item("Item2"))

        val originalSize = collection.size()
        collection.clear()
        val newSize = collection.size();

        assert(originalSize == 2 && newSize == 0) {"Items not cleared"}
    }
}