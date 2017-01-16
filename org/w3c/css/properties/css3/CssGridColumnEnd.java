//
// Author: Yves Lafon <ylafon@w3.org>
//
// (c) COPYRIGHT MIT, ERCIM, Keio, Beihang, 2016.
// Please first read the full copyright statement in file COPYRIGHT.html
package org.w3c.css.properties.css3;

import org.w3c.css.util.ApplContext;
import org.w3c.css.util.InvalidParamException;
import org.w3c.css.values.CssExpression;

/**
 * @spec https://www.w3.org/TR/2016/CR-css-grid-1-20160929/#propdef-grid-column-end
 */
public class CssGridColumnEnd extends org.w3c.css.properties.css.CssGridColumnEnd {

	/**
	 * Create a new CssGridColumnEnd
	 */
	public CssGridColumnEnd() {
		value = initial;
	}

	/**
	 * Creates a new CssGridRowEnd
	 *
	 * @param expression The expression for this property
	 * @throws org.w3c.css.util.InvalidParamException
	 *          Expressions are incorrect
	 */
	public CssGridColumnEnd(ApplContext ac, CssExpression expression, boolean check)
			throws InvalidParamException {
		value = CssGridRowStart.checkGridLine(ac, expression, check, this);
	}

	public CssGridColumnEnd(ApplContext ac, CssExpression expression)
			throws InvalidParamException {
		this(ac, expression, false);
	}

}
