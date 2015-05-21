/**
 * This class is generated by jOOQ
 */
package org.mvnsearch.infrastructure.jooq.tables;


import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.TableImpl;
import org.mvnsearch.infrastructure.jooq.JooqTable;
import org.mvnsearch.infrastructure.jooq.Keys;
import org.mvnsearch.infrastructure.jooq.tables.records.LanguageRecordTable;


/**
 * This class is generated by jOOQ.
 */
@Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.6.1"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class LanguageTable extends TableImpl<LanguageRecordTable> {

	private static final long serialVersionUID = 394509141;

	/**
	 * The reference instance of <code>jooq.language</code>
	 */
	public static final LanguageTable LANGUAGE = new LanguageTable();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<LanguageRecordTable> getRecordType() {
		return LanguageRecordTable.class;
	}

	/**
	 * The column <code>jooq.language.id</code>.
	 */
	public final TableField<LanguageRecordTable, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

	/**
	 * The column <code>jooq.language.cd</code>.
	 */
	public final TableField<LanguageRecordTable, String> CD = createField("cd", org.jooq.impl.SQLDataType.CHAR.length(2), this, "");

	/**
	 * The column <code>jooq.language.description</code>.
	 */
	public final TableField<LanguageRecordTable, String> DESCRIPTION = createField("description", org.jooq.impl.SQLDataType.VARCHAR.length(50), this, "");

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

	private LanguageTable(String alias, Table<LanguageRecordTable> aliased) {
		this(alias, aliased, null);
	}

	private LanguageTable(String alias, Table<LanguageRecordTable> aliased, Field<?>[] parameters) {
		super(alias, JooqTable.JOOQ, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UniqueKey<LanguageRecordTable> getPrimaryKey() {
		return Keys.KEY_LANGUAGE_PRIMARY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<UniqueKey<LanguageRecordTable>> getKeys() {
		return Arrays.<UniqueKey<LanguageRecordTable>>asList(Keys.KEY_LANGUAGE_PRIMARY);
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
