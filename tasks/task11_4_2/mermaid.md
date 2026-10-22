# UML Class Diagram

Here is a UML class diagram, specified using [Mermaid][mer].

```mermaid
%% Replace this line and the two below
classDiagram
    class Customer{
        name
        address
        placeOrder()
    }
    class Order{
        OrderNumber
        datePlaced
        deliveryDate
        checkStock()
        takePayment()
    }
    class OrderItem{
        name
        description
    }
    Customer --> Order : Places
    Order --> OrderItem : Includes
```


[mer]: https://mermaid.js.org/
