package com.fastcode.dvdrental.addons.reporting.application.report.dto;

import java.time.*;
import lombok.Getter;
import lombok.Setter;
import org.json.simple.JSONObject;

@Getter
@Setter
public class ReportDetailsOutput {

    private Long id;
    private Boolean isPublished;
    private String ctype;
    private String description;
    private JSONObject query;
    private String reportType;
    private String title;
    private String reportVersion;
    private String reportWidth;
    private Long userId;
    private String ownerDescriptiveField;
}
