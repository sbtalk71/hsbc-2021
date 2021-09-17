package com.hdbc.mongo;

import java.util.Iterator;

import org.bson.Document;

import com.mongodb.BasicDBObject;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

public class MongoDemo {

	public static void main(String[] args) {
		MongoClient client=MongoClients.create();
		MongoDatabase db= client.getDatabase("trainingdb");
		
		MongoCollection<Document> empCollection = db.getCollection("emp");
		System.out.println(empCollection.countDocuments());
		
		//FindIterable<Document> itrDoc= empCollection.find();
		//FindIterable<Document> itrDoc= empCollection.find(new Document().append("_id", 110));
		
		BasicDBObject getQuery = new BasicDBObject();
	    getQuery.put("salary", new BasicDBObject("$gt", 40000));
	    
		FindIterable<Document> itrDoc= empCollection.find(getQuery);
		
		Iterator<Document> itr=itrDoc.iterator();
		while(itr.hasNext()) {
			Document doc=itr.next();
			System.out.println(doc.get("name")+" "+doc.get("address")+" "+doc.get("salary"));
		}
		
		Document newEmp = new Document();
		newEmp.append("name", "Kishore").append("address", "Chennai").append("salary", 56000).append("_id", 110);
		
		//empCollection.insertOne(newEmp);
	}
	

}
