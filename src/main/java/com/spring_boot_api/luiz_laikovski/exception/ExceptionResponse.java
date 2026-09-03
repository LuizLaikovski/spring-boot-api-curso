package com.spring_boot_api.luiz_laikovski.exception;

import java.util.Date;

public record ExceptionResponse(Date timestamp, String message, String description) {}