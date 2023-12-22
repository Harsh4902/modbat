package modbat.test

import org.scalatest._
import modbat.mbt.ModbatTestHarness

class ConcurrentModelTest extends fixture.FlatSpec with fixture.TestDataFixture with Matchers {
  "ConcurrentModelTest" should "pass" in { td =>
    ModbatTestHarness.test(Array("-s=1", "-n=1", "--no-redirect-out", "--log-level=fine", "modbat.test.ConcurrentModel"), (() => ModbatTestHarness.setTestJar()), td)
  }
}

