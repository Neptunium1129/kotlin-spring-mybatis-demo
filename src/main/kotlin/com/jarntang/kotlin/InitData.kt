package com.jarntang.kotlin

import org.apache.ibatis.jdbc.ScriptRunner
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Repository
import org.springframework.util.ResourceUtils
import java.io.File
import javax.sql.DataSource
import kotlin.collections.forEach

/**
 *
 * 描述
 *
 * @author changjiang.tang Date:12/30/15 Time:6:37 PM
 *
 */
@Repository
class InitData  {

    var dataSource: DataSource;

    @Autowired
    constructor(dataSource: DataSource){
        this.dataSource = dataSource
        init()
    }

    fun init() {
        arrayOf("sql/test-schema.sql").forEach { exec(it) }
    }

    fun exec(file: String) {
         val file :File  = ResourceUtils.getFile("classpath:" + file);
        ScriptRunner(dataSource.connection).runScript(file.reader());
    }

}