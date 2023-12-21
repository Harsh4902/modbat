package modbat.test

import org.scalatest._
import modbat.mbt.ModbatTestHarness

class RSeedTestSuccessTest extends fixture.FlatSpec with fixture.TestDataFixture with Matchers { "RSeedTestSuccessTest1" should "pass" in { td =>
    ModbatTestHarness.test(Array("-s=1", "-n=10", "--no-redirect-out", "modbat.test.RSeedTestSuccess"), (() => ModbatTestHarness.setTestJar()), td)
  }


  
}