import org.scalatest.FunSuite
import example.CubeCalculator

class CubeCalculatorTest extends FunSuite {
  test("CubeCalculator.cube") {
    val calculator = new CubeCalculator()
    assertResult(8)(calculator.cube(2))
  }
}
