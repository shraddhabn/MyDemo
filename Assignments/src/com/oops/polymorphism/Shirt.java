package com.oops.polymorphism;

public class Shirt {

	float collarSize;
    float length;
    String material;

 

    enum ShirtMaterial {
        Cotton, Linen, Polyester,
    }

 

    public Shirt() {
        collarSize = 0.0f;
        length = 0.0f;
        material = "Cotton";

 

    }

 

    public Shirt(float collarSize, float length, String material) {
        super();
        this.collarSize = collarSize;
        this.length = length;
        this.material = material;
    }

 

    public float getCollarSize() {
        return collarSize;
    }

 

    public void setCollarSize(float collarSize) {
        this.collarSize = collarSize;
    }

 

    public float getLength() {
        return length;
    }

 

    public void setLength(float length) {
        this.length = length;
    }

 

    public String getMaterial() {
        return material;
    }

 

    public void setMaterial(String material) {
        this.material = material;
    }

 

    public String displayDetails() {
        return "Shirt [collarSize=" + collarSize + ", length=" + length + ", material=" + material + "]";
    }
    // @Override
    // public String toString() {
    // return "Shirt [collarSize=" + collarSize + ", length=" + length + ",
    // material=" + material + "]";
    // }

 
}
