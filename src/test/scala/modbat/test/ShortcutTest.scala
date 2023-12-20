package modbat.test

import org.scalatest._
import modbat.mbt.ModbatTestHarness

class ShortcutTest extends fixture.FlatSpec with fixture.TestDataFixture with Matchers { "ShortcutTest1" should "pass" in { td =>
    ModbatTestHarness.test(Array("-s=1", "-n=3", "--no-redirect-out", "--log-level=fine", "modbat.test.Shortcut"), (() => ModbatTestHarness.setTestJar()), td)
  }

  "ShortcutTest2" should "pass" in { td =>
    ModbatTestHarness.test(Array("-s=1", "-n=1", "--no-redirect-out", "modbat.test.Shortcut"), (() => ModbatTestHarness.setTestJar()), td)
  }


  
}
