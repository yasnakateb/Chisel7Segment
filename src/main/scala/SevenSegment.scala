import chisel3._
import chisel3 .util._

class SevenSegment extends Module {
    val io = IO(new Bundle {
    val A = Input(UInt (1.W))
    val B = Input(UInt (1.W))
    val C = Input(UInt (1.W))
    val D = Input(UInt (1.W))
    val a = Output (UInt (1.W))
    val b = Output (UInt (1.W))
    val c = Output (UInt (1.W))
    val d = Output (UInt (1.W))
    val e = Output (UInt (1.W))
    val f = Output (UInt (1.W))
    val g = Output (UInt (1.W))
    })

    io.a := ~io.B & ~io.D | io.C | io.B & io.D | io.A  
    io.b := ~io.B | ~io.C & ~ io.D | io.C & io.D
    io.c := ~io.C | io.D | io.B
    io.d := ~io.B & ~io.D | ~io.B & io.C | io.B & ~io.C & io.D | io.C & ~io.D | io.A
    io.e := ~io.B & ~io.D | io.C & ~io.D 
    io.f := ~io.C & ~io.D | io.B & ~io.D | io.B & ~io.C | io.A  
    io.g := ~io.B & io.C | io.B & ~io.C | io.B & ~io.D | io.A  
}

// Generate the Verilog code
object SevenSegmentMain extends App {
    println("Generating the hardware")
    (new chisel3.stage.ChiselStage).emitVerilog(new SevenSegment(), Array("--target-dir", "generated"))
}