// Return the set of products that were ordered by all customers
fun Shop.getProductsOrderedByAll(): Set<Product> {
    val allProducts = this.customers.flatMap { it.getOrderedProducts() }.toSet()
    return this.customers.fold(allProducts) { s, it ->
        s.intersect(it.getOrderedProducts())
    }
}

fun Customer.getOrderedProducts(): List<Product> =
    this.orders.flatMap { it.products }