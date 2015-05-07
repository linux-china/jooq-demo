package org.mvnsearch.domain.model.language;

/**
 * Language
 *
 * @author linux_china
 */
public class Language {
    private Integer id;
    private String cd;
    private String description;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCd() {
        return cd;
    }

    public void setCd(String cd) {
        this.cd = cd;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
