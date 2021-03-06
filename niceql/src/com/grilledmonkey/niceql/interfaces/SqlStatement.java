package com.grilledmonkey.niceql.interfaces;

/**
 * All SQL statements should return generated SQL code as a String.
 * And this is why SqlStatement interface exists.
 *
 * @author Aux
 *
 */
public interface SqlStatement {

	/**
	 * Returns SQL code which is generated by instance based
	 * on a type of object and its data.
	 *
	 * @return generated SQL code
	 */
	public String getSql();

}
