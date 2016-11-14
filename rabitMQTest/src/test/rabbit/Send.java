package test.rabbit;

import java.util.Date;

import com.rabbitmq.client.ConnectionFactory;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.Channel;

public class Send {
   private final static String QUEUE_NAME = "hello";
   
   public static void main(String[] argv) throws Exception {
	    ConnectionFactory factory = new ConnectionFactory();
	    factory.setHost("localhost");
	    
	    Connection connection = factory.newConnection();
	    Channel channel = connection.createChannel();
	    
	    channel.queueDeclare(QUEUE_NAME, false, false, false, null);
	    //String msg = "Hello World";
	    String msg = "{ ReqId = 1, RequestedDateTime:" + new Date() + " Status: 0 }";
	    
	    channel.basicPublish("", QUEUE_NAME, null, msg.getBytes());
	    System.out.println("send message :" + msg);
	    
	    channel.close();
	    connection.close();
   }
}
