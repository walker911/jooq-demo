/*
 * This file is generated by jOOQ.
 */
package com.walker.jooq.jooqdemo.model.tables.records;


import com.walker.jooq.jooqdemo.model.tables.ExchangeRecord;

import java.math.BigDecimal;
import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record9;
import org.jooq.Row9;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * 兑换记录
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.7"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ExchangeRecordRecord extends UpdatableRecordImpl<ExchangeRecordRecord> implements Record9<String, String, String, BigDecimal, BigDecimal, String, Integer, Byte, Timestamp> {

    private static final long serialVersionUID = 228478636;

    /**
     * Setter for <code>exchange.exchange_record.id</code>. 主键UUID
     */
    public void setId(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>exchange.exchange_record.id</code>. 主键UUID
     */
    public String getId() {
        return (String) get(0);
    }

    /**
     * Setter for <code>exchange.exchange_record.order_no</code>. 订单号
     */
    public void setOrderNo(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>exchange.exchange_record.order_no</code>. 订单号
     */
    public String getOrderNo() {
        return (String) get(1);
    }

    /**
     * Setter for <code>exchange.exchange_record.mobile</code>. 手机号
     */
    public void setMobile(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>exchange.exchange_record.mobile</code>. 手机号
     */
    public String getMobile() {
        return (String) get(2);
    }

    /**
     * Setter for <code>exchange.exchange_record.total_interests</code>. 兑换权益总量
     */
    public void setTotalInterests(BigDecimal value) {
        set(3, value);
    }

    /**
     * Getter for <code>exchange.exchange_record.total_interests</code>. 兑换权益总量
     */
    public BigDecimal getTotalInterests() {
        return (BigDecimal) get(3);
    }

    /**
     * Setter for <code>exchange.exchange_record.actual_interests</code>. 实际到账权益
     */
    public void setActualInterests(BigDecimal value) {
        set(4, value);
    }

    /**
     * Getter for <code>exchange.exchange_record.actual_interests</code>. 实际到账权益
     */
    public BigDecimal getActualInterests() {
        return (BigDecimal) get(4);
    }

    /**
     * Setter for <code>exchange.exchange_record.remark</code>. 兑换失败的原因
     */
    public void setRemark(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>exchange.exchange_record.remark</code>. 兑换失败的原因
     */
    public String getRemark() {
        return (String) get(5);
    }

    /**
     * Setter for <code>exchange.exchange_record.exchange_status</code>. 兑换状态：0 失败  成功
     */
    public void setExchangeStatus(Integer value) {
        set(6, value);
    }

    /**
     * Getter for <code>exchange.exchange_record.exchange_status</code>. 兑换状态：0 失败  成功
     */
    public Integer getExchangeStatus() {
        return (Integer) get(6);
    }

    /**
     * Setter for <code>exchange.exchange_record.exchange_type</code>. 兑换方式 0-油卡，1-红包
     */
    public void setExchangeType(Byte value) {
        set(7, value);
    }

    /**
     * Getter for <code>exchange.exchange_record.exchange_type</code>. 兑换方式 0-油卡，1-红包
     */
    public Byte getExchangeType() {
        return (Byte) get(7);
    }

    /**
     * Setter for <code>exchange.exchange_record.exchange_time</code>. 兑换时间
     */
    public void setExchangeTime(Timestamp value) {
        set(8, value);
    }

    /**
     * Getter for <code>exchange.exchange_record.exchange_time</code>. 兑换时间
     */
    public Timestamp getExchangeTime() {
        return (Timestamp) get(8);
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
    // Record9 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row9<String, String, String, BigDecimal, BigDecimal, String, Integer, Byte, Timestamp> fieldsRow() {
        return (Row9) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row9<String, String, String, BigDecimal, BigDecimal, String, Integer, Byte, Timestamp> valuesRow() {
        return (Row9) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field1() {
        return ExchangeRecord.EXCHANGE_RECORD.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return ExchangeRecord.EXCHANGE_RECORD.ORDER_NO;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return ExchangeRecord.EXCHANGE_RECORD.MOBILE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field4() {
        return ExchangeRecord.EXCHANGE_RECORD.TOTAL_INTERESTS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field5() {
        return ExchangeRecord.EXCHANGE_RECORD.ACTUAL_INTERESTS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return ExchangeRecord.EXCHANGE_RECORD.REMARK;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field7() {
        return ExchangeRecord.EXCHANGE_RECORD.EXCHANGE_STATUS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field8() {
        return ExchangeRecord.EXCHANGE_RECORD.EXCHANGE_TYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field9() {
        return ExchangeRecord.EXCHANGE_RECORD.EXCHANGE_TIME;
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
        return getOrderNo();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getMobile();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal component4() {
        return getTotalInterests();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal component5() {
        return getActualInterests();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component6() {
        return getRemark();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component7() {
        return getExchangeStatus();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte component8() {
        return getExchangeType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component9() {
        return getExchangeTime();
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
        return getOrderNo();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getMobile();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal value4() {
        return getTotalInterests();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal value5() {
        return getActualInterests();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getRemark();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value7() {
        return getExchangeStatus();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte value8() {
        return getExchangeType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value9() {
        return getExchangeTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ExchangeRecordRecord value1(String value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ExchangeRecordRecord value2(String value) {
        setOrderNo(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ExchangeRecordRecord value3(String value) {
        setMobile(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ExchangeRecordRecord value4(BigDecimal value) {
        setTotalInterests(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ExchangeRecordRecord value5(BigDecimal value) {
        setActualInterests(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ExchangeRecordRecord value6(String value) {
        setRemark(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ExchangeRecordRecord value7(Integer value) {
        setExchangeStatus(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ExchangeRecordRecord value8(Byte value) {
        setExchangeType(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ExchangeRecordRecord value9(Timestamp value) {
        setExchangeTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ExchangeRecordRecord values(String value1, String value2, String value3, BigDecimal value4, BigDecimal value5, String value6, Integer value7, Byte value8, Timestamp value9) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached ExchangeRecordRecord
     */
    public ExchangeRecordRecord() {
        super(ExchangeRecord.EXCHANGE_RECORD);
    }

    /**
     * Create a detached, initialised ExchangeRecordRecord
     */
    public ExchangeRecordRecord(String id, String orderNo, String mobile, BigDecimal totalInterests, BigDecimal actualInterests, String remark, Integer exchangeStatus, Byte exchangeType, Timestamp exchangeTime) {
        super(ExchangeRecord.EXCHANGE_RECORD);

        set(0, id);
        set(1, orderNo);
        set(2, mobile);
        set(3, totalInterests);
        set(4, actualInterests);
        set(5, remark);
        set(6, exchangeStatus);
        set(7, exchangeType);
        set(8, exchangeTime);
    }
}