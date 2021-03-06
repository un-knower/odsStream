package com.smallain.company

import kafka.serializer.StringDecoder
import org.apache.spark.SparkConf
import org.apache.spark.streaming.Seconds
import org.apache.spark.streaming.StreamingContext
//import org.apache.spark.streaming.kafka._
import com.smallain.utils.jsonparse.company.CanDoDataType._
import com.smallain.hbase_utils.dao.TableDao
import org.apache.hadoop.hbase.HBaseConfiguration
import org.apache.hadoop.hbase.client.HTablePool
import com.smallain.utils.jsonparse.company.InsertDataJsonParse._

object MainApp {
//	def main(args: Array[String]): Unit = {
//		val sparkConf = new SparkConf().setAppName("odsStream").setMaster("local[2]")
//		val ssc = new StreamingContext(sparkConf, Seconds(5))
//		println("hello,world")
//
//
//		val myConf = HBaseConfiguration.create()
//		//myConf.set("hbase.zookeeper.quorum", "iz2zea86z2leonw09hpjijz:2181,iz2zea86z2leonw09hpjimz:2181,iz2zea86z2leonw09hpjilz:2181,iz2zea86z2leonw09hpjikz:2181")
//		myConf.set("hbase.zookeeper.quorum", "192.168.31.101:2181,192.168.31.102:2181,192.168.31.102:2181")
//
//		val pool = new HTablePool(myConf, 2147483647) with Serializable
//		val td = new TableDao(pool)
//
//
//		val topicsSet = Set("maxwell")
//		val kafkaParams = Map[String, String]("metadata.broker.list" -> "192.168.31.101:9092,192.168.31.102:9092,192.168.31.103.com:9092")
//		val messages = KafkaUtils.createDirectStream[String, String, StringDecoder, StringDecoder](ssc, kafkaParams, topicsSet)
//
//		val ss = messages.map(x => x._2)
//		val ss1 = ss.filter(x => jsonDataFilter(x)).map {
//			case x if x.contains("insert") => insertDataParse(x)
//		}
//
//		// 1.添加确定rowkey的唯一方法,不然每次都要添加手写的rowkey
//		// 2.确认为什么有的时候连接kafka会很慢，达不到设定时间的同步，当然是基于原生的sparkstream，可能次情况与结构化流处理的不一致
//		// 3.要点：因为spark是内存计算所以除了spark rdd外任何引用的外部对象都要序列化，通过添加with Serializable序列化属性可以轻松处理
//		ss1.foreachRDD { rdd =>
//			rdd.foreach { record =>
//				record.foreach(column=>td.putTable(column._1, "000004", "info", column._2, column._3))
//			}
//		}
//
//		ss.print()
//		ssc.start()
//		ssc.awaitTermination()
//
//
//	}
}
