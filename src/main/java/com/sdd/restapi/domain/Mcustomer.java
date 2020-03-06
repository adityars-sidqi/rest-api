package com.sdd.restapi.domain;

import java.io.Serializable;
import javax.persistence.*;

import org.hibernate.annotations.Type;

import java.util.Date;

/**
 * The persistent class for the mcustomer database table.
 *
 */
@Entity
@NamedQuery(name="Mcustomer.findAll", query="SELECT m FROM Mcustomer m")
public class Mcustomer extends AuditModel {
    private static final long serialVersionUID = 1L;
    private Integer Mcustomerpk;
    private String customername;
    private String customerno;


    public Mcustomer() {
    }

    @Id
    @SequenceGenerator(name="MCUSTOMER_MCUSTOMERPK_GENERATOR", sequenceName="MCUSTOMER_SEQ", initialValue = 1, allocationSize = 1)
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="MCUSTOMER_MCUSTOMERPK_GENERATOR")
    @Column(unique = true, nullable = false)
    public Integer getMcustomerpk() {
        return Mcustomerpk;
    }

    public void setMcustomerpk(Integer mcustomerpk) {
        Mcustomerpk = mcustomerpk;
    }

    @Column(length=30)
    @Type(type = "com.sdd.utils.usertype.TrimUpperCaseUserType")
    public String getCustomername() {
        return customername;
    }

    public void setCustomername(String customername) {
        this.customername = customername;
    }

    @Column(length=20)
    @Type(type = "com.sdd.utils.usertype.TrimUpperCaseUserType")
    public String getCustomerno() {
        return customerno;
    }

    public void setCustomerno(String customerno) {
        this.customerno = customerno;
    }

}