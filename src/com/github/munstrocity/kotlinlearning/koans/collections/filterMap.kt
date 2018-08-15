package com.github.munstrocity.kotlinlearning.koans.collections

import com.github.munstrocity.kotlinlearning.koans.collections.testShop.City
import com.github.munstrocity.kotlinlearning.koans.collections.testShop.Customer
import com.github.munstrocity.kotlinlearning.koans.collections.testShop.Shop

// Return the set of cities the customers are from
fun Shop.getCitiesCustomersAreFrom(): Set<City> = customers.map { it.city }.toSet()

// Return a list of the customers who live in the given city
fun Shop.getCustomersFrom(city: City): List<Customer> = customers.filter { it.city == city }