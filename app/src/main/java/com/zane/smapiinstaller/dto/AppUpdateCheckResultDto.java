package com.zane.smapiinstaller.dto;

import lombok.Data;

@Data
public class AppUpdateCheckResultDto {
    /**
     * 版本号
     */
    private long versionCode;
    /**
     * 版本名称
     */
    private String versionName;
}
