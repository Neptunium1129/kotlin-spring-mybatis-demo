package com.jarntang.kotlin.controller

import com.jarntang.kotlin.dao.HelloDao
import com.jarntang.kotlin.dao.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller
import org.springframework.ui.ModelMap
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.ResponseBody

/**
 *
 * 描述
 *
 * @author changjiang.tang Date:12/30/15 Time:4:58 PM
 *
 */

@Controller
@RequestMapping("/kotlin")
class HelloWorldController {

    var helloDao : HelloDao<Test>? = null
    @Autowired set

    @ResponseBody
    @RequestMapping(value = "/hello", method = arrayOf(RequestMethod.GET))
    fun kotlinHello(): Any {
        return helloDao!!.findById(1)
    }

}