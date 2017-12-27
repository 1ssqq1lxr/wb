package com.lxr.wb.domain;


import javax.persistence.*;
import java.io.Serializable;

/**
 * 当前报警
 *
 * @author lxr
 * @create 2017-12-14 18:02
 **/
@Entity
@Table(name = "wb_leave_message")
public class LeaveMessage implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;

    @Column(name = "wb_nick_name")
    private String nickName;

    @Column(name = "wb_phone")
    private String phone;

    @Column(name = "wb_industry")
    private String industry;

    @Column(name = "wb_type")
    private String  type;

    @Column(name = "wb_remark")
    private String remark;


    @Column(name = "wb_open_type")
    private String openType;



    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getIndustry() {
        return industry;
    }

    public void setIndustry(String industry) {
        this.industry = industry;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getOpenType() {
        return openType;
    }

    public void setOpenType(String openType) {
        this.openType = openType;
    }
}
