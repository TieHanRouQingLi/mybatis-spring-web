package com.mybatis.web.entity;

public class SysDict {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_dict.id
     *
     * @mbggenerated Fri Nov 30 09:48:07 CST 2018
     */
    private Long id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_dict.code
     *
     * @mbggenerated Fri Nov 30 09:48:07 CST 2018
     */
    private String code;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_dict.name
     *
     * @mbggenerated Fri Nov 30 09:48:07 CST 2018
     */
    private String name;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_dict.value
     *
     * @mbggenerated Fri Nov 30 09:48:07 CST 2018
     */
    private String value;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_dict.id
     *
     * @return the value of sys_dict.id
     *
     * @mbggenerated Fri Nov 30 09:48:07 CST 2018
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_dict.id
     *
     * @param id the value for sys_dict.id
     *
     * @mbggenerated Fri Nov 30 09:48:07 CST 2018
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_dict.code
     *
     * @return the value of sys_dict.code
     *
     * @mbggenerated Fri Nov 30 09:48:07 CST 2018
     */
    public String getCode() {
        return code;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_dict.code
     *
     * @param code the value for sys_dict.code
     *
     * @mbggenerated Fri Nov 30 09:48:07 CST 2018
     */
    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_dict.name
     *
     * @return the value of sys_dict.name
     *
     * @mbggenerated Fri Nov 30 09:48:07 CST 2018
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_dict.name
     *
     * @param name the value for sys_dict.name
     *
     * @mbggenerated Fri Nov 30 09:48:07 CST 2018
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_dict.value
     *
     * @return the value of sys_dict.value
     *
     * @mbggenerated Fri Nov 30 09:48:07 CST 2018
     */
    public String getValue() {
        return value;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_dict.value
     *
     * @param value the value for sys_dict.value
     *
     * @mbggenerated Fri Nov 30 09:48:07 CST 2018
     */
    public void setValue(String value) {
        this.value = value == null ? null : value.trim();
    }
}