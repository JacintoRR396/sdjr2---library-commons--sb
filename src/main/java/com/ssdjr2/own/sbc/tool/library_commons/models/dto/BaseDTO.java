package com.ssdjr2.own.sbc.tool.library_commons.models.dto;

import com.ssdjr2.own.sbc.tool.library_commons.utils.UJsonAdapter;

/**
 * {@link BaseDTO} class.
 * <p>
 * <strong>DTO</strong> - Interface with the common dto.
 *
 * @author Jacinto R^2
 * @version 1.0
 * @category DTO
 * @upgrade 24/07/15
 * @since 23/06/20
 */
public interface BaseDTO {

	static BaseDTO toJsonObj ( final String jsonData ) {
		return UJsonAdapter.readValue( jsonData, BaseDTO.class );
	}

	static String toJsonStr ( final BaseDTO objWebResp ) {
		return UJsonAdapter.writeValueAsString( objWebResp );
	}
}
