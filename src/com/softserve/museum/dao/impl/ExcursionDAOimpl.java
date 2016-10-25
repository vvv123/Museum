/*
 * This is a simple web application utilizing Spring MVC and Hibernate.
 * Developed by Lv-205 group of Softserve Academy.
 * 
 * Copyright (c) 1993-2016 Softserve, Inc.
 * This software is the confidential and proprietary information of Softserve.
 * 
 */
package com.softserve.museum.dao.impl;

import java.sql.Time;
import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Criteria;
import org.hibernate.criterion.Expression;
import org.springframework.stereotype.Repository;

import com.softserve.museum.dao.generic.ExcursionDAO;
import com.softserve.museum.domain.Excursion;

/**
 * 
 * DAO class for Excursion entity.
 * 
 * @author Kostyantyn Panchenko
 * @version 1.0
 * @since 19.10.2016
 *
 */
@SuppressWarnings("deprecation")
@Repository
@Transactional
public class ExcursionDAOimpl extends AbstractDAO<Excursion, Integer>
        implements ExcursionDAO {

    protected ExcursionDAOimpl() {
        super(Excursion.class);
    }

	@SuppressWarnings("unchecked")
    @Override
    public List<Excursion> findExcursionByTime(Time start, Time end) {
		Criteria criteria = sessionFactory.getCurrentSession().createCriteria(Excursion.class);
		criteria.add(Expression.ge("start", start));
		criteria.add(Expression.le("start", start));
		return criteria.list();
    }

    @Override
    public List<Excursion> findExcursionByStart(Time start) {
        // TODO Auto-generated method stub
        return null;
    }

}
