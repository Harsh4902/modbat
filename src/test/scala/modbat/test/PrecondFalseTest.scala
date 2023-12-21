package modbat.test

import org.scalatest._
import modbat.mbt.ModbatTestHarness

class PrecondFalseTest extends fixture.FlatSpec with fixture.TestDataFixture with Matchers { "PrecondFalseTest1" should "pass" in { td =>
    ModbatTestHarness.test(Array("-s=1", "-n=5", "--no-redirect-out", "modbat.test.PrecondFalse"), (() => ModbatTestHarness.setTestJar()), td)
  }


  
}
