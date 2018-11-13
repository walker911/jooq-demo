/*
 * This file is generated by jOOQ.
 */
package com.walker.jooq.jooqdemo.model.tables;


import com.walker.jooq.jooqdemo.model.Exchange;
import com.walker.jooq.jooqdemo.model.Indexes;
import com.walker.jooq.jooqdemo.model.Keys;
import com.walker.jooq.jooqdemo.model.tables.records.PhoneRecord;

import java.sql.Timestamp;
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
public class Phone extends TableImpl<PhoneRecord> {

    private static final long serialVersionUID = 662257023;

    /**
     * The reference instance of <code>exchange.phone</code>
     */
    public static final Phone PHONE = new Phone();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<PhoneRecord> getRecordType() {
        return PhoneRecord.class;
    }

    /**
     * The column <code>exchange.phone.id</code>.
     */
    public final TableField<PhoneRecord, String> ID = createField("id", org.jooq.impl.SQLDataType.VARCHAR(50).nullable(false), this, "");

    /**
     * The column <code>exchange.phone.phone</code>. 电话号码
     */
    public final TableField<PhoneRecord, String> PHONE_ = createField("phone", org.jooq.impl.SQLDataType.VARCHAR(11), this, "电话号码");

    /**
     * The column <code>exchange.phone.code</code>. 手机验证码
     */
    public final TableField<PhoneRecord, String> CODE = createField("code", org.jooq.impl.SQLDataType.VARCHAR(6), this, "手机验证码");

    /**
     * The column <code>exchange.phone.status</code>. 区别是注册 还是重置密码  1注册 2重置密码
     */
    public final TableField<PhoneRecord, Integer> STATUS = createField("status", org.jooq.impl.SQLDataType.INTEGER, this, "区别是注册 还是重置密码  1注册 2重置密码");

    /**
     * The column <code>exchange.phone.create_Time</code>. 创建时间
     */
    public final TableField<PhoneRecord, Timestamp> CREATE_TIME = createField("create_Time", org.jooq.impl.SQLDataType.TIMESTAMP, this, "创建时间");

    /**
     * Create a <code>exchange.phone</code> table reference
     */
    public Phone() {
        this(DSL.name("phone"), null);
    }

    /**
     * Create an aliased <code>exchange.phone</code> table reference
     */
    public Phone(String alias) {
        this(DSL.name(alias), PHONE);
    }

    /**
     * Create an aliased <code>exchange.phone</code> table reference
     */
    public Phone(Name alias) {
        this(alias, PHONE);
    }

    private Phone(Name alias, Table<PhoneRecord> aliased) {
        this(alias, aliased, null);
    }

    private Phone(Name alias, Table<PhoneRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> Phone(Table<O> child, ForeignKey<O, PhoneRecord> key) {
        super(child, key, PHONE);
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
        return Arrays.<Index>asList(Indexes.PHONE_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<PhoneRecord> getPrimaryKey() {
        return Keys.KEY_PHONE_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<PhoneRecord>> getKeys() {
        return Arrays.<UniqueKey<PhoneRecord>>asList(Keys.KEY_PHONE_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Phone as(String alias) {
        return new Phone(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Phone as(Name alias) {
        return new Phone(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Phone rename(String name) {
        return new Phone(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Phone rename(Name name) {
        return new Phone(name, null);
    }
}