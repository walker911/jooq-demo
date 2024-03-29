/*
 * This file is generated by jOOQ.
 */
package com.walker.jooq.jooqdemo.model.tables;


import com.walker.jooq.jooqdemo.model.Exchange;
import com.walker.jooq.jooqdemo.model.Indexes;
import com.walker.jooq.jooqdemo.model.Keys;
import com.walker.jooq.jooqdemo.model.tables.records.ExchangeLogRecord;

import java.math.BigDecimal;
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
 * 日志表
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.7"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ExchangeLog extends TableImpl<ExchangeLogRecord> {

    private static final long serialVersionUID = -1639134335;

    /**
     * The reference instance of <code>exchange.exchange_log</code>
     */
    public static final ExchangeLog EXCHANGE_LOG = new ExchangeLog();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ExchangeLogRecord> getRecordType() {
        return ExchangeLogRecord.class;
    }

    /**
     * The column <code>exchange.exchange_log.id</code>.
     */
    public final TableField<ExchangeLogRecord, String> ID = createField("id", org.jooq.impl.SQLDataType.VARCHAR(50).nullable(false), this, "");

    /**
     * The column <code>exchange.exchange_log.mobile</code>. 手机号
     */
    public final TableField<ExchangeLogRecord, String> MOBILE = createField("mobile", org.jooq.impl.SQLDataType.VARCHAR(11), this, "手机号");

    /**
     * The column <code>exchange.exchange_log.status</code>. 状态 0失效 1有效（收益）  2兑换
     */
    public final TableField<ExchangeLogRecord, Integer> STATUS = createField("status", org.jooq.impl.SQLDataType.INTEGER, this, "状态 0失效 1有效（收益）  2兑换");

    /**
     * The column <code>exchange.exchange_log.interests</code>. 权益
     */
    public final TableField<ExchangeLogRecord, BigDecimal> INTERESTS = createField("interests", org.jooq.impl.SQLDataType.DECIMAL(15, 2), this, "权益");

    /**
     * The column <code>exchange.exchange_log.exchange_type</code>. 兑换方式：0  油卡 1微信红包
     */
    public final TableField<ExchangeLogRecord, Integer> EXCHANGE_TYPE = createField("exchange_type", org.jooq.impl.SQLDataType.INTEGER, this, "兑换方式：0  油卡 1微信红包");

    /**
     * The column <code>exchange.exchange_log.time</code>. 状态的操作时间
     */
    public final TableField<ExchangeLogRecord, Timestamp> TIME = createField("time", org.jooq.impl.SQLDataType.TIMESTAMP, this, "状态的操作时间");

    /**
     * The column <code>exchange.exchange_log.exchange_id</code>. 兑换记录的id
     */
    public final TableField<ExchangeLogRecord, String> EXCHANGE_ID = createField("exchange_id", org.jooq.impl.SQLDataType.VARCHAR(50), this, "兑换记录的id");

    /**
     * The column <code>exchange.exchange_log.user_id</code>. 用户的id
     */
    public final TableField<ExchangeLogRecord, String> USER_ID = createField("user_id", org.jooq.impl.SQLDataType.VARCHAR(50), this, "用户的id");

    /**
     * Create a <code>exchange.exchange_log</code> table reference
     */
    public ExchangeLog() {
        this(DSL.name("exchange_log"), null);
    }

    /**
     * Create an aliased <code>exchange.exchange_log</code> table reference
     */
    public ExchangeLog(String alias) {
        this(DSL.name(alias), EXCHANGE_LOG);
    }

    /**
     * Create an aliased <code>exchange.exchange_log</code> table reference
     */
    public ExchangeLog(Name alias) {
        this(alias, EXCHANGE_LOG);
    }

    private ExchangeLog(Name alias, Table<ExchangeLogRecord> aliased) {
        this(alias, aliased, null);
    }

    private ExchangeLog(Name alias, Table<ExchangeLogRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("日志表"));
    }

    public <O extends Record> ExchangeLog(Table<O> child, ForeignKey<O, ExchangeLogRecord> key) {
        super(child, key, EXCHANGE_LOG);
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
        return Arrays.<Index>asList(Indexes.EXCHANGE_LOG_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<ExchangeLogRecord> getPrimaryKey() {
        return Keys.KEY_EXCHANGE_LOG_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<ExchangeLogRecord>> getKeys() {
        return Arrays.<UniqueKey<ExchangeLogRecord>>asList(Keys.KEY_EXCHANGE_LOG_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ExchangeLog as(String alias) {
        return new ExchangeLog(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ExchangeLog as(Name alias) {
        return new ExchangeLog(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public ExchangeLog rename(String name) {
        return new ExchangeLog(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public ExchangeLog rename(Name name) {
        return new ExchangeLog(name, null);
    }
}
