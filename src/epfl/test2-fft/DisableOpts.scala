package scala.virtualization.lms
package epfl
package test2

import internal._

trait DisableCSE extends Expressions {
  override def findDefinition[T](d: Def[T]) = None
}


trait DisableDCE extends Scheduling {
  override def buildScheduleForResult(start: Exp[_]): List[TP[_]] =
    globalDefs
}

