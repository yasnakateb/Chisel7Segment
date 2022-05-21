module SevenSegment(
  input   clock,
  input   reset,
  input   io_A,
  input   io_B,
  input   io_C,
  input   io_D,
  output  io_a,
  output  io_b,
  output  io_c,
  output  io_d,
  output  io_e,
  output  io_f,
  output  io_g
);
  wire  _io_a_T = ~io_B; // @[SevenSegment.scala 19:13]
  wire  _io_a_T_1 = ~io_D; // @[SevenSegment.scala 19:21]
  wire  _io_a_T_2 = ~io_B & ~io_D; // @[SevenSegment.scala 19:19]
  wire  _io_b_T_1 = ~io_C; // @[SevenSegment.scala 20:21]
  wire  _io_b_T_3 = ~io_C & _io_a_T_1; // @[SevenSegment.scala 20:27]
  wire  _io_d_T_4 = _io_a_T & io_C; // @[SevenSegment.scala 22:35]
  wire  _io_d_T_7 = io_B & _io_b_T_1; // @[SevenSegment.scala 22:49]
  wire  _io_d_T_11 = io_C & _io_a_T_1; // @[SevenSegment.scala 22:71]
  wire  _io_f_T_4 = io_B & _io_a_T_1; // @[SevenSegment.scala 24:34]
  assign io_a = ~io_B & ~io_D | io_C | io_B & io_D | io_A; // @[SevenSegment.scala 19:48]
  assign io_b = _io_a_T | ~io_C & _io_a_T_1 | io_C & io_D; // @[SevenSegment.scala 20:36]
  assign io_c = _io_b_T_1 | io_D | io_B; // @[SevenSegment.scala 21:26]
  assign io_d = _io_a_T_2 | _io_a_T & io_C | io_B & _io_b_T_1 & io_D | io_C & _io_a_T_1 | io_A; // @[SevenSegment.scala 22:79]
  assign io_e = _io_a_T_2 | _io_d_T_11; // @[SevenSegment.scala 23:27]
  assign io_f = _io_b_T_3 | io_B & _io_a_T_1 | _io_d_T_7 | io_A; // @[SevenSegment.scala 24:57]
  assign io_g = _io_d_T_4 | _io_d_T_7 | _io_f_T_4 | io_A; // @[SevenSegment.scala 25:56]
endmodule
