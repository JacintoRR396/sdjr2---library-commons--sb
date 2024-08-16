package com.sdjr2.sb.library_commons.controllers;

import org.springframework.data.domain.Page;

import com.sdjr2.sb.library_commons.models.dto.BaseDTO;


/**
 * {@link BaseControllerHelper} class.
 * <p>
 * <strong>Controller</strong> - Helper class with the common controller.
 *
 * @author Jacinto R^2
 * @version 1.0
 * @category Controller
 * @upgrade 24/08/16
 * @since 24/08/16
 */
public class BaseControllerHelper {
	
	private BaseControllerHelper () {
		throw new IllegalStateException( "Utility class" );
	}
	
	public static String formatLogContentResp(String content) {
		return "- Content: " + content;
	}
	
	public static <T extends BaseDTO> String formatLogPageResp(Page<T> res) {
		return "- Offset: " + res.getNumber()
				+ ", Limit: " + res.getSize()
				+ ", TotalElements: " + res.getTotalElements()
				+ ", TotalPages: " + res.getTotalPages()
				+ ", Content: " + res.getContent();
	}
	
	public static String formatLogBodyReq(String body) {
		return "- Body: " + body;
	}

}
