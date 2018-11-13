/*
 * This file is generated by jOOQ.
 */
package com.walker.jooq.jooqdemo.model.tables;


import com.walker.jooq.jooqdemo.model.Exchange;
import com.walker.jooq.jooqdemo.model.Indexes;
import com.walker.jooq.jooqdemo.model.Keys;
import com.walker.jooq.jooqdemo.model.tables.records.AuthorityUserRecord;

import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.7"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class AuthorityUser extends TableImpl<AuthorityUserRecord> {

    private static final long serialVersionUID = 1603252839;

    /**
     * The reference instance of <code>exchange.authority_user</code>
     */
    public static final AuthorityUser AUTHORITY_USER = new AuthorityUser();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<AuthorityUserRecord> getRecordType() {
        return AuthorityUserRecord.class;
    }

    /**
     * The column <code>exchange.authority_user.id</code>.
     */
    public final TableField<AuthorityUserRecord, String> ID = createField("id", org.jooq.impl.SQLDataType.VARCHAR(255).nullable(false), this, "");

    /**
     * The column <code>exchange.authority_user.authority_id</code>. 权限表id
     */
    public final TableField<AuthorityUserRecord, String> AUTHORITY_ID = createField("authority_id", org.jooq.impl.SQLDataType.VARCHAR(255), this, "权限表id");

    /**
     * The column <code>exchange.authority_user.user_id</code>. 管理用户id
     */
    public final TableField<AuthorityUserRecord, String> USER_ID = createField("user_id", org.jooq.impl.SQLDataType.VARCHAR(255), this, "管理用户id");

    /**
     * Create a <code>exchange.authority_user</code> table reference
     */
    public AuthorityUser() {
        this(DSL.name("authority_user"), null);
    }

    /**
     * Create an aliased <code>exchange.authority_user</code> table reference
     */
    public AuthorityUser(String alias) {
        this(DSL.name(alias), AUTHORITY_USER);
    }

    /**
     * Create an aliased <code>exchange.authority_user</code> table reference
     */
    public AuthorityUser(Name alias) {
        this(alias, AUTHORITY_USER);
    }

    private AuthorityUser(Name alias, Table<AuthorityUserRecord> aliased) {
        this(alias, aliased, null);
    }

    private AuthorityUser(Name alias, Table<AuthorityUserRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> AuthorityUser(Table<O> child, ForeignKey<O, AuthorityUserRecord> key) {
        super(child, key, AUTHORITY_USER);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return Exchange.EXCHANGE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.AUTHORITY_USER_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<AuthorityUserRecord> getPrimaryKey() {
        return Keys.KEY_AUTHORITY_USER_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<AuthorityUserRecord>> getKeys() {
        return Arrays.<UniqueKey<AuthorityUserRecord>>asList(Keys.KEY_AUTHORITY_USER_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AuthorityUser as(String alias) {
        return new AuthorityUser(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AuthorityUser as(Name alias) {
        return new AuthorityUser(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public AuthorityUser rename(String name) {
        return new AuthorityUser(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public AuthorityUser rename(Name name) {
        return new AuthorityUser(name, null);
    }
}