package modbat.test

import modbat.dsl._

class SingletonModel extends Model {
  @Before def start(): Unit = {
    println("start")
  }

  @After def end(): Unit = {
    println("end")
  }

  // transitions
  "reset" -> "end" := {
  }
}
