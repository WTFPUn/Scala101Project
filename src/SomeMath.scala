class SomeMath(val x: Int) {
  var a = 5
  private var keep: List[Int] = List()
  def add(inp: Int): Int = x + inp

  def append(inp: Int): Unit = {
    keep = keep.appended(inp)
  }

  def get_keep(): List[Int] = keep
}