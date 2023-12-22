package modbat.test

import org.scalatest._
import modbat.mbt.ModbatTestHarness

class SUTReqTest extends fixture.FlatSpec with fixture.TestDataFixture with Matchers {
  "SUTReqTest1" should "pass" in { td =>
    ModbatTestHarness.test(Array("-s=1", "-n=2", "--precond-as-failure", "--no-redirect-out", "--log-level=fine", "modbat.test.SUTReq"), (() => ModbatTestHarness.setTestJar()), td)
  }

  "SUTReqTest2" should "pass" in { td =>
    ModbatTestHarness.test(Array("-s=1", "-n=1", "--no-redirect-out", "--log-level=fine", "modbat.test.SUTReq"), (() => ModbatTestHarness.setTestJar()), td)
  }
}
