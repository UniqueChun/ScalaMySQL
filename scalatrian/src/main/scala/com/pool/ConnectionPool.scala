package com.pool

object ConnectionPool {
  def main(args: Array[String]): Unit = {
    for (x <- 1 to 20 ){
      val con=MySQLPool.getJdbcConn()
      println("当前连接："+x+"  "+con)
      if(x==6){
        println("释放的是："+x+" "+con)
        MySQLPool.releaseConn(con)
      }
    }
  }
}
