package org.patterns.prototype.shapes;

/**
 * User: Oleg_Kariakin
 * Date: 4/20/15
 * Time: 3:53 PM
 */
public abstract class Shape implements Cloneable {

    private String id;
    protected String type;

    public String getType() {
        return type;
    }

    abstract void draw();

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Object clone = null;

        try {
            clone = super.clone();
        } catch (CloneNotSupportedException ex) {
            ex.printStackTrace();
        }

        return clone;
    }

}
