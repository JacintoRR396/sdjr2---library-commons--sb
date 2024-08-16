package com.sdjr2.sb.library_commons.config;

import java.util.Objects;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.sdjr2.sb.library_commons.models.dto.errors.RespEntityErrorDTO;
import com.sdjr2.sb.library_commons.utils.UConstants;

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

	private Logger logger;

	public BaseHandlerLogger(Class<?> clazz) {
		super();
		this.logger = LoggerFactory.getLogger( clazz );
	}
	
	public void info(String message) {
		this.logger.info(UConstants.MSG_BASE_INFO + "{}.", message);
    }
	
	public void info(String clazz, String method, String message) {
		String msg = this.createMessage(clazz, method, message, null);
		this.logger.info(UConstants.MSG_BASE_INFO + "{}.", msg);
    }
	
	public void infoRequest(String message) {
		this.logger.info(UConstants.MSG_BASE_INFO_REQUEST + "{}.", message);
    }
	
	public void infoRequest(String clazz, String method, String message) {
		String msg = this.createMessage(clazz, method, message, null);
		this.logger.info(UConstants.MSG_BASE_INFO_REQUEST + "{}.", msg);
    }
	
	public void infoResponse(String message) {
		this.logger.info(UConstants.MSG_BASE_INFO_RESPONSE + "{}.", message);
    }
	
	public void infoResponse(String clazz, String method, String message) {
		String msg = this.createMessage(clazz, method, message, null);
		this.logger.info(UConstants.MSG_BASE_INFO_RESPONSE + "{}.", msg);
    }
	
	public void debug(String message) {
		this.logger.debug(UConstants.MSG_BASE_DEBUG + "{}.", message);
    }
	
	public void debug(String clazz, String method, String message) {
		String msg = this.createMessage(clazz, method, message, null);
		this.logger.debug(UConstants.MSG_BASE_DEBUG + "{}.", msg);
    }
	
	public void error(String message) {
		this.logger.error(UConstants.MSG_BASE_ERROR + "{}.", message);
    }
	
	public void error(String clazz, String method, String message) {
		String msg = this.createMessage(clazz, method, message, null);
		this.logger.error(UConstants.MSG_BASE_ERROR + "{}.", msg);
    }
	
	public void error(RespEntityErrorDTO error) {
		String msg = error.getErrorCode() + ": " + error.getExMessage() + ". " + error.getExMessage() + ": " + error.getExTrackTrace();
		this.logger.error(UConstants.MSG_BASE_ERROR + "{}.", msg);
    }
	
	public void error(String clazz, String method, String message, Exception ex) {
		String msg = this.createMessage(clazz, method, message, ex);
		this.logger.error(UConstants.MSG_BASE_ERROR + "{}.", msg);
    }
	
	private String createMessage(String clazz, String method, String message, Exception ex) {
		String msgEx = (Objects.isNull(ex)) ? "" : ". " + ex.getCause() + ": " + ex.getMessage();
		return clazz + "::" + method + " » " + message + msgEx;
	}
}
