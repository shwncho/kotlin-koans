package Collections

fun Shop.getCustomerCities(): Set<City> =
    customers.map { it.city }.toSet()

// Find the customers living in a given city
fun Shop.getCustomersFrom(city: City): List<Customer> =
    customers.filter {it.city == city}