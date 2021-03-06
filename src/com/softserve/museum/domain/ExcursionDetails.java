/*
 * This is a simple web application utilizing Spring MVC and Hibernate.
 * Developed by Lv-205 group of Softserve Academy.
 * 
 * Copyright (c) 1993-2016 Softserve, Inc.
 * This software is the confidential and proprietary information of Softserve.
 * 
 */
package com.softserve.museum.domain;

import java.time.LocalTime;

import javax.persistence.Column;
import javax.persistence.Convert;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.softserve.museum.utils.LocalTimeConverter;

/**
 * 
 * Entity class, represents museum's guide.
 * 
 * @author Kostyantyn Panchenko
 * @version 1.0
 * @since 22.10.2016
 *
 */
@Entity
@Table(name = "excursion_details")
public class ExcursionDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    @Column(name = "name")
    private String name;
    
    @Column
    @Convert(converter = LocalTimeConverter.class)
    private LocalTime duration;
    
    @Column
    private long durationSec;

    /**
     * Default no-args constructor
     */
    public ExcursionDetails() { }

    public final int getId() {
        return id;
    }

    public final void setId(int id) {
        this.id = id;
    }

    public final String getName() {
        return name;
    }

    public final void setName(String name) {
        this.name = name;
    }

    public final LocalTime getDuration() {
        return duration;
    }

    public final void setDuration(LocalTime duration) {
        this.duration = duration;
    }
    
    public final long getDurationSec() {
        return durationSec;
    }

    public final void setDuration(long duration) {
        this.durationSec = duration;
    }
}
