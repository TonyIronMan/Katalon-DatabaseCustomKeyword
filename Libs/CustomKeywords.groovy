

import java.lang.String


def static "com.database.mysql.connectDB"(
    	String url	
     , 	String port	
     , 	String dbname	
     , 	String username	
     , 	String password	) {
    (new com.database.mysql()).connectDB(
        	url
         , 	port
         , 	dbname
         , 	username
         , 	password)
}

def static "com.database.mysql.executeQuery"(
    	String queryString	) {
    (new com.database.mysql()).executeQuery(
        	queryString)
}

def static "com.database.mysql.closeDatabaseConnection"() {
    (new com.database.mysql()).closeDatabaseConnection()
}

def static "com.database.mysql.execute"(
    	String queryString	) {
    (new com.database.mysql()).execute(
        	queryString)
}
