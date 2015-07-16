package edu.mum.cs.ds.atm.model;

public class Response {

	private Request request;
	private boolean isRequestSuccess;
	private String message;
	
	public Response(){
		
	}
	
	public Response(Request request, boolean isRequestSuccess) {
		super();
		this.request = request;
		this.isRequestSuccess = isRequestSuccess;
	}
	public Response(Request request, boolean isRequestSuccess, String message) {
		super();
		this.request = request;
		this.isRequestSuccess = isRequestSuccess;
		this.message = message;
	}
	public Request getRequest() {
		return request;
	}
	public void setRequest(Request request) {
		this.request = request;
	}
	public boolean isRequestSuccess() {
		return isRequestSuccess;
	}
	public void setRequestSuccess(boolean isRequestSuccess) {
		this.isRequestSuccess = isRequestSuccess;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	@Override
	public String toString() {
		return "Response [request=" + request + ", isRequestSuccess="
				+ isRequestSuccess + ", message=" + message + "]";
	}
	
	
}
