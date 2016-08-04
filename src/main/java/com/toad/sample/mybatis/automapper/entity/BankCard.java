package com.toad.sample.mybatis.automapper.entity;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "bank_card")
public class BankCard {
    /**
     * 主键id
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 银行卡卡号
     */
    @Column(name = "bank_card_no")
    private String bankCardNo;

    /**
     * 网银登录账号
     */
    @Column(name = "account_name")
    private String accountName;

    /**
     * 类型(1.信用卡,0.储蓄卡)
     */
    private Integer type;

    /**
     * 网银登录账号
     */
    @Column(name = "login_name")
    private String loginName;

    /**
     * 开卡日期
     */
    @Column(name = "signup_date")
    private String signupDate;

    /**
     * 币种
     */
    private String currency;

    /**
     * 余额
     */
    private BigDecimal balance;

    /**
     * 父卡卡号
     */
    @Column(name = "parent_bank_card_no")
    private String parentBankCardNo;

    /**
     * 银行类型(1.建行，2.招行……)
     */
    @Column(name = "bank_type")
    private Integer bankType;

    /**
     * 银行卡产品类型(ep:龙卡通)
     */
    @Column(name = "card_type")
    private String cardType;

    /**
     * 更新时间
     */
    @Column(name = "update_time")
    private Date updateTime;

    private Integer rid;

    @Column(name = "current_month")
    private String currentMonth;

    /**
     * 户主
     */
    @Column(name = "house_holder")
    private String houseHolder;

    @Column(name = "create_time")
    private Date createTime;

    /**
     * 账单日
     */
    @Column(name = "bill_day")
    private String billDay;

    /**
     * 获取主键id
     *
     * @return id - 主键id
     */
    public Long getId() {
        return id;
    }

    /**
     * 设置主键id
     *
     * @param id 主键id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取银行卡卡号
     *
     * @return bank_card_no - 银行卡卡号
     */
    public String getBankCardNo() {
        return bankCardNo;
    }

    /**
     * 设置银行卡卡号
     *
     * @param bankCardNo 银行卡卡号
     */
    public void setBankCardNo(String bankCardNo) {
        this.bankCardNo = bankCardNo;
    }

    /**
     * 获取网银登录账号
     *
     * @return account_name - 网银登录账号
     */
    public String getAccountName() {
        return accountName;
    }

    /**
     * 设置网银登录账号
     *
     * @param accountName 网银登录账号
     */
    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    /**
     * 获取类型(1.信用卡,0.储蓄卡)
     *
     * @return type - 类型(1.信用卡,0.储蓄卡)
     */
    public Integer getType() {
        return type;
    }

    /**
     * 设置类型(1.信用卡,0.储蓄卡)
     *
     * @param type 类型(1.信用卡,0.储蓄卡)
     */
    public void setType(Integer type) {
        this.type = type;
    }

    /**
     * 获取网银登录账号
     *
     * @return login_name - 网银登录账号
     */
    public String getLoginName() {
        return loginName;
    }

    /**
     * 设置网银登录账号
     *
     * @param loginName 网银登录账号
     */
    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    /**
     * 获取开卡日期
     *
     * @return signup_date - 开卡日期
     */
    public String getSignupDate() {
        return signupDate;
    }

    /**
     * 设置开卡日期
     *
     * @param signupDate 开卡日期
     */
    public void setSignupDate(String signupDate) {
        this.signupDate = signupDate;
    }

    /**
     * 获取币种
     *
     * @return currency - 币种
     */
    public String getCurrency() {
        return currency;
    }

    /**
     * 设置币种
     *
     * @param currency 币种
     */
    public void setCurrency(String currency) {
        this.currency = currency;
    }

    /**
     * 获取余额
     *
     * @return balance - 余额
     */
    public BigDecimal getBalance() {
        return balance;
    }

    /**
     * 设置余额
     *
     * @param balance 余额
     */
    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    /**
     * 获取父卡卡号
     *
     * @return parent_bank_card_no - 父卡卡号
     */
    public String getParentBankCardNo() {
        return parentBankCardNo;
    }

    /**
     * 设置父卡卡号
     *
     * @param parentBankCardNo 父卡卡号
     */
    public void setParentBankCardNo(String parentBankCardNo) {
        this.parentBankCardNo = parentBankCardNo;
    }

    /**
     * 获取银行类型(1.建行，2.招行……)
     *
     * @return bank_type - 银行类型(1.建行，2.招行……)
     */
    public Integer getBankType() {
        return bankType;
    }

    /**
     * 设置银行类型(1.建行，2.招行……)
     *
     * @param bankType 银行类型(1.建行，2.招行……)
     */
    public void setBankType(Integer bankType) {
        this.bankType = bankType;
    }

    /**
     * 获取银行卡产品类型(ep:龙卡通)
     *
     * @return card_type - 银行卡产品类型(ep:龙卡通)
     */
    public String getCardType() {
        return cardType;
    }

    /**
     * 设置银行卡产品类型(ep:龙卡通)
     *
     * @param cardType 银行卡产品类型(ep:龙卡通)
     */
    public void setCardType(String cardType) {
        this.cardType = cardType;
    }

    /**
     * 获取更新时间
     *
     * @return update_time - 更新时间
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * 设置更新时间
     *
     * @param updateTime 更新时间
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * @return rid
     */
    public Integer getRid() {
        return rid;
    }

    /**
     * @param rid
     */
    public void setRid(Integer rid) {
        this.rid = rid;
    }

    /**
     * @return current_month
     */
    public String getCurrentMonth() {
        return currentMonth;
    }

    /**
     * @param currentMonth
     */
    public void setCurrentMonth(String currentMonth) {
        this.currentMonth = currentMonth;
    }

    /**
     * 获取户主
     *
     * @return house_holder - 户主
     */
    public String getHouseHolder() {
        return houseHolder;
    }

    /**
     * 设置户主
     *
     * @param houseHolder 户主
     */
    public void setHouseHolder(String houseHolder) {
        this.houseHolder = houseHolder;
    }

    /**
     * @return create_time
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * @param createTime
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 获取账单日
     *
     * @return bill_day - 账单日
     */
    public String getBillDay() {
        return billDay;
    }

    /**
     * 设置账单日
     *
     * @param billDay 账单日
     */
    public void setBillDay(String billDay) {
        this.billDay = billDay;
    }
}