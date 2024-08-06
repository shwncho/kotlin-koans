package Collections

fun Shop.getCustomersSortedByOrders(): List<Customer> =
    customers.sortedByDescending(){ it.orders.size }