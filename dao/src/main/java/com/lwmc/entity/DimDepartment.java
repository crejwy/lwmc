package com.lwmc.entity;

import com.core.base.BaseEntity;
import java.util.Date;
import javax.persistence.*;

@Table(name = "dim_department")
public class DimDepartment extends BaseEntity {
    @Id
    @Column(name = "DeptNo")
    private String deptno;

    @Column(name = "Name")
    private String name;

    @Column(name = "Creator")
    private String creator;

    @Column(name = "CreateDT")
    private Date createdt;

    @Column(name = "PrintOrder")
    private Byte printorder;

    @Column(name = "IsUsing")
    private Boolean isusing;

    @Column(name = "IsDeleted")
    private Boolean isdeleted;

    @Column(name = "Modifier")
    private String modifier;

    @Column(name = "ModifyDT")
    private Date modifydt;

    /**
     * @return DeptNo
     */
    public String getDeptno() {
        return deptno;
    }

    /**
     * @param deptno
     */
    public void setDeptno(String deptno) {
        this.deptno = deptno;
    }

    /**
     * @return Name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return Creator
     */
    public String getCreator() {
        return creator;
    }

    /**
     * @param creator
     */
    public void setCreator(String creator) {
        this.creator = creator;
    }

    /**
     * @return CreateDT
     */
    public Date getCreatedt() {
        return createdt;
    }

    /**
     * @param createdt
     */
    public void setCreatedt(Date createdt) {
        this.createdt = createdt;
    }

    /**
     * @return PrintOrder
     */
    public Byte getPrintorder() {
        return printorder;
    }

    /**
     * @param printorder
     */
    public void setPrintorder(Byte printorder) {
        this.printorder = printorder;
    }

    /**
     * @return IsUsing
     */
    public Boolean getIsusing() {
        return isusing;
    }

    /**
     * @param isusing
     */
    public void setIsusing(Boolean isusing) {
        this.isusing = isusing;
    }

    /**
     * @return IsDeleted
     */
    public Boolean getIsdeleted() {
        return isdeleted;
    }

    /**
     * @param isdeleted
     */
    public void setIsdeleted(Boolean isdeleted) {
        this.isdeleted = isdeleted;
    }

    /**
     * @return Modifier
     */
    public String getModifier() {
        return modifier;
    }

    /**
     * @param modifier
     */
    public void setModifier(String modifier) {
        this.modifier = modifier;
    }

    /**
     * @return ModifyDT
     */
    public Date getModifydt() {
        return modifydt;
    }

    /**
     * @param modifydt
     */
    public void setModifydt(Date modifydt) {
        this.modifydt = modifydt;
    }
}