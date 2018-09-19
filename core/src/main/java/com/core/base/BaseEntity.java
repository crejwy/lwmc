package com.core.base;


import javax.persistence.Column;
import java.util.Date;

public class BaseEntity{
    /**
     * 由谁创建
     */
    @Column(name = "Creator")
    private String creator;
    /**
     * 创建时间
     */
    @Column(name = "CreateDT")
    private Date createdt;

    /**
     * 最后修改者
     */
    @Column(name = "Modifier")
    private String modifier;


    /**
     * 最后修改时间
     */
    @Column(name = "ModifyDT")
    private Date modifydt;
    /**
     * 是否逻辑删除
     */
    @Column(name = "IsDeleted")
    private Boolean isdeleted;

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public Date getCreatedt() {
        return createdt;
    }

    public void setCreatedt(Date createdt) {
        this.createdt = createdt;
    }

    public String getModifier() {
        return modifier;
    }

    public void setModifier(String modifier) {
        this.modifier = modifier;
    }

    public Date getModifydt() {
        return modifydt;
    }

    public void setModifydt(Date modifydt) {
        this.modifydt = modifydt;
    }

    public Boolean getIsdeleted() {
        return isdeleted;
    }

    public void setIsdeleted(Boolean isdeleted) {
        this.isdeleted = isdeleted;
    }
}
