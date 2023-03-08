package com.bujue.skill.Exception;


/**
 * @Author HeZhe
 * @Date 2023/3/8 17:51
 * @Version 1.0
 */
public class ServiceException extends ApplicationException {
	public ServiceException() {
	}

	public ServiceException(String msg) {
		super(msg);
	}

	public ServiceException(String errorCode, String msg) {
		super(errorCode, msg);
	}

	public ServiceException(String msg, Throwable innerException) {
		super(msg, innerException);
	}

	public ServiceException(String errorCode, String msg, Throwable innerException) {
		super(errorCode, msg, innerException);
	}
}
