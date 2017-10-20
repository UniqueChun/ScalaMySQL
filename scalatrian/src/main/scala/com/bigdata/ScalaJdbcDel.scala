package com.bigdata

import java.sql.{DriverManager, ResultSet}
/**
  * Created by A chun on 2017/10/18.
  */
object ScalaJdbcDel {
  def main(args: Array[String]): Unit = {
    val url="jdbc:mysql://192.168.187.111:3306/sqoop?user=root&password=123456"
    classOf[com.mysql.jdbc.Driver]
    val conn=DriverManager.getConnection(url)
    try{
      val stat=conn.createStatement(ResultSet.TYPE_FORWARD_ONLY,ResultSet.CONCUR_READ_ONLY)
      val prep=conn.prepareStatement("delete from emp where EMP_NO=?")
      prep.setString(1,"1265")
      prep.executeUpdate
      val rs = stat.executeQuery("select EMP_NO,EMP_NAME,Job from emp ")
      while (rs.next) {
        val EMP_NO = rs.getString("EMP_NO")
        val EMP_NAME = rs.getString("EMP_NAME")
        val Job = rs.getString("Job")
        println(EMP_NO, EMP_NAME, Job)
      }
    }catch{
        case e:Exception =>e.printStackTrace()
      }finally {
      conn.close
    }
  }

}
