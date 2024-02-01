package modbat.mbt

import org.scalatest._

class SingletonTest extends fixture.FlatSpec with fixture.TestDataFixture with Matchers {
  "Singleton1" should "pass" in { td =>
    val result = ModbatTestHarness.test(Array("-s=1", "-n=1", "--no-redirect-out", "modbat.test.SingletonModel"), (() => ModbatTestHarness.setTestJar()), td)
  }
}
