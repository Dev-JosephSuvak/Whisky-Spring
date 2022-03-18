package com.alcohol.whiskey;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;

/*
Add Data (in form of DB/ ) before building up.
 */

@Getter
@Setter
@Builder
public class Whiskey {

    @Id
    @Column("ID")
    private Integer id;
    @Column("WHISKY_BRAND")
    private String whiskyBrand;
    @Column("WHISKY_NAME")
    private String whiskyName;
    @Column("PROOF")
    private Float proof;
    @Column("TYPE")
    private String type;

}
