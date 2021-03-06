/*
 * This is a simple web application utilizing Spring MVC and Hibernate.
 * Developed by Lv-205 group of Softserve Academy.
 * 
 * Copyright (c) 1993-2016 Softserve, Inc.
 * This software is the confidential and proprietary information of Softserve.
 * 
 */
package com.softserve.museum.dao.generic;

import java.util.List;

import com.softserve.museum.domain.Technique;

/**
 * 
 * Establish contract for Technique class CRUD operations.
 * 
 * @author Kostyantyn Panchenko
 * @version 1.0
 * @since 15.10.2016
 *
 */
public interface TechniqueDAO extends GenericDAO<Technique, Integer> {

    /**
     * Finds all techniques by given technique's name.
     * @param technique technique's name
     * @return list of all techniques
     */
    public abstract List<Technique> findTechniqueByName(String technique);

}
