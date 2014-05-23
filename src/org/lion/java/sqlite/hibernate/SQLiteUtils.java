package org.lion.java.sqlite.hibernate;

/**
 * contains some sqlite keywords and command
 * 
 * @author onlynight
 * 
 */
public interface SQLiteUtils {

	public static final String SQLITE_DATA_TYPE_TEXT = "TEXT";
	public static final String SQLITE_DATA_TYPE_INTEGER = "INTEGER";
	public static final String SQLITE_DATA_TYPE_SHORT = "INT";
	public static final String SQLITE_DATA_TYPE_LONG = "BIGINT";
	public static final String SQLITE_DATA_TYPE_FLOAT = "FLOAT";
	public static final String SQLITE_DATA_TYPE_DOUBLE = "DOUBLE";
	public static final String SQLITE_DATE_TYPE_VAECHAR = "VARCHAR";
	public static final String SQLITE_DATA_TYPE_BOOLEAN = "BOOLEAN";

	public static final String SQLITE_CONSTRAINT_PRIMARY_KEY = "PRIMARY KEY";
	public static final String SQLITE_CONSTRAINT_FOREIGN_KEY = "FOREIGN KEY";
	public static final String SQLITE_CONSTRAINT_NOT_NULL = "NOT NULL";
	public static final String SQLITE_CONSTRAINT_UNIQUE = "UNIQUE";
	public static final String SQLITE_CONSTRAINT_DEFAULT = "DEFAULT";
	public static final String SQLITE_CONSTRAINT_CHECK = "CHECK";

	public static final String SQLITE_KEYWORD_CREATE = "CREATE";
	public static final String SQLITE_KEYWORD_UPDATE = "UPDATE";
	public static final String SQLITE_KEYWORD_SELECT = "SELECT";
	public static final String SQLITE_KEYWORD_DELETE = "DELETE";
	public static final String SQLITE_KEYWORD_INSERT = "INSERT";
	public static final String SQLITE_KEYWORD_TABLE = "TABLE";
	public static final String SQLITE_KEYWORD_FROM = "FROM";
	public static final String SQLITE_KEYWORD_WHERE = "WHERE";
	public static final String SQLITE_KEYWORD_AUTOINCREASEMENT = "AUTOINCREMENT";
	public static final String SQLITE_KEYWORD_REFERENCES = "REFERENCES";
	public static final String SQLITE_KEYWORD_VALUES = "VALUES";
	public static final String SQLITE_KEYWORD_SET = "SET";

	public static final String SQLITE_CMD_CREATE_TABLE = SQLITE_KEYWORD_CREATE
			+ " " + SQLITE_KEYWORD_TABLE;
	public static final String SQLITE_CMD_DROP_TABLE_IF_EXIST = "DROP TABLE IF EXISTS";
	public static final String SQLITE_CMD_INSERT = SQLITE_KEYWORD_INSERT
			+ " INTO";
	public static final String ON_DELETE_CASCADE = "ON DELETE CASCADE";
	public static final String ON_UPDATE_CASCADE = "ON UPDATE CASCADE";
}
