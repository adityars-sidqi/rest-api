package com.sdd.restapi.domain;

import java.io.Serializable;
import javax.persistence.*;

import org.hibernate.annotations.Type;

import java.util.Date;

/**
 * The persistent class for the maccount database table.
 *
 */
@Entity
@NamedQuery(name="Maccount.findAll", query="SELECT m FROM Maccount m")
public class Maccount extends AuditModel {
    private static final long serialVersionUID = 1L;
    private Integer Maccountpk;
    private String accno;
    private String accname;


    public Maccount() {
    }

    @Id
    @SequenceGenerator(name="MACCOUNT_MACCOUNTPK_GENERATOR", sequenceName="MACCOUNT_SEQ", initialValue = 1, allocationSize = 1)
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="MACCOUNT_MACCOUNTPK_GENERATOR")
    @Column(unique = true, nullable = false)
    public Integer getMaccountpk() {
        return Maccountpk;
    }

    public void setMaccountpk(Integer maccountpk) {
        Maccountpk = maccountpk;
    }

    @Column(length=20)
    @Type(type = "com.sdd.utils.usertype.TrimUpperCaseUserType")
    public String getAccno() {
        return accno;
    }

    public void setAccno(String accno) {
        this.accno = accno;
    }

    @Column(length=30)
    @Type(type = "com.sdd.utils.usertype.TrimUpperCaseUserType")
    public String getAccname() {
        return accname;
    }

    public void setAccname(String accname) {
        this.accname = accname;
    }
}