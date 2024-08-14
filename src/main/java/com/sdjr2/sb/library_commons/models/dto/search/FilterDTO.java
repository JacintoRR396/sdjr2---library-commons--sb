package com.sdjr2.sb.library_commons.models.dto.search;

import java.io.Serial;
import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.sdjr2.sb.library_commons.models.dto.BaseDTO;
import com.sdjr2.sb.library_commons.models.enums.OperatorFilterEnum;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * {@link FilterDTO} class.
 * <p>
 * <strong>DTO</strong> - Represents a generic filter used by advanced search, implements to {@link BaseDTO}.
 *
 * @author Jacinto R^2
 * @version 1.0
 * @category DTO
 * @upgrade 24/07/17
 * @since 24/07/17
 */
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class FilterDTO implements BaseDTO, Serializable {

	@Serial
	private static final long serialVersionUID = 4444506372828582233L;

	/*
	 * attribute field
	 */
	@NotNull
	private String field;

	/*
	 * attribute operator filter
	 */
	@JsonProperty("operator_type")
	@NotNull
	@Valid
	public OperatorFilterEnum operatorType;

	/*
	 * attribute values
	 */
	@NotNull
	public List<String> values;
}
