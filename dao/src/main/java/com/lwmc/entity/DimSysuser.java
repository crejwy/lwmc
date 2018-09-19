package com.lwmc.entity;

import com.core.base.BaseEntity;
import java.util.Date;
import javax.persistence.*;

@Table(name = "dim_sysuser")
public class DimSysuser extends BaseEntity {
    @Id
    @Column(name = "Username")
    private String username;

    @Column(name = "Password")
    private String password;

    @Column(name = "DeptNo")
    private String deptno;

    @Column(name = "StaffNo")
    private String staffno;

    @Column(name = "StaffName")
    private String staffname;

    @Column(name = "StaffTitle")
    private String stafftitle;

    @Column(name = "Memo")
    private String memo;

    @Column(name = "Telephone")
    private String telephone;

    @Column(name = "Avatar")
    private String avatar;

    @Column(name = "DefaultTheme")
    private Integer defaulttheme;

    @Column(name = "Creator")
    private String creator;

    @Column(name = "CreateDT")
    private Date createdt;

    @Column(name = "Modifier")
    private String modifier;

    @Column(name = "ModifyDT")
    private Date modifydt;

    @Column(name = "RoleId")
    private Integer roleid;

    @Column(name = "IsDeleted")
    private Boolean isdeleted;

    /**
     * @return Username
     */
    public String getUsername() {
        return username;
    }

    /**
     * @param username
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * @return Password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password
     */
    public void setPassword(String password) {
        this.password = password;
    }

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
     * @return StaffNo
     */
    public String getStaffno() {
        return staffno;
    }

    /**
     * @param staffno
     */
    public void setStaffno(String staffno) {
        this.staffno = staffno;
    }

    /**
     * @return StaffName
     */
    public String getStaffname() {
        return staffname;
    }

    /**
     * @param staffname
     */
    public void setStaffname(String staffname) {
        this.staffname = staffname;
    }

    /**
     * @return StaffTitle
     */
    public String getStafftitle() {
        return stafftitle;
    }

    /**
     * @param stafftitle
     */
    public void setStafftitle(String stafftitle) {
        this.stafftitle = stafftitle;
    }

    /**
     * @return Memo
     */
    public String getMemo() {
        return memo;
    }

    /**
     * @param memo
     */
    public void setMemo(String memo) {
        this.memo = memo;
    }

    /**
     * @return Telephone
     */
    public String getTelephone() {
        return telephone;
    }

    /**
     * @param telephone
     */
    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    /**
     * @return Avatar
     */
    public String getAvatar() {
        return avatar;
    }

    /**
     * @param avatar
     */
    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    /**
     * @return DefaultTheme
     */
    public Integer getDefaulttheme() {
        return defaulttheme;
    }

    /**
     * @param defaulttheme
     */
    public void setDefaulttheme(Integer defaulttheme) {
        this.defaulttheme = defaulttheme;
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

    /**
     * @return RoleId
     */
    public Integer getRoleid() {
        return roleid;
    }

    /**
     * @param roleid
     */
    public void setRoleid(Integer roleid) {
        this.roleid = roleid;
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
}