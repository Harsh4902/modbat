package modbat.examples

import org.scalatest._
import modbat.mbt.ModbatTestHarness

class JavaNioServerSocket2Test extends fixture.FlatSpec with fixture.TestDataFixture with Matchers {
  "JavaNioServerSocket2Test" should "pass" in { td =>
    ModbatTestHarness.test(Array("-n=10", "-s=1", "--no-redirect-out", "modbat.examples.JavaNioServerSocket2"), (() => ModbatTestHarness.setExamplesJar()), td) }
  // modified NioServerSocket so assertions pass
}
