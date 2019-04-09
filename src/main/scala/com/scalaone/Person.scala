package com.scalaone

case class Person(var name: String, var age: Int);

object Person {
  def apply() = new Person("mike", 21);
  def apply(name: String) = new Person("jdon", 34)
}
