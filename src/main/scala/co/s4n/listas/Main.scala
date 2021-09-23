package co.s4n.listas

import scala. io.Source

object Main extends App {
  def deListALista(lst:Lista[Int]):Lista = lst match {
    case Nil => Vacia()
    case (i::lstp) => Const(i, deListALista(lstp))
  }
  def leerArchiv(src:String):Lista = deListALista(Source.fromFile(src).getLines().toList.map(_.toInt))


  def concatenar(lst1:Lista,lst2:Lista):Lista = {
    def solve(a:Lista,b:Lista)Lista = a match{
      case Vacia() => b
      case Const(i,c) => solve(c,Const(i,a))
    }
    var res = Vacia()
    solve(lst1,res)
    solve(lst2,res)
  }

  def imprimirLista(lst:Lista):Lista = {
    def pri(a:Lista):Int = a match {
      case Vacia() => 0
      case Const(i,b) => {
        print(i +",")
        prit(b)
      }
    }
    print("[")
    pri(lst)
    println("]")
  }

  def invertirLista(lst:Lista):Lista = 
  val lista = leerArchivo(args(0))
}
