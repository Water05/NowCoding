package cn.piped;

import java.io.IOException;
import java.io.PipedWriter;

public class WriterThread implements Runnable {
	// 定义一个数组来充当向管道中输入数据
	String[] str = new String[] { "1.www.csdn.net论坛", "2.www.google.com谷歌",
			"3.www.hibernate.orgHibernate", "4.www.xiami.com虾米" ,"1.www.csdn.net论坛", "2.www.google.com谷歌",
			"3.www.hibernate.orgHibernate", "4.www.xiami.com虾米" ,"1.www.csdn.net论坛", "2.www.google.com谷歌",
			"3.www.hibernate.orgHibernate", "4.www.xiami.com虾米" ,"1.www.csdn.net论坛", "2.www.google.com谷歌",
			"3.www.hibernate.orgHibernate", "4.www.xiami.com虾米" ,"1.www.csdn.net论坛", "2.www.google.com谷歌",
			"3.www.hibernate.orgHibernate", "4.www.xiami.com虾米" ,"1.www.csdn.net论坛", "2.www.google.com谷歌",
			"3.www.hibernate.orgHibernate", "4.www.xiami.com虾米" ,"1.www.csdn.net论坛", "2.www.google.com谷歌",
			"3.www.hibernate.orgHibernate", "4.www.xiami.com虾米" ,"1.www.csdn.net论坛", "2.www.google.com谷歌",
			"3.www.hibernate.orgHibernate", "4.www.xiami.com虾米" ,"1.www.csdn.net论坛", "2.www.google.com谷歌",
			"3.www.hibernate.orgHibernate", "4.www.xiami.com虾米" ,"1.www.csdn.net论坛", "2.www.google.com谷歌",
			"3.www.hibernate.orgHibernate", "4.www.xiami.com虾米" ,"1.www.csdn.net论坛", "2.www.google.com谷歌",
			"3.www.hibernate.orgHibernate", "4.www.xiami.com虾米" ,"1.www.csdn.net论坛", "2.www.google.com谷歌",
			"3.www.hibernate.orgHibernate", "4.www.xiami.com虾米" ,"1.www.csdn.net论坛", "2.www.google.com谷歌",
			"3.www.hibernate.orgHibernate", "4.www.xiami.com虾米" ,"1.www.csdn.net论坛", "2.www.google.com谷歌",
			"3.www.hibernate.orgHibernate", "4.www.xiami.com虾米" ,"1.www.csdn.net论坛", "2.www.google.com谷歌",
			"3.www.hibernate.orgHibernate", "4.www.xiami.com虾米" ,"1.www.csdn.net论坛", "2.www.google.com谷歌",
			"3.www.hibernate.orgHibernate", "4.www.xiami.com虾米" ,"1.www.csdn.net论坛", "2.www.google.com谷歌",
			"3.www.hibernate.orgHibernate", "4.www.xiami.com虾米" ,"1.www.csdn.net论坛", "2.www.google.com谷歌",
			"3.www.hibernate.orgHibernate", "4.www.xiami.com虾米" ,"1.www.csdn.net论坛", "2.www.google.com谷歌",
			"3.www.hibernate.orgHibernate", "4.www.xiami.com虾米" ,"1.www.csdn.net论坛", "2.www.google.com谷歌",
			"3.www.hibernate.orgHibernate", "4.www.xiami.com虾米" ,"1.www.csdn.net论坛", "2.www.google.com谷歌",
			"3.www.hibernate.orgHibernate", "4.www.xiami.com虾米" ,"1.www.csdn.net论坛", "2.www.google.com谷歌",
			"3.www.hibernate.orgHibernate", "4.www.xiami.com虾米" ,"1.www.csdn.net论坛", "2.www.google.com谷歌",
			"3.www.hibernate.orgHibernate", "4.www.xiami.com虾米" ,"1.www.csdn.net论坛", "2.www.google.com谷歌",
			"3.www.hibernate.orgHibernate", "4.www.xiami.com虾米" ,"1.www.csdn.net论坛", "2.www.google.com谷歌",
			"3.www.hibernate.orgHibernate", "4.www.xiami.com虾米" ,"1.www.csdn.net论坛", "2.www.google.com谷歌",
			"3.www.hibernate.orgHibernate", "4.www.xiami.com虾米" ,"1.www.csdn.net论坛", "2.www.google.com谷歌",
			"3.www.hibernate.orgHibernate", "4.www.xiami.com虾米" ,"1.www.csdn.net论坛", "2.www.google.com谷歌",
			"3.www.hibernate.orgHibernate", "4.www.xiami.com虾米" ,"1.www.csdn.net论坛", "2.www.google.com谷歌",
			"3.www.hibernate.orgHibernate", "4.www.xiami.com虾米" ,"1.www.csdn.net论坛", "2.www.google.com谷歌",
			"3.www.hibernate.orgHibernate", "4.www.xiami.com虾米" ,"1.www.csdn.net论坛", "2.www.google.com谷歌",
			"3.www.hibernate.orgHibernate", "4.www.xiami.com虾米" ,"1.www.csdn.net论坛", "2.www.google.com谷歌",
			"3.www.hibernate.orgHibernate", "4.www.xiami.com虾米" ,"1.www.csdn.net论坛", "2.www.google.com谷歌",
			"3.www.hibernate.orgHibernate", "4.www.xiami.com虾米" ,"1.www.csdn.net论坛", "2.www.google.com谷歌",
			"3.www.hibernate.orgHibernate", "4.www.xiami.com虾米" ,"1.www.csdn.net论坛", "2.www.google.com谷歌",
			"3.www.hibernate.orgHibernate", "4.www.xiami.com虾米" ,"1.www.csdn.net论坛", "2.www.google.com谷歌",
			"3.www.hibernate.orgHibernate", "4.www.xiami.com虾米" ,"1.www.csdn.net论坛", "2.www.google.com谷歌",
			"3.www.hibernate.orgHibernate", "4.www.xiami.com虾米" ,"1.www.csdn.net论坛", "2.www.google.com谷歌",
			"3.www.hibernate.orgHibernate", "4.www.xiami.com虾米" ,"1.www.csdn.net论坛", "2.www.google.com谷歌",
			"3.www.hibernate.orgHibernate", "4.www.xiami.com虾米" ,"1.www.csdn.net论坛", "2.www.google.com谷歌",
			"3.www.hibernate.orgHibernate", "4.www.xiami.com虾米" ,"1.www.csdn.net论坛", "2.www.google.com谷歌",
			"3.www.hibernate.orgHibernate", "4.www.xiami.com虾米" ,"1.www.csdn.net论坛", "2.www.google.com谷歌",
			"3.www.hibernate.orgHibernate", "4.www.xiami.com虾米" ,"1.www.csdn.net论坛", "2.www.google.com谷歌",
			"3.www.hibernate.orgHibernate", "4.www.xiami.com虾米" ,"1.www.csdn.net论坛", "2.www.google.com谷歌",
			"3.www.hibernate.orgHibernate", "4.www.xiami.com虾米" ,"1.www.csdn.net论坛", "2.www.google.com谷歌",
			"3.www.hibernate.orgHibernate", "4.www.xiami.com虾米" ,"1.www.csdn.net论坛", "2.www.google.com谷歌",
			"3.www.hibernate.orgHibernate", "4.www.xiami.com虾米" ,"1.www.csdn.net论坛", "2.www.google.com谷歌",
			"3.www.hibernate.orgHibernate", "4.www.xiami.com虾米" ,"1.www.csdn.net论坛", "2.www.google.com谷歌",
			"3.www.hibernate.orgHibernate", "4.www.xiami.com虾米" ,"1.www.csdn.net论坛", "2.www.google.com谷歌",
			"3.www.hibernate.orgHibernate", "4.www.xiami.com虾米" ,"1.www.csdn.net论坛", "2.www.google.com谷歌",
			"3.www.hibernate.orgHibernate", "4.www.xiami.com虾米" ,"1.www.csdn.net论坛", "2.www.google.com谷歌",
			"3.www.hibernate.orgHibernate", "4.www.xiami.com虾米" ,"1.www.csdn.net论坛", "2.www.google.com谷歌",
			"3.www.hibernate.orgHibernate", "4.www.xiami.com虾米" ,"1.www.csdn.net论坛", "2.www.google.com谷歌",
			"3.www.hibernate.orgHibernate", "4.www.xiami.com虾米" ,"1.www.csdn.net论坛", "2.www.google.com谷歌",
			"3.www.hibernate.orgHibernate", "4.www.xiami.com虾米" ,"1.www.csdn.net论坛", "2.www.google.com谷歌",
			"3.www.hibernate.orgHibernate", "4.www.xiami.com虾米" ,"1.www.csdn.net论坛", "2.www.google.com谷歌",
			"3.www.hibernate.orgHibernate", "4.www.xiami.com虾米" ,"1.www.csdn.net论坛", "2.www.google.com谷歌",
			"3.www.hibernate.orgHibernate", "4.www.xiami.com虾米" ,"1.www.csdn.net论坛", "2.www.google.com谷歌",
			"3.www.hibernate.orgHibernate", "4.www.xiami.com虾米" ,"1.www.csdn.net论坛", "2.www.google.com谷歌",
			"3.www.hibernate.orgHibernate", "4.www.xiami.com虾米" ,"1.www.csdn.net论坛", "2.www.google.com谷歌",
			"3.www.hibernate.orgHibernate", "4.www.xiami.com虾米" ,"1.www.csdn.net论坛", "2.www.google.com谷歌",
			"3.www.hibernate.orgHibernate", "4.www.xiami.com虾米" ,"1.www.csdn.net论坛", "2.www.google.com谷歌",
			"3.www.hibernate.orgHibernate", "4.www.xiami.com虾米" ,"1.www.csdn.net论坛", "2.www.google.com谷歌",
			"3.www.hibernate.orgHibernate", "4.www.xiami.com虾米" ,"1.www.csdn.net论坛", "2.www.google.com谷歌",
			"3.www.hibernate.orgHibernate", "4.www.xiami.com虾米" ,"1.www.csdn.net论坛", "2.www.google.com谷歌",
			"3.www.hibernate.orgHibernate", "4.www.xiami.com虾米" ,"1.www.csdn.net论坛", "2.www.google.com谷歌",
			"3.www.hibernate.orgHibernate", "4.www.xiami.com虾米" ,"1.www.csdn.net论坛", "2.www.google.com谷歌",
			"3.www.hibernate.orgHibernate", "4.www.xiami.com虾米" ,"1.www.csdn.net论坛", "2.www.google.com谷歌",
			"3.www.hibernate.orgHibernate", "4.www.xiami.com虾米" ,"1.www.csdn.net论坛", "2.www.google.com谷歌",
			"3.www.hibernate.orgHibernate", "4.www.xiami.com虾米" ,"1.www.csdn.net论坛", "2.www.google.com谷歌",
			"3.www.hibernate.orgHibernate", "4.www.xiami.com虾米" ,"1.www.csdn.net论坛", "2.www.google.com谷歌",
			"3.www.hibernate.orgHibernate", "4.www.xiami.com虾米" ,"1.www.csdn.net论坛", "2.www.google.com谷歌",
			"3.www.hibernate.orgHibernate", "4.www.xiami.com虾米" ,"1.www.csdn.net论坛", "2.www.google.com谷歌",
			"3.www.hibernate.orgHibernate", "4.www.xiami.com虾米" ,"1.www.csdn.net论坛", "2.www.google.com谷歌",
			"3.www.hibernate.orgHibernate", "4.www.xiami.com虾米" ,"1.www.csdn.net论坛", "2.www.google.com谷歌",
			"3.www.hibernate.orgHibernate", "4.www.xiami.com虾米" ,"1.www.csdn.net论坛", "2.www.google.com谷歌",
			"3.www.hibernate.orgHibernate", "4.www.xiami.com虾米" ,"1.www.csdn.net论坛", "2.www.google.com谷歌",
			"3.www.hibernate.orgHibernate", "4.www.xiami.com虾米" ,"1.www.csdn.net论坛", "2.www.google.com谷歌",
			"3.www.hibernate.orgHibernate", "4.www.xiami.com虾米" ,"1.www.csdn.net论坛", "2.www.google.com谷歌",
			"3.www.hibernate.orgHibernate", "4.www.xiami.com虾米" ,"1.www.csdn.net论坛", "2.www.google.com谷歌",
			"3.www.hibernate.orgHibernate", "4.www.xiami.com虾米" ,"1.www.csdn.net论坛", "2.www.google.com谷歌",
			"3.www.hibernate.orgHibernate", "4.www.xiami.com虾米" ,"1.www.csdn.net论坛", "2.www.google.com谷歌",
			"3.www.hibernate.orgHibernate", "4.www.xiami.com虾米" ,"1.www.csdn.net论坛", "2.www.google.com谷歌",
			"3.www.hibernate.orgHibernate", "4.www.xiami.com虾米" ,"1.www.csdn.net论坛", "2.www.google.com谷歌",
			"3.www.hibernate.orgHibernate", "4.www.xiami.com虾米" ,"1.www.csdn.net论坛", "2.www.google.com谷歌",
			"3.www.hibernate.orgHibernate", "4.www.xiami.com虾米" ,"1.www.csdn.net论坛", "2.www.google.com谷歌",
			"3.www.hibernate.orgHibernate", "4.www.xiami.com虾米" ,"1.www.csdn.net论坛", "2.www.google.com谷歌",
			"3.www.hibernate.orgHibernate", "4.www.xiami.com虾米" ,"1.www.csdn.net论坛", "2.www.google.com谷歌",
			"3.www.hibernate.orgHibernate", "4.www.xiami.com虾米" ,"1.www.csdn.net论坛", "2.www.google.com谷歌",
			"3.www.hibernate.orgHibernate", "4.www.xiami.com虾米" ,"1.www.csdn.net论坛", "2.www.google.com谷歌",
			"3.www.hibernate.orgHibernate", "4.www.xiami.com虾米" ,"1.www.csdn.net论坛", "2.www.google.com谷歌",
			"3.www.hibernate.orgHibernate", "4.www.xiami.com虾米" ,"1.www.csdn.net论坛", "2.www.google.com谷歌",
			"3.www.hibernate.orgHibernate", "4.www.xiami.com虾米" ,"1.www.csdn.net论坛", "2.www.google.com谷歌",
			"3.www.hibernate.orgHibernate", "4.www.xiami.com虾米" ,"1.www.csdn.net论坛", "2.www.google.com谷歌",
			"3.www.hibernate.orgHibernate", "4.www.xiami.com虾米" ,"1.www.csdn.net论坛", "2.www.google.com谷歌",
			"3.www.hibernate.orgHibernate", "4.www.xiami.com虾米" ,"1.www.csdn.net论坛", "2.www.google.com谷歌",
			"3.www.hibernate.orgHibernate", "4.www.xiami.com虾米" ,"1.www.csdn.net论坛", "2.www.google.com谷歌",
			"3.www.hibernate.orgHibernate", "4.www.xiami.com虾米" ,"1.www.csdn.net论坛", "2.www.google.com谷歌",
			"3.www.hibernate.orgHibernate", "4.www.xiami.com虾米" ,"1.www.csdn.net论坛", "2.www.google.com谷歌",
			"3.www.hibernate.orgHibernate", "4.www.xiami.com虾米" ,"1.www.csdn.net论坛", "2.www.google.com谷歌",
			"3.www.hibernate.orgHibernate", "4.www.xiami.com虾米" ,"1.www.csdn.net论坛", "2.www.google.com谷歌",
			"3.www.hibernate.orgHibernate", "4.www.xiami.com虾米" ,"1.www.csdn.net论坛", "2.www.google.com谷歌",
			"3.www.hibernate.orgHibernate", "4.www.xiami.com虾米" ,"1.www.csdn.net论坛", "2.www.google.com谷歌",
			"3.www.hibernate.orgHibernate", "4.www.xiami.com虾米" ,"1.www.csdn.net论坛", "2.www.google.com谷歌",
			"3.www.hibernate.orgHibernate", "4.www.xiami.com虾米" ,"1.www.csdn.net论坛", "2.www.google.com谷歌",
			"3.www.hibernate.orgHibernate", "4.www.xiami.com虾米" ,"1.www.csdn.net论坛", "2.www.google.com谷歌",
			"3.www.hibernate.orgHibernate", "4.www.xiami.com虾米" ,"1.www.csdn.net论坛", "2.www.google.com谷歌",
			"3.www.hibernate.orgHibernate", "4.www.xiami.com虾米" ,"1.www.csdn.net论坛", "2.www.google.com谷歌",
			"3.www.hibernate.orgHibernate", "4.www.xiami.com虾米" ,"1.www.csdn.net论坛", "2.www.google.com谷歌",
			"3.www.hibernate.orgHibernate", "4.www.xiami.com虾米" ,"1.www.csdn.net论坛", "2.www.google.com谷歌",
			"3.www.hibernate.orgHibernate", "4.www.xiami.com虾米" ,"1.www.csdn.net论坛", "2.www.google.com谷歌",
			"3.www.hibernate.orgHibernate", "4.www.xiami.com虾米" ,"1.www.csdn.net论坛", "2.www.google.com谷歌",
			"3.www.hibernate.orgHibernate", "4.www.xiami.com虾米" ,"1.www.csdn.net论坛", "2.www.google.com谷歌",
			"3.www.hibernate.orgHibernate", "4.www.xiami.com虾米" ,"1.www.csdn.net论坛", "2.www.google.com谷歌",
			"3.www.hibernate.orgHibernate", "4.www.xiami.com虾米" ,"1.www.csdn.net论坛", "2.www.google.com谷歌",
			"3.www.hibernate.orgHibernate", "4.www.xiami.com虾米" ,"1.www.csdn.net论坛", "2.www.google.com谷歌",
			"3.www.hibernate.orgHibernate", "4.www.xiami.com虾米" ,"1.www.csdn.net论坛", "2.www.google.com谷歌",
			"3.www.hibernate.orgHibernate", "4.www.xiami.com虾米" ,"1.www.csdn.net论坛", "2.www.google.com谷歌",
			"3.www.hibernate.orgHibernate", "4.www.xiami.com虾米" ,"1.www.csdn.net论坛", "2.www.google.com谷歌",
			"3.www.hibernate.orgHibernate", "4.www.xiami.com虾米" ,"1.www.csdn.net论坛", "2.www.google.com谷歌",
			"3.www.hibernate.orgHibernate", "4.www.xiami.com虾米" ,"1.www.csdn.net论坛", "2.www.google.com谷歌",
			"3.www.hibernate.orgHibernate", "4.www.xiami.com虾米" ,"1.www.csdn.net论坛", "2.www.google.com谷歌",
			"3.www.hibernate.orgHibernate", "4.www.xiami.com虾米" ,"1.www.csdn.net论坛", "2.www.google.com谷歌",
			"3.www.hibernate.orgHibernate", "4.www.xiami.com虾米" ,"1.www.csdn.net论坛", "2.www.google.com谷歌",
			"3.www.hibernate.orgHibernate", "4.www.xiami.com虾米" ,"1.www.csdn.net论坛", "2.www.google.com谷歌",
			"3.www.hibernate.orgHibernate", "4.www.xiami.com虾米" ,"1.www.csdn.net论坛", "2.www.google.com谷歌",
			"3.www.hibernate.orgHibernate", "4.www.xiami.com虾米" ,"1.www.csdn.net论坛", "2.www.google.com谷歌",
			"3.www.hibernate.orgHibernate", "4.www.xiami.com虾米" ,"1.www.csdn.net论坛", "2.www.google.com谷歌",
			"3.www.hibernate.orgHibernate", "4.www.xiami.com虾米" ,"1.www.csdn.net论坛", "2.www.google.com谷歌",
			"3.www.hibernate.orgHibernate", "4.www.xiami.com虾米" ,"1.www.csdn.net论坛", "2.www.google.com谷歌",
			"3.www.hibernate.orgHibernate", "4.www.xiami.com虾米" ,"1.www.csdn.net论坛", "2.www.google.com谷歌",
			"3.www.hibernate.orgHibernate", "4.www.xiami.com虾米" ,"1.www.csdn.net论坛", "2.www.google.com谷歌",
			"3.www.hibernate.orgHibernate", "4.www.xiami.com虾米" ,"1.www.csdn.net论坛", "2.www.google.com谷歌",
			"3.www.hibernate.orgHibernate", "4.www.xiami.com虾米" ,"1.www.csdn.net论坛", "2.www.google.com谷歌",
			"3.www.hibernate.orgHibernate", "4.www.xiami.com虾米" ,"1.www.csdn.net论坛", "2.www.google.com谷歌",
			"3.www.hibernate.orgHibernate", "4.www.xiami.com虾米" ,"1.www.csdn.net论坛", "2.www.google.com谷歌",
			"3.www.hibernate.orgHibernate", "4.www.xiami.com虾米" ,"1.www.csdn.net论坛", "2.www.google.com谷歌",
			"3.www.hibernate.orgHibernate", "4.www.xiami.com虾米" ,"1.www.csdn.net论坛", "2.www.google.com谷歌",
			"3.www.hibernate.orgHibernate", "4.www.xiami.com虾米" ,"1.www.csdn.net论坛", "2.www.google.com谷歌",
			"3.www.hibernate.orgHibernate", "4.www.xiami.com虾米" ,"1.www.csdn.net论坛", "2.www.google.com谷歌",
			"3.www.hibernate.orgHibernate", "4.www.xiami.com虾米" ,"1.www.csdn.net论坛", "2.www.google.com谷歌",
			"3.www.hibernate.orgHibernate", "4.www.xiami.com虾米" ,"1.www.csdn.net论坛", "2.www.google.com谷歌",
			"3.www.hibernate.orgHibernate", "4.www.xiami.com虾米" ,"1.www.csdn.net论坛", "2.www.google.com谷歌",
			"3.www.hibernate.orgHibernate", "4.www.xiami.com虾米" ,"1.www.csdn.net论坛", "2.www.google.com谷歌",
			"3.www.hibernate.orgHibernate", "4.www.xiami.com虾米" ,"1.www.csdn.net论坛", "2.www.google.com谷歌",
			"3.www.hibernate.orgHibernate", "4.www.xiami.com虾米" ,"1.www.csdn.net论坛", "2.www.google.com谷歌",
			"3.www.hibernate.orgHibernate", "4.www.xiami.com虾米" ,"1.www.csdn.net论坛", "2.www.google.com谷歌",
			"3.www.hibernate.orgHibernate", "4.www.xiami.com虾米" ,"1.www.csdn.net论坛", "2.www.google.com谷歌",
			"3.www.hibernate.orgHibernate", "4.www.xiami.com虾米" ,"1.www.csdn.net论坛", "2.www.google.com谷歌",
			"3.www.hibernate.orgHibernate", "4.www.xiami.com虾米" ,"1.www.csdn.net论坛", "2.www.google.com谷歌",
			"3.www.hibernate.orgHibernate", "4.www.xiami.com虾米" ,"1.www.csdn.net论坛", "2.www.google.com谷歌",
			"3.www.hibernate.orgHibernate", "4.www.xiami.com虾米" ,"1.www.csdn.net论坛", "2.www.google.com谷歌",
			"3.www.hibernate.orgHibernate", "4.www.xiami.com虾米" ,"1.www.csdn.net论坛", "2.www.google.com谷歌",
			"3.www.hibernate.orgHibernate", "4.www.xiami.com虾米" ,"1.www.csdn.net论坛", "2.www.google.com谷歌",
			"3.www.hibernate.orgHibernate", "4.www.xiami.com虾米" ,"1.www.csdn.net论坛", "2.www.google.com谷歌",
			"3.www.hibernate.orgHibernate", "4.www.xiami.com虾米" ,"1.www.csdn.net论坛", "2.www.google.com谷歌",
			"3.www.hibernate.orgHibernate", "4.www.xiami.com虾米" ,"1.www.csdn.net论坛", "2.www.google.com谷歌",
			"3.www.hibernate.orgHibernate", "4.www.xiami.com虾米" ,"1.www.csdn.net论坛", "2.www.google.com谷歌",
			"3.www.hibernate.orgHibernate", "4.www.xiami.com虾米" ,"1.www.csdn.net论坛", "2.www.google.com谷歌",
			"3.www.hibernate.orgHibernate", "4.www.xiami.com虾米" ,"1.www.csdn.net论坛", "2.www.google.com谷歌",
			"3.www.hibernate.orgHibernate", "4.www.xiami.com虾米" ,"1.www.csdn.net论坛", "2.www.google.com谷歌",
			"3.www.hibernate.orgHibernate", "4.www.xiami.com虾米" ,"1.www.csdn.net论坛", "2.www.google.com谷歌",
			"3.www.hibernate.orgHibernate", "4.www.xiami.com虾米" ,"1.www.csdn.net论坛", "2.www.google.com谷歌",
			"3.www.hibernate.orgHibernate", "4.www.xiami.com虾米" ,"1.www.csdn.net论坛", "2.www.google.com谷歌",
			"3.www.hibernate.orgHibernate", "4.www.xiami.com虾米" ,"1.www.csdn.net论坛", "2.www.google.com谷歌",
			"3.www.hibernate.orgHibernate", "4.www.xiami.com虾米" ,"1.www.csdn.net论坛", "2.www.google.com谷歌",
			"3.www.hibernate.orgHibernate", "4.www.xiami.com虾米" ,"1.www.csdn.net论坛", "2.www.google.com谷歌",
			"3.www.hibernate.orgHibernate", "4.www.xiami.com虾米" ,"1.www.csdn.net论坛", "2.www.google.com谷歌",
			"3.www.hibernate.orgHibernate", "4.www.xiami.com虾米" ,"1.www.csdn.net论坛", "2.www.google.com谷歌",
			"3.www.hibernate.orgHibernate", "4.www.xiami.com虾米" ,"1.www.csdn.net论坛", "2.www.google.com谷歌",
			"3.www.hibernate.orgHibernate", "4.www.xiami.com虾米" ,"1.www.csdn.net论坛", "2.www.google.com谷歌",
			"3.www.hibernate.orgHibernate", "4.www.xiami.com虾米" ,"1.www.csdn.net论坛", "2.www.google.com谷歌",
			"3.www.hibernate.orgHibernate", "4.www.xiami.com虾米" ,"1.www.csdn.net论坛", "2.www.google.com谷歌",
			"3.www.hibernate.orgHibernate", "4.www.xiami.com虾米" ,"1.www.csdn.net论坛", "2.www.google.com谷歌",
			"3.www.hibernate.orgHibernate", "4.www.xiami.com虾米" ,"1.www.csdn.net论坛", "2.www.google.com谷歌",
			"3.www.hibernate.orgHibernate", "4.www.xiami.com虾米" ,"1.www.csdn.net论坛", "2.www.google.com谷歌",
			"3.www.hibernate.orgHibernate", "4.www.xiami.com虾米" ,"1.www.csdn.net论坛", "2.www.google.com谷歌",
			"3.www.hibernate.orgHibernate", "4.www.xiami.com虾米" ,"1.www.csdn.net论坛", "2.www.google.com谷歌",
			"3.www.hibernate.orgHibernate", "4.www.xiami.com虾米" ,"1.www.csdn.net论坛", "2.www.google.com谷歌",
			"3.www.hibernate.orgHibernate", "4.www.xiami.com虾米" ,"1.www.csdn.net论坛", "2.www.google.com谷歌",
			"3.www.hibernate.orgHibernate", "4.www.xiami.com虾米" ,"1.www.csdn.net论坛", "2.www.google.com谷歌",
			"3.www.hibernate.orgHibernate", "4.www.xiami.com虾米" ,"1.www.csdn.net论坛", "2.www.google.com谷歌",
			"3.www.hibernate.orgHibernate", "4.www.xiami.com虾米" ,"1.www.csdn.net论坛", "2.www.google.com谷歌",
			"3.www.hibernate.orgHibernate", "4.www.xiami.com虾米" ,"1.www.csdn.net论坛", "2.www.google.com谷歌",
			"3.www.hibernate.orgHibernate", "4.www.xiami.com虾米" ,"1.www.csdn.net论坛", "2.www.google.com谷歌",
			"3.www.hibernate.orgHibernate", "4.www.xiami.com虾米" ,"1.www.csdn.net论坛", "2.www.google.com谷歌",
			"3.www.hibernate.orgHibernate", "4.www.xiami.com虾米" ,"1.www.csdn.net论坛", "2.www.google.com谷歌",
			"3.www.hibernate.orgHibernate", "4.www.xiami.com虾米" ,"1.www.csdn.net论坛", "2.www.google.com谷歌",
			"3.www.hibernate.orgHibernate", "4.www.xiami.com虾米" };
	private PipedWriter pw;

	public WriterThread() {

	}

	public WriterThread(PipedWriter pw) {
		this.pw = pw;
	}

	public void run() {
		System.out.println(Thread.currentThread().getName());
		try {
			// 向管道流中写入数据，以供读取
			for (int i = 0; i < str.length; i++) {
				pw.write(i+str[i] + "\n");
				System.out.println(i+str[i] + "\n");
			}
			System.out.println("------写入完成");
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (pw != null) {
					pw.close();
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
