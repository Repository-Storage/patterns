package org.patterns.prototype.basic;

/**
 * Prototype class.
 */
public class Cookie implements Cloneable {

    protected int weight;

    @Override
    protected Cookie clone() throws CloneNotSupportedException {
        Cookie copy = new Cookie();
        copy.weight = this.weight;

        return copy;
    }

}
