package org.apache.hadoop.hbase.Hbase;

import java.io.IOException;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.hbase.Cell;
import org.apache.hadoop.hbase.CellUtil;
import org.apache.hadoop.hbase.HBaseConfiguration;
import org.apache.hadoop.hbase.client.Get;
import org.apache.hadoop.hbase.client.HTable;
import org.apache.hadoop.hbase.client.Result;
import org.apache.hadoop.hbase.util.Bytes;

/**
 * HBase
 *
 */
public class Demo 
{
    public static void main( String[] args ) throws IOException
    {
    	System.out.println("1");
        //创建配置对象
    	System.out.println("2");
    	Configuration conf = HBaseConfiguration.create();
    	//配置
    	//conf.set
    	System.out.println("3");
    	HTable table = new HTable(conf,"employee");
    	//Bytes.toBytes(tableName) 
    	System.out.println("4");
    	Get get = new Get(Bytes.toBytes("10001"));
    	System.out.println("5");
    	Result result = table.get(get);
    	System.out.println("6");
    	Cell[] cells = result.rawCells();
    	//info:age=>value
    	for (Cell cell : cells) {
			System.out.print(Bytes.toString(CellUtil.cloneFamily(cell))+":");
			System.out.print(Bytes.toString(CellUtil.cloneQualifier(cell))+"=>");
			System.out.print(Bytes.toString(CellUtil.cloneValue(cell)));
    	}
    	table.close();
    	
    }
}
