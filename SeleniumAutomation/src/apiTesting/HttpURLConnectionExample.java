package apiTesting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;


public class HttpURLConnectionExample {

	public static void main(String[] args) throws IOException {
		HttpURLConnectionExample connectionExample = new HttpURLConnectionExample();
		connectionExample.putRequestExample();

	}

	public void getMethodExample() throws IOException {

		URL url = new URL("http://dummy.restapiexample.com/api/v1/employees");
		HttpURLConnection connection = (HttpURLConnection)url.openConnection();
		connection.setRequestMethod("GET");
		connection.connect();

		int statusCode = connection.getResponseCode();
		System.out.println("Status code is  "+ statusCode);

		String message = connection.getResponseMessage();
		System.out.println("Response message is  "+ message);

		InputStream inputStream = connection.getInputStream();
		InputStreamReader inputStreamReader = new InputStreamReader(inputStream);

		BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

		String line;
		StringBuffer buffer = new StringBuffer();
		while((line=bufferedReader.readLine())!=null) {
			buffer.append(line);
		}
		System.out.println(buffer);
	}

	public void postMethodExample() throws IOException {
		URL url = new URL("http://dummy.restapiexample.com/api/v1/create");
		HttpURLConnection connection = (HttpURLConnection)url.openConnection();
		connection.setRequestMethod("POST");

		connection.setRequestProperty("Content-Type", "application/json");
		connection.setDoOutput(true);

		String jsonBody = "{\"name\":\"SK\",\"salary\":\"10000\",\"age\":\"23\"}";
		byte[] inputJson = jsonBody.getBytes();

		OutputStream outputStream =  connection.getOutputStream();

		outputStream.write(inputJson);

		int statusCode = connection.getResponseCode();
		System.out.println("Status code is  "+ statusCode);

		String message = connection.getResponseMessage();
		System.out.println("Response message is  "+ message);
		
		InputStream inputStream = connection.getInputStream();
		InputStreamReader inputStreamReader = new InputStreamReader(inputStream);

		BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

		String line;
		StringBuffer buffer = new StringBuffer();
		while((line=bufferedReader.readLine())!=null) {
			buffer.append(line);
		}
		System.out.println(buffer);

	}
	
	public void putRequestExample() throws IOException {
		
		URL url = new URL("http://dummy.restapiexample.com/api/v1/update/4");
		HttpURLConnection connection = (HttpURLConnection)url.openConnection();
		connection.setRequestMethod("PUT");

		connection.setRequestProperty("Content-Type", "application/json");
		connection.setDoOutput(true);

		String jsonBody = "{\"name\":\"testing\",\"salary\":\"10001\",\"age\":\"25\"}";
		byte[] inputJson = jsonBody.getBytes();

		OutputStream outputStream =  connection.getOutputStream();

		outputStream.write(inputJson);

		int statusCode = connection.getResponseCode();
		System.out.println("Status code is  "+ statusCode);

		String message = connection.getResponseMessage();
		System.out.println("Response message is  "+ message);
		
		InputStream inputStream = connection.getInputStream();
		InputStreamReader inputStreamReader = new InputStreamReader(inputStream);

		BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

		String line;
		StringBuffer buffer = new StringBuffer();
		while((line=bufferedReader.readLine())!=null) {
			buffer.append(line);
		}
		System.out.println(buffer);

		
	}
	
	public void deleteRequestExample() throws IOException {
		
		URL url = new URL("http://dummy.restapiexample.com/api/v1/delete/12");
		HttpURLConnection connection = (HttpURLConnection)url.openConnection();
		connection.setRequestMethod("DELETE");

		connection.setRequestProperty("Content-Type", "application/json");
		connection.setDoOutput(true);
		
		int statusCode = connection.getResponseCode();
		System.out.println("Status code is  "+ statusCode);

		String message = connection.getResponseMessage();
		System.out.println("Response message is  "+ message);
		
		InputStream inputStream = connection.getInputStream();
		InputStreamReader inputStreamReader = new InputStreamReader(inputStream);

		BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

		String line;
		StringBuffer buffer = new StringBuffer();
		while((line=bufferedReader.readLine())!=null) {
			buffer.append(line);
		}
		System.out.println(buffer);
		
	}

}
