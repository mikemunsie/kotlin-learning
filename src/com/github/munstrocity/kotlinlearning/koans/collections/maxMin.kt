package com.github.munstrocity.kotlinlearning.koans.collections

import com.github.munstrocity.kotlinlearning.koans.collections.testShop.Customer
import com.github.munstrocity.kotlinlearning.koans.collections.testShop.Product
import com.github.munstrocity.kotlinlearning.koans.collections.testShop.Shop

// Return a customer whose order count is the highest among all customers
fun Shop.getCustomerWithMaximumNumberOfOrders(): Customer? =
        customers.maxBy { it.orders.size }

// Return the most expensive product which has been ordered
fun Customer.getMostExpensiveOrderedProduct(): Product? =
        orders.flatMap { it.products }.maxBy { it.price }
