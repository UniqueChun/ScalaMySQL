package com.bigdata

import java.sql.DriverManager

import com.mysql.jdbc.Connection
/**
  * Created by A chun on 2017/10/18.
  */
object MySQLConnDemo {
    //设置连接
    val  url="jdbc:mysql://192.168.187.111:3306?user=root&password=123456"
   //加载驱动
    classOf[com.mysql.jdbc.Driver]
   //获取连接
    val conn=DriverManager.getConnection(url)
  
  def close(conn: Connection): Unit = {
    try{
      if(!conn.isClosed() || conn != null){
        conn.close()
      }
    }
    catch {
      case ex: Exception => {
        ex.printStackTrace()
      }
    }
  }
}
