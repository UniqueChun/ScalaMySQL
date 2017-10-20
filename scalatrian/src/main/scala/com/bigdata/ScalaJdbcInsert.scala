package com.bigdata

import java.sql.{DriverManager, ResultSet}
/**
  * Created by A chun on 2017/10/18.
  */

object ScalaJdbcInsert {
  def main(args: Array[String]): Unit = {
    //Setup mysql connection url
    val url = "jdbc:mysql://192.168.187.111:3306/sqoop?user=root&password=123456"
    classOf[com.mysql.jdbc.Driver]
    val conn = DriverManager.getConnection(url)
    //Insert
    try {
      // Configure to be Read Only
      val statement = conn.createStatement(ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_READ_ONLY)
      val prep = conn.prepareStatement("INSERT INTO emp (EMP_NO, EMP_NAME,Job) VALUES (?,?,?) ")
      prep.setString(1, "1265")
      prep.setString(2, "Bob")
      prep.setString(3, "doctor")
      prep.executeUpdate
      val rs = statement.executeQuery("select EMP_NO,EMP_NAME,Job from emp ")
      // Iterate Over ResultSet
      while (rs.next) {
        val EMP_NO = rs.getString("EMP_NO")
        val EMP_NAME = rs.getString("EMP_NAME")
        val Job = rs.getString("Job")
        println(EMP_NO, EMP_NAME, Job)
      }
        }catch{
        case e:Exception =>e.printStackTrace()
      }
      finally {
        conn.close
      }
    }


}
