package jp.co.worksap.oss.findbugs.jpa;

import javax.persistence.Column;

public class ColumnWithNullable {
    @Column(nullable = false)
    private String name;

    public String getName() {
        return name;
    }
}
