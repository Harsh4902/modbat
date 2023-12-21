package modbat.test

import org.scalatest._
import modbat.mbt.ModbatTestHarness

class CarModelTest extends fixture.FlatSpec with fixture.TestDataFixture with Matchers { "CarModelTest1" should "pass" in { td =>
    ModbatTestHarness.test(Array("-s=1", "-n=20", "--no-redirect-out", "modbat.test.CarModel"), (() => ModbatTestHarness.setTestJar()), td)
  }


  
}
