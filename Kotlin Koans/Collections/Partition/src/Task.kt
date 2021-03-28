// Return customers who have more undelivered orders than delivered
fun Shop.getCustomersWithMoreUndeliveredOrders(): Set<Customer> =
    this.customers.filter { it.orders.size / 2.0 > it.orders.count { o -> o.isDelivered } }.toSet()
