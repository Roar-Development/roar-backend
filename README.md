# ROAR

## Hexagonal Architecture

### Domain
The domain or entity object is the core part of the hexagonal architecture. It can have both state and behavior. This object doesn’t have any dependency on any of the application components. Any change in domain object will occur if there’s a change in the business requirement itself.

### Ports
Ports in hexagonal architecture refer to the interfaces that allow inbound or outbound flow. An inbound port exposes the core application functionality to the outside world. For example, an API call to the service interface

### Adapters
Adapters refer to the implementation classes of their respective ports in a hexagonal architecture. They’re the outside part of the application (such as GUI, API calls, Webviews, Dao, etc.) and interact with the application via inbound and outbound ports respectively. In addition, the adapters make it simple to swap out a specific layer of the application. Depending on the required changes, we just need to add an adapter implementing an input or output port.

### Primary Adapters
They’re also known as input or driving adapters as they drive the application by invoking the core part of the application using inbound ports.

### Secondary Adapters
They are known as output or driven adapters and implement an outbound port interface. These adapters provide an implementation for accessing the secondary components of an application like databases, messaging queues, etc. While the service layer implements the input port, an output port is implemented using the persistence layer.