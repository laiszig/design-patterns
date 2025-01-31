package com.laiszig.prototype.shapePrototype;

/**
 *  Concrete prototype. The cloning method creates a new object
 *  in one go by calling the constructor of the current class and
 *  passing the current object as the constructor's argument.
 *  Performing all the actual copying in the constructor helps to
 *  keep the result consistent: the constructor will not return a
 *  result until the new object is fully built; thus, no object
 *  can have a reference to a partially-built clone.
 */
public class Rectangle extends Shape{

    public int width;
    public int height;

    public Rectangle() {
    }

    /**
     * A parent constructor call is needed to copy private
     * fields defined in the parent class.
     * @param target
     */
    public Rectangle(Rectangle target) {
        super(target);
        if (target != null) {
            this.width = target.width;
            this.height = target.height;
        }
    }

    @Override
    public Shape clone() {
        return new Rectangle(this);
    }

    @Override
    public boolean equals(Object object2) {
        if (!(object2 instanceof Rectangle) || !super.equals(object2)) return false;
        Rectangle shape2 = (Rectangle) object2;
        return shape2.width == width && shape2.height == height;
    }
}
