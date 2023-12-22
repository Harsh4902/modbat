package modbat.test

import modbat.dsl._

class ConcurrentModel extends Model {
  class BGThread(name: String) extends Thread(name: String) {
    override def run: Unit = {
      assert(false)
    }
  }

  // transitions
  "reset" -> "somestate" := {
    val t = new BGThread("BGThread")
    t.start
    t.join
  }
  "somestate" -> "end" := skip
}
