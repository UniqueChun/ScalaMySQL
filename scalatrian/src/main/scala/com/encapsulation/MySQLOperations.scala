package com.encapsulation

object MySQLOperations {
  def main(args: Array[String]): Unit = {
    val op = new Operations()
    val user = op.User("5", "Allen", 34)
    //Insert
    println(op.add(user))

    //Delete
    //println(op.delete("4"))


    //更新一条记录
    //println(op.update(user))
  }
}
