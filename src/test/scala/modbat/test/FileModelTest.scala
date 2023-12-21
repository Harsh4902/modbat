package modbat.test

import org.scalatest._
import modbat.mbt.ModbatTestHarness

class FileModelTest extends fixture.FlatSpec with fixture.TestDataFixture with Matchers { "FileModelTest1" should "pass" in { td =>
    ModbatTestHarness.test(Array("-s=1", "-n=500", "--stop-on-failure", "modbat.test.FileModel"), (() => ModbatTestHarness.setTestJar()), td)
  }


  
}
