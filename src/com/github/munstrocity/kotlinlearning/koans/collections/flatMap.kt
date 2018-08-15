package com.github.munstrocity.kotlinlearning.koans.collections

import com.github.munstrocity.kotlinlearning.koans.collections.testShop.Customer
import com.github.munstrocity.kotlinlearning.koans.collections.testShop.Product
import com.github.munstrocity.kotlinlearning.koans.collections.testShop.Shop

/*
    Flatmap Returns a single list of all elements yielded from results of transform function being
    invoked on each element of original array.
 */


// Return all products this customer has ordered
val Customer.orderedProducts: Set<Product> get() {
    return orders.flatMap { it.products }.toSet()
}

// Return all products that were ordered by at least one customer
val Shop.allOrderedProducts: Set<Product> get() {
    return customers.flatMap { it.orderedProducts }.toSet()
}