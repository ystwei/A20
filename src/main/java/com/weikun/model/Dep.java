package com.weikun.model;

public class Dep {
    private Integer deptno;
    private Object list;

    public Object getList() {
        return list;
    }

    public void setList(Object list) {
        this.list = list;
    }

    private String deptname;

    public Integer getDeptno() {
        return deptno;
    }

    public void setDeptno(Integer deptno) {
        this.deptno = deptno;
    }

    public String getDeptname() {
        return deptname;
    }

    public void setDeptname(String deptname) {
        this.deptname = deptname == null ? null : deptname.trim();
    }
}