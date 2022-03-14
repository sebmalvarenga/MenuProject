# Online Delivery II (redux)
> _Now with more objects!_

We have spent some time working on example problems using primitive data structures in Java and occasionally used some pre-defined objects provided by the JDK (e.g., String and arrays). However, so far we have not seen much that has differed from the functionality offered by other programming languages. From this point on we're going to be seeing quite a bit of an extremely useful convention in Java and other object-oriented programming languages - Objects and Classes. And, while many other programming languages have objects, only a few use the class-based structure that Java supports so well. 

Inside your `\src` folder, you will find a starter class `Delivery` for you to use. The purpose of this class, much like our previous experience with online ordering, is to allow someone to enter an order, answer some questions about that order, and then calculate the total amount owed - with one big difference. For this project, you will allow the person ordering to request more than one item per order. You will also estimate the amount of time that order will take, and the answer will depend both on what items are ordered and on whether deliver is selected.

As before, the purpose of the primary method (now called `placeOrder`) is relatively straightforward: it requests that a user enter the items they want to order and prints the amount owed. Unlike before, we are not just returning that amount as a number, we are returning an `Order` object that contains an `ArrayList` of all the menu items that have been ordered. When run, your program should:
1. Print a statement greeting the user in a friendly way with the name of one of your favorite restaurants to order from.
2. Display a list of four numbered items that are available for that restaurant and their price. The names of the items should be items from your restaurant. However, the amounts for cost and preparation time should be:
   1. $1.99, 2 minutes
   2. $2.99, 6 minutes
   3. $3.99, 15 minutes
   4. $4.99, 5 minutes
3. Prompt the user again to enter an item, or a negative value if they would like to stop ordering. This step should be continued until the user enters a negative number. 
4. Ask the user if they want delivery (y/n). Delivery costs $5.99. Delivery takes 20 minutes in addition to the time it takes to prep the food. 
5. Ask the user if they want to tip (y/n). If they say yes, ask them to enter any amount in the range of 0 to 40, which will be used as a percentage to calculate tip. Tipping has no effect on preparation time or delivery time (despite what you might hope). 
6. Calculate the total cost and display it to the user, according to the following rules:
   1. Tax is 10%. Base price and delivery fee is taxed, but not tip.
   2. Tip percentage is based on the base price only, not delivery or tax. 
7. The `order` method should return the total cost back to the `main` method.
8. End the program.

> Can you use code from the first project about online ordering, or from in-class demonstrations? You can! However, you can expect that you'll need to make some changes. You might find it easier to copy and past sections of the code you need, rather than copying everything over all at once. This process, called _refactoring_, is extremely common in computer science when we learn a new and improved way to do something we have already done. 

If at any time the user does not enter one of the expected values, the `placeOrder` method should not end, but should prompt the user again with the same question so that they can provide a meaningful reply. However, you should only concern yourself with bad inputs that are still the appropriate type (i.e., do not worry about exception handling). 

A series of tests are included in the test directory to establish whether your program operates correctly, according to the instructions above. As with all assignments, your first order of business should be creating the appropriate method stubs so that the program compiles. Only then should you worry about passing tests.

To complete this project, you will need to complete three separate Class files.

- **`Delivery.java`** Already created for you, but you will need to add to it. As before, this class only contains two methods, a `main` and `placeOrder` (note this method was renamed to avoid confusion with the `Order` class). Unlike before, the `placeOrder` method returns an `Order` object. Also unlike before, much of the logic of determining the total cost will not be here, but will instead be placed inside the `Order` class.
- **`MenuItem.java`** Container for the data about a single menu item.
  - Fields for the cost (double), time (int), and name (String) for that item. 
  - No-args (empty parameter) constructor that sets zero values to the numeric fields and "n/a" to the name. 
  - Constructor with parameters for the cost, time, and name. 
  - Getter and setter methods for cost, name, and time
  - `toString` method that returns the name and cost of the item separated by a space. The cost has a dollar sign in front of it, so a Hot Dog costing $1.99 would return the string "Hot Dog $1.99"
- **`Order.java`** Container for all the `MenuItem` objects that are being ordered. Responsible for correctly calculating total cost and delivery time.
  - Fields: `ArrayList` of menuItems; a boolean for delivery, and a tipPercentage. 
  - Getter and setter methods for delivery and tip percent fields. To verify expected method names, double-check the test suites (e.g., `isDelivery` instead of `getDelivery`).
  - An `addItem` method that takes a `menuItem` object and adds it to the item arraylist. 
  - A `getItems` method that returns the arrayList of `MenuItem` objects
  - A `getCost` method that sums up the base price of the items that have been ordered and then applies the rules of pricing that are described above. These are the same rules that were applied in the previous Menu project (i.e., base, tax, and tip). 
  - A `getTime` method that determines when the order will be ready. It does not take the sum of the items in the list. Instead, we can assume that the kitchen will make these items in parallel. Therefore, the time to prepare the entire order will be the max amount of time to prepare _any_ of the items in the order. This method must also take into account delivery time, which defaults to 20 minutes.
  - A `toString` method that returns a String. The method will have all the individual String objects for the `MenuItem` objects in the list, but will also contain the total cost and total time. You have some leeway to determine how best to format this String in order to make it readable. 
- You are responsible for implementing the logic in all methods. Though the fields and method names described above are required, you may feel free to create additional fields and methods as necessary to implement the logic in your system.  

> Food for thought: all of your fields should be private, and your getters and setters public. Why do you think this might be?