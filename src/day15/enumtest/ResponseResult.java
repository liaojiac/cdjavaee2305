package day15.enumtest;

public enum ResponseResult implements IResponse{
	SUCCESS(0,"成功"),NO_NUMBER(1,"找不到号码")
	;
	private Integer code;//编码;
	private String message;//消息
	private ResponseResult(Integer code, String message) {
		this.code = code;
		this.message = message;
	}
	public Integer getCode() {
		return code;
	}
	public void setCode(Integer code) {
		this.code = code;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
	
}
