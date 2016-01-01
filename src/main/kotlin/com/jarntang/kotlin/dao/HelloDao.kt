package com.jarntang.kotlin.dao

/**
 *
 * 描述
 *
 * @author changjiang.tang Date:12/30/15 Time:6:18 PM
 *
 */
interface HelloDao<T> {

    fun findById(id: Long): T

}