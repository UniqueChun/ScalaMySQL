package com.encapsulation

import java.sql
import java.sql.{Connection, DriverManager}

/**
  * Created by A chun on 2017/10/18.
  */
object DBUtils {
  val IP = "192.168.187.111"
  val Port = "3306"
  val DBType = "mysql"
  val DBName = "scala"
  val username = "root"
  val password = "123456"
  val url = "jdbc:" + DBType + "://" + IP + ":" + Port + "/" + DBName
  classOf[com.mysql.jdbc.Driver]

  def getConnection(): Connection = {
    DriverManager.getConnection(url, username, password)
  }
  //  def getConnection():Connection={
  //  DriverManager.getConnection(url,username,password)
  //}

  def close(conn: Connection): Unit = {
    try {
      if (!conn.isClosed() || conn != null) {
        conn.close()
      }
    }
    catch {
      case ex: Exception => {
        ex.printStackTrace()
      }
    }
  }

  /*def close(rs: ResultSet): Unit = {
       try {
         if(!rs.isClosed() || rs != null){
           rs.close()
         }
        }
        catch {
          case ex: Exception => {
            ex.printStackTrace()
          }
        }
      }*/
  /*def close(pstm: PreparedStatement): Unit = {
       try {
          if(!pstm.isClosed() || pstm != null){
            pstm.close()
          }
        }
        catch {
          case ex: Exception => {
            ex.printStackTrace()
          }
        }
      }*/
}
