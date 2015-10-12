/**
 * This class is generated by jOOQ
 */
package org.mvnsearch.infrastructure.jooq.tables;


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
import org.mvnsearch.infrastructure.jooq.tables.records.LanguageRecord;


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
public class LanguageTable extends TableImpl<LanguageRecord> {

	private static final long serialVersionUID = -2110202025;

	/**
	 * The reference instance of <code>jooq.language</code>
	 */
	public static final LanguageTable LANGUAGE = new LanguageTable();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<LanguageRecord> getRecordType() {
		return LanguageRecord.class;
	}

	/**
	 * The column <code>jooq.language.id</code>.
	 */
	public final TableField<LanguageRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

	/**
	 * The column <code>jooq.language.cd</code>.
	 */
	public final TableField<LanguageRecord, String> CD = createField("cd", org.jooq.impl.SQLDataType.CHAR.length(2).nullable(false), this, "");

	/**
	 * The column <code>jooq.language.description</code>.
	 */
	public final TableField<LanguageRecord, String> DESCRIPTION = createField("description", org.jooq.impl.SQLDataType.VARCHAR.length(50), this, "");

	/**
	 * Create a <code>jooq.language</code> table reference
	 */
	public LanguageTable() {
		this("language", null);
	}

	/**
	 * Create an aliased <code>jooq.language</code> table reference
	 */
	public LanguageTable(String alias) {
		this(alias, LANGUAGE);
	}

	private LanguageTable(String alias, Table<LanguageRecord> aliased) {
		this(alias, aliased, null);
	}

	private LanguageTable(String alias, Table<LanguageRecord> aliased, Field<?>[] parameters) {
		super(alias, JooqDatabase.JOOQ, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Identity<LanguageRecord, Integer> getIdentity() {
		return Keys.IDENTITY_LANGUAGE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UniqueKey<LanguageRecord> getPrimaryKey() {
		return Keys.KEY_LANGUAGE_PRIMARY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<UniqueKey<LanguageRecord>> getKeys() {
		return Arrays.<UniqueKey<LanguageRecord>>asList(Keys.KEY_LANGUAGE_PRIMARY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public LanguageTable as(String alias) {
		return new LanguageTable(alias, this);
	}

	/**
	 * Rename this table
	 */
	public LanguageTable rename(String name) {
		return new LanguageTable(name, null);
	}
}
