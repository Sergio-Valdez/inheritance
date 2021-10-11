package edu.cnm.deepdive;

public class Test {

  public static void main(String[] args) {
    Object buck;
    buck = new Dog();
    ((GrayWolf) buck).vocalize();
    buck = new GrayWolf();
    ((GrayWolf) buck).vocalize();
  }
}
