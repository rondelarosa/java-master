package org.example.dp;

/**
 * Interface must be adjective, it represents characteristics of a thing
 * An interface is a kind of contract when it's used in this way.
 * Clients are required to satisfy the contract defined by the interface.
 * Contract is saying is that you are agreeing to implement a pay method.
 *
 * This is layer more abstract though because you can't actually
 * implement anything inside an interface, it is just a pure contract
 */
public interface Payable {
    void pay();
}
