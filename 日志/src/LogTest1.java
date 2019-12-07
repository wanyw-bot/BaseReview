/**
 * @author Stephen
 * @date 2019-12-04
 * @time 21:50
 */

import static java.lang.Math.*;
import static java.util.Arrays.*;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.logging.*;
import java.util.logging.Formatter;

public class LogTest1 {
    private static final Logger myLogger = Logger.getLogger("com.mycompany.myapp");

    /**
     *  日志记录器名也具有层次结构。
     *  日志记录器的父与子之间共享某些属性 子记录器的级别将继承父记录器的级别
     *  级别分为以下七个级别：默认只记录前三个
     *   • SEVERE
     *   • WARNING
     *   • INFO
     *   • CONFIG
     *   • FINE
     *   • FINER
     *   • FINEST
     * @param args
     */
    public static void main(String[] args) throws IOException {
//  修改配置文件logging.properties后FINE級別的日志信息也將显示在控制台上
    myLogger.log(Level.FINE,"123");
//    生成自己的日志记录器
//        Logger logger=Logger.getLogger("wanyw");
//        logger.setLevel(Level.FINE);
//        logger.setUseParentHandlers(true);
//        logger.setParent(myLogger);
//        StringBuilder s=new StringBuilder("E:\\JavaLogs");
//        SimpleDateFormat sf=new SimpleDateFormat("YYYY-MM-DD");
//        s.append("\\"+sf.format(new Date()));
//        FileHandler handler=new FileHandler(s.toString(),true);
//        handler.setLevel(Level.FINE);
//        logger.addHandler(handler);
//        Formatter ft=new XMLFormatter();
//        handler.setFormatter(ft);
//        logger.log(Level.CONFIG,"maybe i am nervous");
    System.out.println(System.getProperty("user.home"));
    }

}
