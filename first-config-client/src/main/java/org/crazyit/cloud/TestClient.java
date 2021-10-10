package org.crazyit.cloud;

import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

public class TestClient {

	public static void main(String[] args) throws Exception {
		CloseableHttpClient client = HttpClients.createDefault();
		HttpPost post = new HttpPost("http://localhost:8080/refresh");
		HttpResponse response = client.execute(post);
		System.out.println(EntityUtils.toString(response.getEntity()));
	}

}
