package modbat.test

import org.scalatest._
import modbat.mbt.ModbatTestHarness

class SimpleFileModelTest extends fixture.FlatSpec with fixture.TestDataFixture with Matchers { "SimpleFileModelTest1" should "pass" in { td =>
    ModbatTestHarness.test(Array("-s=1", "-n=5", "--no-redirect-out", "modbat.test.SimpleFileModel"), (() => ModbatTestHarness.setTestJar()), td)
  }


  
}
