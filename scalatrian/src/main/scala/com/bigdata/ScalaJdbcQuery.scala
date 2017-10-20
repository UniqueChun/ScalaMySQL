package com.bigdata

import java.sql.{DriverManager, ResultSet}

/**
  * Created by A chun on 2017/10/18.
  */
object ScalaJdbcQuery {
  def main(args: Array[String]) {

    //Set mysql url
    val conn_str = "jdbc:mysql://192.168.187.111:3306/sqoop?user=root&password=123456"
    //Load jdbc driver
    classOf[com.mysql.jdbc.Driver]
    val conn = DriverManager.getConnection(conn_str)

    //Query
    try {
      // Configure to be Read Only
      val statement = conn.createStatement(ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_READ_ONLY)
      // Execute Query
      val rs = statement.executeQuery("select EMP_NO,EMP_NAME,Job from emp ")
      // Iterate Over ResultSet
      while (rs.next) {
        val EMP_NO=rs.getString("EMP_NO")
        val EMP_NAME=rs.getString("EMP_NAME")
        val Job=rs.getString("Job")
        println(EMP_NO,EMP_NAME,Job)
      }
    }catch{
      case e:Exception =>e.printStackTrace
    }
    finally {
      conn.close
    }
  }
}
