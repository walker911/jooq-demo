/*
 * This file is generated by jOOQ.
 */
package com.walker.jooq.jooqdemo.model.tables.records;


import com.walker.jooq.jooqdemo.model.tables.ExchangeUser;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record4;
import org.jooq.Row4;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * 兑换人兑换信息关联表
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.7"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ExchangeUserRecord extends UpdatableRecordImpl<ExchangeUserRecord> implements Record4<String, String, String, Byte> {

    private static final long serialVersionUID = 1075602627;

    /**
     * Setter for <code>exchange.exchange_user.id</code>. 主键UUID
     */
    public void setId(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>exchange.exchange_user.id</code>. 主键UUID
     */
    public String getId() {
        return (String) get(0);
    }

    /**
     * Setter for <code>exchange.exchange_user.user_id</code>. 领卡人id
     */
    public void setUserId(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>exchange.exchange_user.user_id</code>. 领卡人id
     */
    public String getUserId() {
        return (String) get(1);
    }

    /**
     * Setter for <code>exchange.exchange_user.exchange_id</code>. 兑换id：油卡或红包
     */
    public void setExchangeId(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>exchange.exchange_user.exchange_id</code>. 兑换id：油卡或红包
     */
    public String getExchangeId() {
        return (String) get(2);
    }

    /**
     * Setter for <code>exchange.exchange_user.exchange_type</code>. 兑换类型：0-油卡，1-红包
     */
    public void setExchangeType(Byte value) {
        set(3, value);
    }

    /**
     * Getter for <code>exchange.exchange_user.exchange_type</code>. 兑换类型：0-油卡，1-红包
     */
    public Byte getExchangeType() {
        return (Byte) get(3);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<String> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record4 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<String, String, String, Byte> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<String, String, String, Byte> valuesRow() {
        return (Row4) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field1() {
        return ExchangeUser.EXCHANGE_USER.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return ExchangeUser.EXCHANGE_USER.USER_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return ExchangeUser.EXCHANGE_USER.EXCHANGE_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field4() {
        return ExchangeUser.EXCHANGE_USER.EXCHANGE_TYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component2() {
        return getUserId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getExchangeId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte component4() {
        return getExchangeType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getUserId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getExchangeId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte value4() {
        return getExchangeType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ExchangeUserRecord value1(String value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ExchangeUserRecord value2(String value) {
        setUserId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ExchangeUserRecord value3(String value) {
        setExchangeId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ExchangeUserRecord value4(Byte value) {
        setExchangeType(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ExchangeUserRecord values(String value1, String value2, String value3, Byte value4) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached ExchangeUserRecord
     */
    public ExchangeUserRecord() {
        super(ExchangeUser.EXCHANGE_USER);
    }

    /**
     * Create a detached, initialised ExchangeUserRecord
     */
    public ExchangeUserRecord(String id, String userId, String exchangeId, Byte exchangeType) {
        super(ExchangeUser.EXCHANGE_USER);

        set(0, id);
        set(1, userId);
        set(2, exchangeId);
        set(3, exchangeType);
    }
}
