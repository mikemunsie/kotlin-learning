package com.github.munstrocity.kotlinlearning.koans.collections

import com.github.munstrocity.kotlinlearning.koans.collections.testShop.Customer
import com.github.munstrocity.kotlinlearning.koans.collections.testShop.Shop

// Return a list of customers, sorted by the ascending number of orders they made
fun Shop.getCustomersSortedByNumberOfOrders(): List<Customer> =
        customers.sortedBy { it.orders.size }