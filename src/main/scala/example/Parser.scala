package example

trait Parser[A] {
  def parse[A](s: String): Option[A]
}

object Parser {
    def flatmap(a: Parser[A], f: a => Parser[B]): Parser[B] {
        
    }
}