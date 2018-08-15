package com.github.munstrocity.kotlinlearning.koans.collections

import com.github.munstrocity.kotlinlearning.koans.collections.testShop.Customer
import com.github.munstrocity.kotlinlearning.koans.collections.testShop.Shop

// Return customers who have more undelivered orders than delivered
fun Shop.getCustomersWithMoreUndeliveredOrdersThanDelivered(): Set<Customer> =
        customers.partition {
            it.orders.count { !it.isDelivered } > it.orders.count { it.isDelivered }
        }.first.toSet()