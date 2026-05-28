package com.ssdjr2.own.sbc.tool.library_commons.config;

import java.util.Objects;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ssdjr2.own.sbc.tool.library_commons.models.dto.errors.RespEntityErrorDTO;
import com.ssdjr2.own.sbc.tool.library_commons.utils.UConstants;

/**
 * {@link BaseHandlerLogger} class.
 * <p>
 * <strong>Config</strong> - Global configuration about handler logger.
 *
 * @author Jacinto R^2
 * @version 1.0
 * @category Config
 * @upgrade 24/08/15
 * @since 24/08/13
 */
public class BaseHandlerLogger {

	private final Logger logger;

	public BaseHandlerLogger(Class<?> clazz) {
		super();
		this.logger = LoggerFactory.getLogger( clazz );
	}
	
	public void info(String message) {
		this.logger.info(UConstants.MSG_BASE_INFO + "{}.", message);
	}
	
	public void info(String clazz, String method, String message) {
		this.createMessage(clazz, method, message, UConstants.MSG_BASE_INFO, null);
	}
	
	public void infoRequest(String message) {
		this.logger.info(UConstants.MSG_BASE_INFO_REQUEST + "{}.", message);
	}
	
	public void infoRequest(String clazz, String method, String message) {
		this.createMessage(clazz, method, message, UConstants.MSG_BASE_INFO_REQUEST, null);
	}
	
	public void infoResponse(String message) {
		this.logger.info(UConstants.MSG_BASE_INFO_RESPONSE + "{}.", message);
	}
	
	public void infoResponse(String clazz, String method, String message) {
		this.createMessage(clazz, method, message, UConstants.MSG_BASE_INFO_RESPONSE, null);
	}
	
	public void debug(String message) {
		this.logger.debug(UConstants.MSG_BASE_DEBUG + "{}.", message);
    }
	
	public void debug(String clazz, String method, String message) {
		this.createMessage(clazz, method, message, UConstants.MSG_BASE_DEBUG, null);
	}
	
	public void error(String message) {
		this.logger.error(UConstants.MSG_BASE_ERROR + "{}.", message);
	}

	public void error(String clazz, String method, String message, Exception ex) {
		this.createMessage(clazz, method, UConstants.MSG_BASE_ERROR, message, ex);
	}
	
	public void error(String clazz, String method, String message) {
		this.createMessage(clazz, method, message, UConstants.MSG_BASE_ERROR, null);
	}
	
	public void error(RespEntityErrorDTO error) {
		String msg = error.getErrorCode() + ": " + error.getExMessage() + ". " + error.getExMessage() + ": " + error.getExTrackTrace();
		this.logger.error(UConstants.MSG_BASE_ERROR + "{}.", msg);
	}
	
	private void createMessage(String clazz, String method, String messagePrefix, String message, Exception ex) {
		String msgEx = (Objects.isNull(ex)) ? "" : ". " + ex.getCause() + ": " + ex.getMessage();
		String msgFormatter = messagePrefix + clazz + "::" + method + " » " + message + msgEx;
		this.logger.error(msgFormatter);
	}
}
