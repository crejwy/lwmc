package com.lwmc.entity;

import com.core.base.BaseEntity;
import java.util.Date;
import javax.persistence.*;

@Table(name = "dim_commoncode")
public class DimCommoncode extends BaseEntity {
    @Id
    @Column(name = "ItemNo")
    private Short itemno;

    @Column(name = "ItemName")
    private String itemname;

    @Column(name = "ItemType")
    private Byte itemtype;

    @Column(name = "TypeName")
    private String typename;

    @Column(name = "Creator")
    private String creator;

    @Column(name = "CreateDT")
    private Date createdt;

    @Column(name = "Modifier")
    private String modifier;

    @Column(name = "ModifyDT")
    private Date modifydt;

    @Column(name = "IsDeleted")
    private Boolean isdeleted;

    /**
     * @return ItemNo
     */
    public Short getItemno() {
        return itemno;
    }

    /**
     * @param itemno
     */
    public void setItemno(Short itemno) {
        this.itemno = itemno;
    }

    /**
     * @return ItemName
     */
    public String getItemname() {
        return itemname;
    }

    /**
     * @param itemname
     */
    public void setItemname(String itemname) {
        this.itemname = itemname;
    }

    /**
     * @return ItemType
     */
    public Byte getItemtype() {
        return itemtype;
    }

    /**
     * @param itemtype
     */
    public void setItemtype(Byte itemtype) {
        this.itemtype = itemtype;
    }

    /**
     * @return TypeName
     */
    public String getTypename() {
        return typename;
    }

    /**
     * @param typename
     */
    public void setTypename(String typename) {
        this.typename = typename;
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