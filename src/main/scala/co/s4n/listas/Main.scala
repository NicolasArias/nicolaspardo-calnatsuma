package co.s4n.listas

import scala. io.Source

object Main extends App {
  def deListALista(lstp:Lista[Int]):Lista = lstp match {
    case Nil => Vacia()
    case (i::lstp) => Const(i, deListALista(lstp))
  }
  def leerArchiv(src:String):Lista = deListALista(Source.fromFile(src).getLines().toList.map(_.toInt))


  def concatenar(lst1:Lista,lst2:Lista):Lista = 
  def imprimirLista(lst:Lista):Lista = 
  def invertirLista(lst:Lista):Lista = 
  val lista = leerArchivo(args(0))
}
