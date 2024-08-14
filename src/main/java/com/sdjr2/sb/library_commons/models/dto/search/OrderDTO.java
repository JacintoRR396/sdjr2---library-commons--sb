package com.sdjr2.sb.library_commons.models.dto.search;

import java.io.Serial;
import java.io.Serializable;

import org.springframework.data.domain.Sort;

import com.sdjr2.sb.library_commons.models.dto.BaseDTO;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * {@link FilterDTO} class.
 * <p>
 * <strong>DTO</strong> - Represents a generic sort used by advanced search, implements to {@link BaseDTO}.
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
public class OrderDTO implements BaseDTO, Serializable {

	@Serial
	private static final long serialVersionUID = 7936136111365894157L;

	/*
	 * attribute field
	 */
	@NotNull
	private String field;

	/*
	 * attribute direction
	 */
	@NotNull
	@Valid
	Sort.Direction direction;
}
