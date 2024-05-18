#  E-Commerce(OOP)
## Objective:
- Develop a simple eCommerce application using Object-Oriented Programming (OOP) principles in Java. The application should allow users to manage products, customers, and orders.
# Requirements:
## Classes and Relationships:
1- Product
- Attributes: id, name, description, price, stockQuantity
- Methods: Constructors, getters, setters, toString()
2- Customer
  -	Attributes: id, name, email, address
  - Methods: Constructors, getters, setters, toString()
3- Order
  - Attributes: id, customer, productList (List of Product), totalAmount
  - Methods: Constructors, getters, setters, calculateTotalAmount(), toString()
4- OrderManager
 - Attributes: orderList (List of Order)
 - 	Methods: addOrder(Order order), removeOrder(int orderId), viewAllOrders()
5- CustomerManager
	- Attributes: customerList (List of Customer)
  - Methods: addCustomer(Customer customer), removeCustomer(int customerId), viewAllCustomers()
6- ProductManager
 - Attributes: productList (List of Product)
 - Methods: addProduct(Product product), removeProduct(int productId), viewAllProducts(), updateStock(int productId, int newStock)
## Main Application:
- Create a Main class with a main method to interact with the user.
 Implement a simple text-based menu to perform the following actions:
- Add a new product
- Remove a product
- View all products
- Add a new customer
- Remove a customer
- View all customers
- Create a new order
- View all orders
