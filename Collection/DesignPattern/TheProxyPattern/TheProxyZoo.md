* Firewall Proxy:

Controls access to a set of network resources, protecting the subject from "bad" client.
 
 * Smart reference proxy:
 
 Provides additional actions whenever a subject is referenced, such as counting the number of references to an object.
 
 * Caching proxy:
 
 Provides temporary storage for results of operations that are expensive. It can also allo mutiple clients to share the results to reduce computation or network latency.
 
 * Synchronization Proxy.
 
 Provides safe access to a subject from multiple threads.
 
 * Complexity hiding proxy.
 
 Hides the complexity of and controls access to a complex set of classes. This is sometimes called the Facade Proxy for obvious reasons.
 The Complexity Hiding Proxy differs from the Facade Pattern in that the proxy controls access, while the Facade Pattern just provides an alternative interface.
 
 * Copy - on - write proxy.
 Controls the coping of an object by deferring the copying of an object until it is required by a client.
 This is a variant of the Virtual Proxy.