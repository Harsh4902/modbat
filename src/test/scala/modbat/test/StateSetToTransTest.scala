package modbat.test

import org.scalatest._
import modbat.mbt.ModbatTestHarness

class StateSetToTransTest extends fixture.FlatSpec with fixture.TestDataFixture with Matchers { "StateSetToTransTest1" should "pass" in { td =>
    ModbatTestHarness.test(Array("-s=1", "-n=1", "--no-redirect-out", "modbat.test.StateSetToTrans"), (() => ModbatTestHarness.setTestJar()), td)
  }


  
}
