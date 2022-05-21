import chisel3._
import chiseltest._
import org.scalatest.flatspec.AnyFlatSpec

class SevenSegmentTest extends AnyFlatSpec with ChiselScalatestTester {

    "SevenSegmentTest test" should "pass" in {
        test(new SevenSegment()) { dut =>
            dut.io.A.poke(0.U)
            dut.io.B.poke(0.U)
            dut.io.C.poke(0.U)
            dut.io.D.poke(0.U)
            dut.clock.step(1)
            println("a: " + dut.io.a.peek().toString)
            println("b: " + dut.io.b.peek().toString)
            println("c: " + dut.io.c.peek().toString)
            println("d: " + dut.io.d.peek().toString)
            println("e: " + dut.io.e.peek().toString)
            println("f: " + dut.io.f.peek().toString)
            println("g: " + dut.io.g.peek().toString)
            dut.io.A.poke(1.U)
            dut.io.B.poke(0.U)
            dut.io.C.poke(0.U)
            dut.io.D.poke(0.U)
            dut.clock.step(1)
            println("a: " + dut.io.a.peek().toString)
            println("b: " + dut.io.b.peek().toString)
            println("c: " + dut.io.c.peek().toString)
            println("d: " + dut.io.d.peek().toString)
            println("e: " + dut.io.e.peek().toString)
            println("f: " + dut.io.f.peek().toString)
            println("g: " + dut.io.g.peek().toString)
        }
    } 
}