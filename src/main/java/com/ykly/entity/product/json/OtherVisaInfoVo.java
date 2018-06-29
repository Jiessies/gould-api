package com.ykly.entity.product.json;

import com.ykly.entity.product.ProductMontageDetail;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.Map;

/**
 * Created by huangmingjie on 2018/3/10.
 */
@ApiModel(value = "其他-签证信息")
public class OtherVisaInfoVo implements ProductMontageDetail {
    
    @ApiModelProperty(value = "身份类型",example = "身份类型(String)")
    private String identityType;
    
    @ApiModelProperty(value = "需提交材料",example = "需提交材料(String)")
    private String materialScience;
    
    @ApiModelProperty(value = "详细说明",example = "详细说明(String)")
    private String description;
    
    @ApiModelProperty(value = "是否上传电子邮件",example = "是否上传电子邮件：1是 2否(String)")
    private String isUploadingFiles;
    
    public String getIdentityType() {
        return identityType;
    }
    
    public void setIdentityType(String identityType) {
        this.identityType = identityType;
    }
    
    public String getMaterialScience() {
        return materialScience;
    }
    
    public void setMaterialScience(String materialScience) {
        this.materialScience = materialScience;
    }
    
    public String getDescription() {
        return description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }
    
    public String getIsUploadingFiles() {
        return isUploadingFiles;
    }
    
    public void setIsUploadingFiles(String isUploadingFiles) {
        this.isUploadingFiles = isUploadingFiles;
    }
    
    @Override
    public Map<String, Object> getMontageDetai() {
        return null;
    }
}
