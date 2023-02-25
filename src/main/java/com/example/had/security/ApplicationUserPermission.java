package com.example.had.security;

public enum ApplicationUserPermission {
//    STUDENT_READ("student:read"),
//    STUDENT_WRITE("student:write"),
//    COURSE_READ("course:read"),
//    COURSE_WRITE("course:write");

    DOCTOR_READ("doctor:read"),
    DOCTOR_WRITE("doctor:write"),
    USER_READ("user:read"),
    USER_WRITE("user:write"),
    QUESTION_READ("question:read"),
    QUESTION_WRITE("question:write"),
    ARTICLE_READ("article:read"),
    ARTICLE_WRITE("article:write"),
    CHAT_READ("chat:read"),
    CHAT_WRITE("chat:write"),
    REPORT_READ("report:read"),
    REPORT_WRITE("report:write");

    private final String permission;

    ApplicationUserPermission(String permission) {
        this.permission = permission;
    }

    public String getPermission() {
        return permission;
    }
}
