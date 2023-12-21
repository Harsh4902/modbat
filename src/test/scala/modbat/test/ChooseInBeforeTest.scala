package modbat.test

import org.scalatest._
import modbat.mbt.ModbatTestHarness

class ChooseInBeforeTest extends fixture.FlatSpec with fixture.TestDataFixture with Matchers { "ChooseInBeforeTest1" should "pass" in { td =>
    ModbatTestHarness.test(Array("-s=1", "-n=3", "--no-redirect-out", "modbat.test.ChooseInBefore"), (() => ModbatTestHarness.setTestJar()), td)
  }


  
}
