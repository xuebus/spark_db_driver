import com.mongodb.casbah.MongoClient;
import com.mongodb.client.MongoDatabase;

/**
 * Created by yinmuyang on 16/11/14.
 */
public class MongoDBJDBC {
    public static void main( String args[] ){
        try{
            // 连接到 mongodb 服务
//            MongoClient mongoClient = new MongoClient( "localhost" , 27017 );
//
//            // 连接到数据库
//            MongoDatabase mongoDatabase = mongoClient.dropDatabase().getDatabase("mycol");
//            System.out.println("Connect to database successfully");

        }catch(Exception e){
            System.err.println( e.getClass().getName() + ": " + e.getMessage() );
        }
    }
}
