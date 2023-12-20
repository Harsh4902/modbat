package modbat.test

import org.scalatest._
import modbat.mbt.ModbatTestHarness

class StateSetToTrans2Test extends fixture.FlatSpec with fixture.TestDataFixture with Matchers { "StateSetToTrans2Test1" should "pass" in { td =>
    ModbatTestHarness.test(Array("-s=1", "-n=1", "--no-redirect-out", "modbat.test.StateSetToTrans2"), (() => ModbatTestHarness.setTestJar()), td)
  }


  
}
