/**
 * This class is generated by jOOQ
 */
package org.mvnsearch.infrastructure.jooq.tables;


import java.sql.Date;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Identity;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.TableImpl;
import org.mvnsearch.infrastructure.jooq.JooqDatabase;
import org.mvnsearch.infrastructure.jooq.Keys;
import org.mvnsearch.infrastructure.jooq.tables.records.AuthorRecord;


/**
 * This class is generated by jOOQ.
 */
@Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.7.0"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class AuthorTable extends TableImpl<AuthorRecord> {

	private static final long serialVersionUID = -999334256;

	/**
	 * The reference instance of <code>jooq.author</code>
	 */
	public static final AuthorTable AUTHOR = new AuthorTable();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<AuthorRecord> getRecordType() {
		return AuthorRecord.class;
	}

	/**
	 * The column <code>jooq.author.id</code>.
	 */
	public final TableField<AuthorRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

	/**
	 * The column <code>jooq.author.first_name</code>.
	 */
	public final TableField<AuthorRecord, String> FIRST_NAME = createField("first_name", org.jooq.impl.SQLDataType.VARCHAR.length(50), this, "");

	/**
	 * The column <code>jooq.author.last_name</code>.
	 */
	public final TableField<AuthorRecord, String> LAST_NAME = createField("last_name", org.jooq.impl.SQLDataType.VARCHAR.length(50).nullable(false), this, "");

	/**
	 * The column <code>jooq.author.gender</code>.
	 */
	public final TableField<AuthorRecord, String> GENDER = createField("gender", org.jooq.impl.SQLDataType.VARCHAR.length(16), this, "");

	/**
	 * The column <code>jooq.author.date_of_birth</code>.
	 */
	public final TableField<AuthorRecord, Date> DATE_OF_BIRTH = createField("date_of_birth", org.jooq.impl.SQLDataType.DATE, this, "");

	/**
	 * The column <code>jooq.author.year_of_birth</code>.
	 */
	public final TableField<AuthorRecord, Integer> YEAR_OF_BIRTH = createField("year_of_birth", org.jooq.impl.SQLDataType.INTEGER, this, "");

	/**
	 * The column <code>jooq.author.distinguished</code>.
	 */
	public final TableField<AuthorRecord, Integer> DISTINGUISHED = createField("distinguished", org.jooq.impl.SQLDataType.INTEGER, this, "");

	/**
	 * Create a <code>jooq.author</code> table reference
	 */
	public AuthorTable() {
		this("author", null);
	}

	/**
	 * Create an aliased <code>jooq.author</code> table reference
	 */
	public AuthorTable(String alias) {
		this(alias, AUTHOR);
	}

	private AuthorTable(String alias, Table<AuthorRecord> aliased) {
		this(alias, aliased, null);
	}

	private AuthorTable(String alias, Table<AuthorRecord> aliased, Field<?>[] parameters) {
		super(alias, JooqDatabase.JOOQ, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Identity<AuthorRecord, Integer> getIdentity() {
		return Keys.IDENTITY_AUTHOR;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UniqueKey<AuthorRecord> getPrimaryKey() {
		return Keys.KEY_AUTHOR_PRIMARY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<UniqueKey<AuthorRecord>> getKeys() {
		return Arrays.<UniqueKey<AuthorRecord>>asList(Keys.KEY_AUTHOR_PRIMARY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public AuthorTable as(String alias) {
		return new AuthorTable(alias, this);
	}

	/**
	 * Rename this table
	 */
	public AuthorTable rename(String name) {
		return new AuthorTable(name, null);
	}
}
