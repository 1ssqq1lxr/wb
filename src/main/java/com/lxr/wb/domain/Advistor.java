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
@Table(name = "wb_advistor")
public class Advistor implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;

    @Column(name = "wb_ip")
    private String ip;

    @Column(name = "wb_time")
    private String time;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

}
