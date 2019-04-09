package com.scalaone

class HelloWorld {
  def scala_main(args: Array[String]): Unit = {
    println(Brain.s_name);
    Brain.s_name = "america";
    println(Brain.s_name);
  }
}
