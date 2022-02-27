package kr.or.connect.jdbcexam.dto;

public class Role {
    private Integer rolId;
    private String  description;

    public Role() {}

    public Role(Integer rolId, String description) {
        super();
        this.rolId = rolId;
        this.description = description;
    }

    public Integer getRolId() {
        return rolId;
    }

    public void setRolId(Integer rolId) {
        this.rolId = rolId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Role{" +
                "rolId=" + rolId +
                ", description='" + description + '\'' +
                '}';
    }
}
