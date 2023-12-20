package modbat.test

import org.scalatest._
import modbat.mbt.ModbatTestHarness

class RedundancyTest extends fixture.FlatSpec with fixture.TestDataFixture with Matchers { "RedundancyTest1" should "pass" in { td =>
    ModbatTestHarness.test(Array("-s=1", "-n=10", "--no-redirect-out", "--log-level=fine", "modbat.test.Redundancy"), (() => ModbatTestHarness.setTestJar()), td)
  }

  "RedundancyTest2" should "pass" in { td =>
    ModbatTestHarness.test(Array("-s=2e78dcb10b272e5", "-n=1", "--no-redirect-out", "modbat.test.Redundancy"), (() => ModbatTestHarness.setTestJar()), td)
  }


  
}
